package demo.part1;

import java.util.concurrent.locks.LockSupport;

/**
 * @Classname Demo11
 * @Description TODO
 * @Date 2020/8/21 18:43
 * @Author 曹珂
 */
public class Demo11 {
    static Thread t1, t2, t3;

    /*public static void test() {
        Vector<Dog> list = new Vector<>();
        int loopNumber = 39;
        t1 = new Thread(() -> {
            for (int i = 0; i < loopNumber; i++) {
                Dog d = new Dog();
                list.add(d);
                //39个对象加上偏向锁，偏向t1线程
                synchronized (d) {
                    log.debug(i + "\t" + ClassLayout.parseInstance(d).toPrintableSimple(true));
                }
                //39个对象加完锁唤醒t2(park，unpark方式)
                LockSupport.unpark(t2);
            }
        }, "t1");
        t1.start();
        t2 = new Thread(() -> {
            LockSupport.park();//先阻塞自己
            log.debug("============> ");
            for (int i = 0; i < loopNumber; i++) {
                Dog d = list.get(i);//拿出list对象
                Log.debug(i + "\t" + ClassLayout.parseInstance(d).toPrintableSimple(true));
                //对象加上偏向锁，偏向t2线程
                //前19个对象是撤销t1偏向锁，之后对象是批量重偏向
                synchronized (d) {
                    Log.debug(i + "\t" + ClassLayout.parseInstance(d).toPrintablesimple(true));
                }
                Log.debug(i + "\t" + ClassLayout.parseInstance(d).toPrintableSimple(true));
            }
            //此时已经重偏向了20次
            LockSupport.unpark(t3);//唤醒t3

        }, "t2");
        t2.start();
        t3 = new Thread(() -> {
            LockSupport.park();//先阻塞自己
            log.debug("============> ");
            for (int i = 0; i < loopNumber; i++) {
                Dog d = list.get(i);//拿出list对象
                Log.debug(i + "\t" + ClassLayout.parseInstance(d).toPrintableSimple(true));
                //对象加上偏向锁，偏向t3线程
                //前19个对象是撤销t2偏向锁，注意：之后对象也是撤销t2偏锁，没那么多机会重偏向锁了
                synchronized (d) {
                    Log.debug(i + "\t" + ClassLayout.parseInstance(d).toPrintablesimple(true));
                }
                Log.debug(i + "\t" + ClassLayout.parseInstance(d).toPrintableSimple(true));
            }
            //最后撤销偏向锁达到39次
        }, "t3");
        t3.start();

        t3.join();
        *//*
         当撤销偏向锁阈值超过40次后，jvm会这样觉得，自己确实偏向错了，根本就不该偏向。
         于是整个类的所有对象都会变为不可偏向的，新建的对象也是不可偏向的，所以new Dog()是不可偏向的
        *//*
        Log.debug(ClassLayout.parseInstance(new Dog()).toPrintableSimple(true));
    }*/
}
