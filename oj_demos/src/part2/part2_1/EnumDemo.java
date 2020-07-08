package part2.part2_1;
/*
    例题2.1 abc (清华大学复试上机题)
    -题目描述:
    设a,b,c均是0到9之间的数字，abc, bcc是两个三位数，且有abc + bcc = 532。
    求满足条件的所有a,b,c的值。
    -输入:
    题目没有任何输入.
    -输出:
    1.请输出所有满足题目条件的a,b,c的值。
    2.a,b,c之间用空格隔开。
    3.每个输出占一行。
*/
public class EnumDemo {
    public static void main(String[] args) {
        int a, b, c;
        for (a = 0; a <= 9; a++)
            for (b = 0; b <= 9; b++)
                for (c = 0; c <= 9; c++) {
                    int abc = 100 * a + 10 * b + c;
                    int bcc = 100 * b + 11 * c;
                    if (abc + bcc == 532) {
                        System.out.println(a);
                        System.out.println(b);
                        System.out.println(c);
                    }
                }
    }
}
