package tcp.fileupload;

import java.io.*;
import java.net.Socket;

/*
    文件上传案例的客户端:读取本地文件,上传到服务器,读取服务器回写的数据
    明确:
        数据源:/Users/messi433/Downloads/test/file1.java
        目的地:服务器
    实现步骤:
        1.创建一个本地字节输入流FileInputStream对象,构造方法中绑定要读取的数据源
        2.创建一个客户端Socket对象 ,构造方法中绑定服务器的IP地址和端口号
        3.使用Socket中的方法getOutputStream,获取网络字节输出流OutputStream对象
        4.使用本地字节输入流FileInputStream对象中的方法read,读取本地文件
        5.使用网络字节输出流OutputStream对象中的方法write,把读取到的文件，上传到服务器
        6.使用Socket中的方法getInputStream,获取网络字节输入流InputStream对象
        7.使用网络字节输入流InputStream对象中的方法read读取服务回写的数据
        8.释放资源(FileInputStream, Socket)
 */
public class FileTCPClient {
    public static void main(String[] args) throws IOException {
        //1.创建一个本地字节输入流FileInputStream对象,构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("/Users/messi433/Downloads/test/file1.java");
        //2.创建一个客户端Socket对象 ,构造方法中绑定服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1", 8888);
        //3.使用Socket中的方法getOutputStream,获取网络字节输出流OutputStream对象
        OutputStream os = socket.getOutputStream();
        //4.使用本地字节输入流FileInputStream对象中的方法read,读取本地文件 **不熟
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1){
            //5.使用网络字节输出流OutputStream对象中的方法write,把读取到的文件，上传到服务器
            os.write(bytes,0,len);
        }
        /**
         * 问题：无法读取到-1，会出现死循环状态，后面代码无法运行，程序无法终止
         * 解决：上传完文件，给服务器写一个结束标记
         * void shutdownOutput()禁用此套接字输出流
         * 对于TCP套接字,任何以前写入的数据都将被发送，并且后跟TCP的正常连接终止序列。
         */
        socket.shutdownOutput();
        //6.使用Socket中的方法getInputStream,获取网络字节输入流InputStream对象
        InputStream is = socket.getInputStream();
        //7.使用网络字节输入流InputStream对象中的方法read读取服务回写的数据
        while ((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
        //8.释放资源
        fis.close();
        socket.close();
        //第一个while判断时为-1就直接停止循环了-1从一开始就没有写给服务器
    }
}
