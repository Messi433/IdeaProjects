package part2_garbage_collection;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description 演示软引用，配合软引用队列;
 * @PS 引用队列的作用：对象被垃圾回收时，没人引用软、弱、虚、终这些中介对象，则进入引用队列
 * @Setting -Xmx20m -XX:+PrintGCDetails -verbose:gc
 */
public class Demo3 {
    private static final int _4MB = 4 * 1024 * 1024;

    public static void main(String[] args) {
        soft();
    }

    /***
     * @Description 演示软引用
     */
    public static void soft() {
        List<SoftReference<byte[]>> list = new ArrayList<>();//list -> SoftReference -> byte[]，引用过程
        ReferenceQueue<byte[]> queue = new ReferenceQueue<>();//引用队列
        for (int i = 0; i < 5; i++) {
            //byte对象包装成软引用类型
            SoftReference<byte[]> reference = new SoftReference<>(new byte[_4MB], queue);
            System.out.println(reference.get());//打印软引用包装的对象
            list.add(reference);
            //期间会触发垃圾回收，使得软引用对象(中介)进入引用队列
            System.out.println(list.size());
        }
        Reference<? extends byte[]> poll = queue.poll();//获得最先进入队列的软引用对象
        //poll不为空，说明引用队列不为空
        while (poll != null) {
            list.remove(poll);//对象集合中，移除没被引用的软引用对象
            poll = queue.poll();
        }
        System.out.println("循环结束：" + list.size());
        //配合引用队列后，不会打印null值了，因为软引用对象被回收了，只有没被垃圾回收的对象及其引用的软引用对象
        for (SoftReference<byte[]> reference : list) {
            System.out.println(reference.get());//打印软引用包装的对象，部分为null，被垃圾回收了
        }
    }
}
