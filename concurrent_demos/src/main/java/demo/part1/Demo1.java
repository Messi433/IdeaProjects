package demo.part1;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname Demo1
 * @Description 实现Runnable接口，用lambda简化
 * @Date 2020/7/21 22:38
 * @Author 曹珂
 */
@Slf4j(topic = "test1")
public class Demo1 {
    public static void main(String[] args) {

        Thread t = new Thread("t1"){
            @Override
            public void run() {
                System.out.println(this.getName()+"  running!!!!");
//                Log.debug("running!!!!");
            }
        };
        t.start();
//        Log.debug("running!!!!");
        System.out.println("running!!!!");
    }
}
