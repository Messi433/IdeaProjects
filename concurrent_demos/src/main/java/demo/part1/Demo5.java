package demo.part1;

/**
 * @Classname Demo5
 * @Description 栈与栈帧
 * @Date 2020/8/1 10:15
 * @Author 曹珂
 */
public class Demo5 {
    public static void main(String[] args) {
        method1(10);
    }

    public static void method1(int x) {
        int y = x + 1;
        Object m = method2();
        System.out.println(m);
    }
    public static Object method2(){
        Object n = new Object();
        return n;
    }
}
