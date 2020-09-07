package demo.part1;

import lombok.extern.slf4j.Slf4j;

/**
 * @Classname Demo1
 * @Description 实现Runnable接口，用lambda简化
 * @Date 2020/7/21 22:38
 * @Author 曹珂
 */
@Slf4j(topic = "test2")
public class Demo2 {
    public static void main(String[] args) {
        /*Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("run1");
            }
        };*/

        //lambda表达式简化
        Runnable r = () ->{
            //里面的抽象方法run也省略了(因为只有一个run)
            System.out.println("lambda run");
        };
        Thread t = new Thread(r,"t1");
        t.start();
    }
}
