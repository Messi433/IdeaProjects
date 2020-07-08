package part2_garbage_collection;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description 演示软引用：网上浏览图片，会存储到缓存中，此时若图片对象采用了强引用，会造成内存溢出
 * @Setting -Xmx20m -XX:+PrintGCDetails -verbose:gc
 */
public class Demo2 {
    private static final int _4MB = 4 * 1024 * 1024;

    public static void main(String[] args) throws IOException {
        //hard();//java.lang.OutOfMemoryError: Java heap space
        System.in.read();
        soft();
    }

    /***
     * @Description 演示强引用
     */
    public static void hard() {
        List<byte[]> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new byte[_4MB]);
        }
    }

    /***
     * @Description 演示软引用
     */
    public static void soft() {
        List<SoftReference<byte[]>> list = new ArrayList<>();//list -> SoftReference -> byte[]，引用过程
        for (int i = 0; i < 5; i++) {
            //byte对象包装成软引用类型
            SoftReference<byte[]> reference = new SoftReference<>(new byte[_4MB]);
            System.out.println(reference.get());//打印软引用包装的对象
            list.add(reference);
            System.out.println(list.size());
        }
        System.out.println("循环结束：" + list.size());
        for (SoftReference<byte[]> reference : list) {
            System.out.println(reference.get());//打印软引用包装的对象，部分为null，被垃圾回收了
        }
    }
}
