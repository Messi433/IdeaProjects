package anonymous;

/*
    匿名内部类方式实现线程的创建
    -匿名:没有名字
    -内部类:写在其他类内部的类
    -匿名内部类作用:简化代码,把子类继承父类,重写父类的方法,创建子类对象合为一步完成，
     把实现类实现类接口, 重写接口中的方法,创建实现类对象合成一步完成
    -匿名内部类的最终产物:子类/实现类对象,而这个类没有名字
    格式:
    new  父类/接口(){
        重复父类/接口中的方法
    };
 */

public class AnonymousInner {
    public static void main(String[] args) {
        //继承方式
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + " Thread--> " + i);
                }
            }
        }.start();
        //实现接口方式
        Runnable r = new Runnable() {
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + " Runnable--> " + i);
                }
            }
        };
        new Thread(r,"普莱斯").start();
        //简化接口方式
        new Thread( new Runnable() {
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + " Runnable2--> " + i);
                }
            }
        },"肥皂").start();
    }
}
