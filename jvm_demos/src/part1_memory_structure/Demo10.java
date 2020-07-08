package part1_memory_structure;


// StringTable [ "a"， "b" , "ab"] hashtable 结构,不能扩容
public class Demo10 {
    //常量池中的信息,都会被加载到运行时常量池中，这时a b ab都是常量池中的符号,还没有变为java 字符串对象
    public static void main(String[] args) {
        //ldc是常量池
        // ldc #2会把a符号变为"a"字符串对象 => StringTable [ "a" ]
        String s1 = "a";
        // ldc #3会把b符号变为"b" 字符串对象 => StringTable [ "a"，"b" ]
        String s2 = "b";
        // ldc #4会把ab符号变为"ab"字符串对象 => StringTable [ "a"，"b"，"ab" ]
        String s3 = "ab";
        String s4 = s1 + s2; //new StringBuilder().append( "a ").toString() => new String("ab")
        //s3是串池中的字符串，串池存放在堆中，s4是创建了一个新的对象，存放在堆中，虽然值相同但是返回false
        System.out.println(s3 == s4);
        //拼接起来为"ab"，直接在串池中就能找到，直接引用 ldc #4 即可；这是javac在编译期间的优化,结果已经在编译期确定为ab
        String s5 = "a" + "b";
        
    }
}
