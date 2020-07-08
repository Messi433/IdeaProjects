package part1_memory_structure;

import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * @Description 模拟演示直接内存被回收
 */
public class Demo19 {
    static int _1G = 1024 * 1024 * 1024;
    public static void main(String[] args) throws IOException {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(_1G);//分配1G，观察任务管理器，不要用java工具，java不管直接内存
        System.out.println("分配完毕");
        System.in.read();//回车继续执行
        System.out.println("开始释放");
        byteBuffer = null;//对象置空
        System.gc();//垃圾回收
    }
}
 