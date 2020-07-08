package part1_memory_structure;

public class Demo9 {
    public static void main(String[] args) {
        String s1 = "a"; //["a"]
        String s2 = "b"; //["a","b"]
        String s3 = "a" + "b"; //["a","b","ab"]
        String s4 = s1 + s2; //new String("ab") => 存放到堆中
        String s5 = "ab"; //串池中已有
        String s6 = s4.intern(); //"ab"串池中已有 => 返回串池的"ab"

        //问
        System.out.println(s3 == s4);// 串池的"ab" != 堆中"ab"对象
        System.out.println(s3 == s5);// 串池的"ab" == 串池的"ab"
        System.out.println(s3 == s6);// 串池的"ab" == 串池的"ab"

//        String x2 = new String("c") + new String("d");
//        String x1 = "cd";
//        x2.intern();
//        System.out.println(x1 == x2); //串池的"cd" != 堆中"cd"对象

        //问，如果调换了[最后两行代码]的位置呢，如果是jdk1.6呢
        String x2 = new String("c") + new String("d"); //new String("cd")
        x2.intern(); //1.8 堆中对象入串池；1.6 复制一个对象副本入串池
        String x1 = "cd"; //1.8 串池中有，直接引用串池中的对象；1.6引用串池副本
        System.out.println(x1 == x2); //1.8 true；1.6 false
    }
}
