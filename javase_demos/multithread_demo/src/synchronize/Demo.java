package synchronize;

/**
 * 模拟卖票案例
 * 创建三个线程，同时开启，对共享的票进行出售
 */
public class Demo {
    public static void main(String[] args) {
        //创建线程任务对象
        Ticket ticket = new Ticket();
        //创建三个窗口对象，target:即为线程目标
        Thread t1 = new Thread(ticket, "窗口1");
        Thread t2 = new Thread(ticket, "窗口2");
        Thread t3 = new Thread(ticket, "窗口3");
        //同时卖票
        t1.start();
        t2.start();
        t3.start();
    }
}