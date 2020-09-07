package demo.part1;

/**
 * @Classname Demo9
 * @Description 烧水泡茶统筹案例
 * @Date 2020/8/13 20:08
 * @Author 曹珂
 */
public class Demo9 {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println("洗水壶");
            //调用sleep(1)，模拟洗水壶1分钟

            /*-------穿行操作---------*/

            System.out.println("烧水");
            //调用sleep(15)，模拟烧水15分钟
        },"t1");
        Thread t2 = new Thread(()->{
            System.out.println("洗茶壶、洗茶杯、拿茶叶 4分钟");
            //调用sleep(4)，模拟洗茶壶、洗茶杯、拿茶叶 4分钟
            try {
                t1.join();//t2先执行完，所以等待t1完事，再继续执行
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t2");

        String test = "test";
        char value[];
    }
}
