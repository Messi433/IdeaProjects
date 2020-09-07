package demo.part1;

/**
 * @Classname Demo8
 * @Description TODO
 * @Date 2020/8/6 15:35
 * @Author 曹珂
 */
public class Demo8 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            while (true){
                //当打断标记true时，才会break
                if (Thread.currentThread().isInterrupted()){
                    break;
                }
                //代码逻辑
                System.out.println("t1结束");
            }
        },"t1");
        t1.start();

        Thread.sleep(1000);
        System.out.println("程序结束");
    }
}
