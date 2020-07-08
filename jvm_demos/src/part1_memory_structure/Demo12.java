package part1_memory_structure;

//Demo演示2 =>最终串池：["ab","a", "b"]
public class Demo12 {
    /*public static void main(String[] args) {
        String x = "ab";//["ab"]
        //堆new String("a")+new String("b") => new String( "ab ")
        String s = new String("a") + new String("b");
        //obj.intern()将这个字符串对象尝试放入串池,如果有则并不会放入,如果没有则放入串池，会把串池中的对象返回
        String s2 = s.intern(); //s("ab")是存放在堆中新的对象，但是串池中已经有"ab"，所以s2是返回的串池中的字符串
        System.out.println(s2 == x); //true
        System.out.println(s == x); //flase

    }*/

    /**
     * jdk 1.6
     * @param args
     */
    public static void main(String[] args) {
        //堆new String("a")+new String("b") => new String( "ab ") => ["a","b"]
        String s = new String("a") + new String("b");
        //obj.intern()将这个字符串对象尝试放入串池,如果有则并不会放入,如果没有则"拷贝"一份放入串池，会把串池中的对象返回
        String s2 = s.intern(); //返回串池中拷贝的字符串对象
        String x = "ab";
        System.out.println(s2 == x); //true
        System.out.println(s == x); //flase
    }
}
