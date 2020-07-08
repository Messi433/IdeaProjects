package thread;

/**
 * 写的死循环 => 体现抢占式线程调度，随机打印的效果
 */
public class MyThread2 extends Thread {
    /*
      利用继承中的特点
      将线程名称传递 进行设置
      */
    public MyThread2(String name){
        super(name);
    }
    /*
       重写run方法
       定义线程要执行的代码
      */
    public void run(){
        int i = 0;
        while (true){
            //getName()方法 来自父亲
            System.out.println(getName() + ++i);
        }
    }
}

