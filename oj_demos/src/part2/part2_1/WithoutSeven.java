package part2.part2_1;

/*
    一个正整数，如果它能被7整除，或者它的十进制表示法中某个位数上的数字为7,那么称其为与7相关的数。
    现求所有小于等于n (n< 100)的与7无关的正整数的平方和
*/
public class WithoutSeven {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            //被7整除 or 个位数为7
            if (i % 7 == 0 || i % 10 == 7){

            }else
                System.out.println(i);
        }
    }
}
