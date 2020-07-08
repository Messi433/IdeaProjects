package part1_memory_structure;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description 模拟直接内存的内存溢出
 */
public class Demo18 {
    static int _100Mb = 1024 * 1024 * 100;
    /***
     * @Description Exception in thread "main" java.lang.OutOfMemoryError: Direct buffer memory
     */
    public static void main(String[] args) {
        List<ByteBuffer> list = new ArrayList<>();
        int i = 0;
        try{
            while (true){
                ByteBuffer byteBuffer = ByteBuffer.allocateDirect(_100Mb);//分配100M
                list.add(byteBuffer);
            }
        }finally {
            System.out.println(i);
        }
        //方法区是jvm规范，jdk6 中对方法区的实现称为永久代
        //jdk8 对方法区的实现称为元空间
    }
}
