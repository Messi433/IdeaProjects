package part1_memory_structure;

/**
 * 演示字符串字面量也是[延迟]成为对象的，shift + F8 => Step out(下一个断点)
 */
public class Demo11 {
    public static void main(String[] args) {
        int x = args.length;
        System.out.println(); //字符串个数1227
        /* 1-0 字符串池初始没有 */
        System.out.print("1");
        System.out.print("2"); //1228
        System.out.print("3");
        System.out.print("4");
        System.out.print("5");
        System.out.print("6");
        System.out.print("7");
        System.out.print("8");
        System.out.print("9");
        System.out.print("0"); //1236
        /*剩下的就没有变化了*/
        System.out.print("1");
        System.out.print("2");
        System.out.print("3");
        System.out.print("4");
        System.out.print("5");
        System.out.print("6");
        System.out.print("7");
        System.out.print("8");
        System.out.print("9");
        System.out.print("0");
    }
}

