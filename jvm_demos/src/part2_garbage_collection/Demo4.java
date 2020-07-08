package part2_garbage_collection;

import java.util.ArrayList;

/**
 * @Description 测试子线程内存溢出时是否会导致整个Java程序报错
 */
public class Demo4 {
    private static final int _8MB = 8 * 1024 *1024;
    //-Xms20M -Xmx20M -Xmn10M -XX:+UseSerialGC -XX:+PrintGCDetails -verbose:gc
    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            ArrayList<byte[]> list= new ArrayList<>();
            list.add(new byte[_8MB]);
            list.add(new byte[_8MB]);
        }).start();
        //下述代码若取消睡眠后，则不影响整个程序
        System.out.println("sleep.........");
        Thread.sleep(100000000L);
    }
}
