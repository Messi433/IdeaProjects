package thread;

/**
 * 继承Thread类方式启动多线程 => 非抢占性
 */
public class MyThread extends Thread{
    public MyThread(String name){
        super(name); //父类构造方法
    }

    @Override
    public void run() {
        /*重写run()*/
        super.run();
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+" 正在执行 "+i);
        }
    }
}
