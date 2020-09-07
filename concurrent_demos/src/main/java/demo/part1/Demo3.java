package demo.part1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Classname Demo3
 * @Description 创建线程，方法3：FutureTask 配合 Thread
 * @Date 2020/7/25 21:55
 * @Author 曹珂
 */
public class Demo3 {
    public static void main(String[] args) {
        FutureTask<Integer> task = new FutureTask<>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("thread running");
                Thread.sleep(2000);//休眠2s
                return 100;
            }
        });
        //FutureTask实现了runnable接口，自然可以作为参数传入
        Thread t1 = new Thread(task, "t1");
        t1.start();
        try {
            System.out.println(task.get());//获得task回调返回值，在休眠两秒后获得
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
