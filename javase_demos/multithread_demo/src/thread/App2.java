package thread;

public class App2 {
    public static void main(String[] args) {
        System.out.println("这里是main线程");
        MyThread2 mt2 = new MyThread2("小强");
        mt2.start();//开启了一个新的线程
        int i = 0;
        while (true){
            System.out.println("旺财:" + ++i);
        }
    }
}
