import java.util.HashSet;

/**
 * 测试HashMap实现原理
 */
public class HashSetTest {
    public static void main(String[] args) {
        String s1 = "1";
        String s2 = "1";
        HashSet<String> hs = new HashSet<String>();
        hs.add(s1);
        //添加s2时，查看集合中是否有相同的hashcode->冲突->s2调用equals()比较s1->相同字符串->重复
        hs.add(s2);

    }
}
