package thread;

public class App1 {
    public static void main(String[] args) {
        MyThread mt = new MyThread("第一个线程--");
        mt.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程--正在执行 "+i);
        }
    }
}
