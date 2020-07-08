package synchronize;

/**
 * 同步代码块，类似于操作系统中的PV操作代码
 */
public class Ticket implements Runnable {
    private int ticket = 100;
    Object lock = new Object();//创建锁对象

    //执行卖票操作
    @Override
    public void run() {
        //每个窗口卖票的操作
        //窗口 永远开启
        while (true) {
            synchronized (lock) {//同步代码块
                if (ticket > 0) {
                    //有票 可以卖
                    //出票操作 //使用sleep模拟一下出票时间
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto‐generated catch block
                        e.printStackTrace();
                    }
                    //获取当前线程对象的名字
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在卖:" + ticket--);
                }
            }
        }
    }
}