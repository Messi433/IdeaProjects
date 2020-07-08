package part2.part2_1;

/*
题目描述:
	设N是一个4位数，它的9倍恰好是其反序数(如1234的反序数是4321),求N的值。
输入:题目没有任何输入。
输出:输出题目要求的4位数，如果结果有多组，那么每组结果之间以回车隔开。
*/
public class ReverseNum {
    int reverse(int x) {
        int rev = 0;
        while (x != 0) { //反序操作
            rev *= 10; //上位操作,第一遍为0，例原来为个位-》十位
            rev += x % 10; //通过取余操作,取其个位数
            x /= 10; //x向下降一位,例原来为千位-》百位
        }
        return rev;
    }
    public static void main(String[] args) {
        //枚举1000-9999的反序数
        ReverseNum rn = new ReverseNum();
        for (int i = 1000; i < 10000; i++) {
            if (i * 9 == rn.reverse(i))
                System.out.println(i);
        }
    }
}

