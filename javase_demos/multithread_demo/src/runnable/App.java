package runnable;

public class App {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr,"自定义线程");
        t.start();
        for (int i = 0; i < 20; i++) {

        }
    }
}
