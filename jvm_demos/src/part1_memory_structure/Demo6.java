package part1_memory_structure;

/**
 * 演示内存创建，内存置空null时，堆内存的使用情况
 */
public class Demo6 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("1...");
        Thread.sleep(30000);
        byte[] array = new byte[1024 * 1024 * 10];//10Mb
        System.out.println("2...");
        Thread.sleep(30000);
        array = null; // array置空，没有引用 => 变为"垃圾"
        System.gc(); //垃圾回收
        System.out.println("3...");
        Thread.sleep(1000000L);
    }
}
