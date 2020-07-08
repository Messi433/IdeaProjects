package part2.part2_2;

import java.util.Arrays;
import java.util.Scanner;

/*
今年的第几天? ( 清华大学复试上机题)
    题目描述:输入年、月、日，计算该天是本年的第几天。
    输入:包括3个整数:年(1≤Y≤3000)、月(1≤M≤12)、日(1 ≤D≤31)。.
    输出:
    输入可能有多组测试数据，对于每组测试数据，
    输出一个整数，代表Input中的年、月、日对应本年的第几天。
 */
public class WhatDay {
    //数据预先保存在二维数组中
    int daytab[][] = {
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},//普通年
            {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}//闰年：2月=>29天
    };
    //闰年判断函数
    int isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) {
        WhatDay wd = new WhatDay();
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();//输入判断的年份
        int month = input.nextInt();//输入判断的月份，值为当前月
        int day = input.nextInt();//输入现在月的天数
        int number = 0;
        int index = wd.isLeapYear(year);
        for (int i = 0; i < month; i++) {//这里必须是"<"，
            number += wd.daytab[index][i];//累加当前月之前=>每月的天数
        }
        number += day; //再累加上当前月的天数
        System.out.println(+month+"月"+day+"号的天数为 "+number);
    }
}

