package part2_garbage_collection;

/**
 * @Classname Demo5
 * @Description TODO
 * @Date 2020/7/10 15:08
 * @Author 曹珂
 */
public class Demo5 {
    public static void main(String[] args) {
        System.out.println(getDivision(10));
        ;
    }

    public static int getDivision(int n) {
        try {
            n += 1;
            if (n / 0 > 0) {
                n += 10;
            } else {
                n -= 10;
            }
            return n;
        } catch (Exception e) {
        }
        n++;
        return n++;
    }
}

