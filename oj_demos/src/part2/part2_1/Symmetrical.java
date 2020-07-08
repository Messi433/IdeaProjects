package part2.part2_1;

/*
 题目描述:
        打印所有不超过256,其平方具有对称性质的数。如2和11就是这样的数,因为2x2 =4,11x11= 121。
        输入:
        题目没有任何输入。
        输出:
        输出具有题目要求的性质的数。如果输出数据不止一组，那么各组数据之间以回车隔开。
 */
public class Symmetrical {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            rev *= 10;
            rev += x % 10;
            x /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Symmetrical st = new Symmetrical();
        for (int i = 0; i <= 256; i++){
            if (i*i == st.reverse(i*i))
                System.out.println(i);
        }
    }
}
