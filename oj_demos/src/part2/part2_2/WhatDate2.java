package part2.part2_2;

import java.text.NumberFormat;
import java.util.Scanner;

public class WhatDate2 {
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

    //判断整数位数
    int judgeDigit(int year) {
        int count = 1;
        while (year / 10 > 1) {
            year = year / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        WhatDate2 wd = new WhatDate2();
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();//输入判断的年份
        int number = input.nextInt();//输入判断的天数
        int month = 0;
        int day = 0;
        int index = wd.isLeapYear(year);
        while (number > wd.daytab[index][month]) { //从第一个月的最大天数开始减
            number -= wd.daytab[index][month]; //累减
            month++;
        }
        //为年份为4位数以下
        int count = wd.judgeDigit(year);
        if (count < 4) {
            String strYear = "0" + year;
            System.out.println("日期为：  " + strYear + "-" + month + "-" + day);
        }
        day = number; //最后累减完了的number < 月份中的最大日期 => 当前月的当前天数
        System.out.println("日期为：  " + year + "-" + month + "-" + day);
    }
}
