package demo;

import java.util.HashMap;

/**
 * @Classname Demo1
 * @Description HashMap源码分析
 * @Date 2020/7/29 19:29
 * @Author 曹珂
 */
public class MapTest {
    public static void main(String[] args) {
        //指定数组初始容量13，因为必须要2的指数次幂，因此2^4=16
        HashMap<String, String> hm = new HashMap<>(13);
        hm.put("杨过", "1997");
    }

    /* ---------------- Public operations -------------- */

    /**
     * Constructs an empty <tt>HashMap</tt> with the specified initial
     * capacity and load factor.
     *
     * @param initialCapacity the initial capacity
     * @param loadFactor      the load factor
     * @throws IllegalArgumentException if the initial capacity is negative
     *                                  or the load factor is nonpositive
     */
    /*public HashMap(int initialCapacity, float loadFactor) {
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal initial capacity: " +
                    initialCapacity);
        if (initialCapacity > MAXIMUM_CAPACITY)
            initialCapacity = MAXIMUM_CAPACITY;
        if (loadFactor <= 0 || Float.isNaN(loadFactor))
            throw new IllegalArgumentException("Illegal load factor: " +
                    loadFactor);
        this.loadFactor = loadFactor;
        this.threshold = tableSizeFor(initialCapacity);
    }*/

}
