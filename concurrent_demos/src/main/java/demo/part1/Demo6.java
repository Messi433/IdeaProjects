package demo.part1;

import java.util.concurrent.TimeUnit;

/**
 * @Classname Demo6
 * @Description Run与Start
 * @Date 2020/8/2 19:19
 * @Author 曹珂
 */
public class Demo6 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread("t1") {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        t1.run();//main线程执行run代码，而t1线程不执行，非异步状态
    }
   
}
