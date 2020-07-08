package part2.part2_2;

import java.util.Scanner;

/**
 * 输入一个高度h,输出一个高度为h、上底边长度为h的梯形。
 * 一个整数h (1 ≤h≤1000),每层相差两个单位的 *
 * 实现的效果：
 * System.out.println("      ****");
 * System.out.println("    ******");
 * System.out.println("  ********");
 * System.out.println("**********");
 */

public class Trapezoid {
    public static void main(String[] args) {
        //输入流
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();

        int row = h; //行高为h
        int col = h + (h - 1) * 2; //列的宽度为(2、4、6、8、10，An = A1+(n-1)*d 公差d=2)
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j < col - (h + i * 2))
                    //假设第一行不输出*，那么就有col宽度的 " "，设定初始有h个 * ，所以输出 col- h 个空格
                    //每行依次递增两颗 * ，相应的依次少输出两个" "，因此公式为上
                    System.out.print(" ");
                else
                    //空格输出完再输出*
                    System.out.print("*");
            }
            System.out.println();
        }

    }


}
