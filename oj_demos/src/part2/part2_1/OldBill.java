package part2.part2_1;

import java.util.Scanner;

/*
    N只火鸡的价格为$_XYZ_，火鸡的总数N在1到99之间。
    价格由五位数组成，两边的数字由于褪色而看不清，所以只能看到中间的三位数。
    假设第一个数字非零，每只火鸡的价格是整数，并且所有火鸡的价格相同。
    给定N,X, Y和Z,编写一个程序来猜测两边褪色的数字和火鸡的原始价格。如果有多个价格符合题意，那么输出最昂贵的那个
*/
//注： 本题使用枚举法解题，因为题干中要求输出最大单价，所以直接采取了从大到小的遍历方式（最大值9999也可更改为90009 + num）
public class OldBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int N = input.nextInt();
            int x = input.nextInt();
            int y = input.nextInt();
            int z = input.nextInt();
            handle(N, x, y, z);
        }
        input.close();
    }

    public static void handle(int N, int x, int y, int z) {
        int num = 1000 * x + 100 * y + 10 * z; //中间三位数xyz0
        int multiply = 99999; //初始总价  = 最大价格
        int money = 99999 / N; //一只火鸡初始单价
        //xyz是固定的,所以最小的5位数是 => 1xyz0
        while (multiply >= (10000 + num)) {
            multiply = N * money; //总价 = 单价*数量
            //若 xyz(千位=>百位) == 总价/10(千位)%1000 => 百位
            if ((num / 10) == (multiply / 10) % 1000) {
                System.out.print((multiply / 10000) % 10 + " "); //求万位数字
                System.out.print(multiply % 10 + " "); //求个位数字
                System.out.println(money);
                return;
            }
            money--;
        }
        System.out.println(0);
    }
}
