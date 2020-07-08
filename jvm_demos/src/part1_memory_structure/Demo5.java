package part1_memory_structure;

import java.util.ArrayList;
import java.util.List;

/**
 * Java11： java.lang.OutOfMemoryError: Overflow: String length out of range
 * Java8： java.lang.OutOfMemoryError: Java heap space
 */
public class Demo5 {
    public static void main(String[] args) {
        int i = 0;
        try {
            List<String> list = new ArrayList<>();
            String a = "hello";
            while (true) {
                list.add(a); // hello,hellohello,hellohellohellohello
                a = a + a; //hellohellohellohello
                i++;
            }
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println(i);
        }
    }
}

