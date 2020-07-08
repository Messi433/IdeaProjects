package tcp.bs_demo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 模拟服务器，客户端是浏览器 => 模拟B/S架构
 */
public class BSServer {
    public static void main(String[] args) throws IOException {
        //1.创建ServerSocket对象，指定端口
        ServerSocket serverSocket = new ServerSocket(8888);

        /*
            出现的bug：浏览器不显示图片
                浏览器解析服务器回写的html页面，页面中如果有图片,那么浏览器就会单独的开启一个线程 ,读取服务器的图片
                我们就的让服务器一直处于监听状态， 客户端请求一次, 服务器就回写一次
             解决方法：如文件上传案例 => while(true){new Thread(new Runnable(){...}).start()}
         */

        //2.ServerSocket对象.accept() => 获取客户端的socket对象
        Socket socket = serverSocket.accept();
        //3.socket调用getInputStream()获取网络输入流对象is
        InputStream is = socket.getInputStream();
        //4.is调用read方法读取客户端的请求信息
        /*
        int len = 0;
        byte bytes[] = new byte[1024];
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        */
        //把is网络字节输入流对象,转换为字符缓冲输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        //把客户端请求信息的第一行读取出来 GET / 11_Net/web/index.html HTTP/1.1
        String line = br.readLine();
        //把读取的信息进行切割，只要中间部分 /11_Net/web/index. html
        String[] arr = line.split(" "); //截取空格，分成字符串数组
        //把路径前边的/去掉,进行截取11_Net/web/index. htmL
        String htmlpath = arr[1].substring(1); //数组第二个元素截取第一个字符 => 即'/'
        //创建一个本地字节输入流,构造方法中绑定要读取的html路径
        FileInputStream fis = new FileInputStream(htmlpath);
        //使用Socket中的方法getOutputStream获取网络字节输出流OutputStream对象
        OutputStream os = socket.getOutputStream();
        //写入HTTP协议响应头,固定写法
        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        os.write("Content-Type:text/html\r\n".getBytes());
        //必须要写入空行,否则浏览器不解析
        os.write(" \r\n".getBytes());
        //一读一写复制文件,把服务读取的html文件回写到客户端是
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }
        //释放资源
        fis.close();
        socket.close();
        serverSocket.close();
    }
}
