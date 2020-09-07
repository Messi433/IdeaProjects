package demo.part1;

import java.io.IOException;
import java.util.Vector;

/**
 * @Classname Demo10
 * @Description TODO
 * @Date 2020/8/18 10:44
 * @Author 曹珂
 */
public class Demo10 {
    /*public static void test() {
        Vector<Dog> list = new Vector<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 30; i++) {
                Dog d = new Dog();
                list.add(d);
                synchronized (d) {
                    log.debug(i + "\t" + ClassLayout.parseInstance(d).toPrintableSimple(true));
                }
            }
            synchronized (list) {
                list.notify();
            }
        }, "t1");
        t1.start();
        Thread t2 = new Thread(() -> {
            synchronized (list) {
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            log.debug("===========> ");
            for (int i = 0; i < 30; i++) {
                Dog d = list.get(i);
                log.debug(i + "\t" + ClassLayout.parseInstance(d).toPrintablesimple(true));
                synchronized (d) {
                    log.debug(i + "\t" + ClassLayout.parseInstance(d).toPrintablesimple(true));
                    log.debug(i + "\t" + ClassLayout.parseInstance(d).toPrintableSimple(true));
                }
            }
        }, "t2");
        t2.start();
    }*/
}
