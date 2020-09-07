package demo.part1;

/**
 * @Classname Demo4
 * @Description 多线程交替执行
 * @Date 2020/7/25 22:38
 * @Author 曹珂
 */
public class Demo4 {
    public static void main(String[] args) {
        new Thread(()->{
            while (true){
                System.out.println("t1....start");
            }
        },"t1").start();

        new Thread(()->{
            while (true){
                System.out.println("t2....start");
            }
        },"t2").start();
    }
}
