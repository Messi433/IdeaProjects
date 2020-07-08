package part2_garbage_collection;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Demo1
 * @Description 演示GC Roots
 * @Date 2020/6/8 22:00
 * @Author 曹珂
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        List<Object> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        System.out.println("1");
        System.in.read();
        list1 = null;
        System.out.println(2);
        System.in.read();
        System.out.println("end");
    }

}
