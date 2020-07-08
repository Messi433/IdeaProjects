package part2.part2_2;

import java.util.Scanner;

/*
    打印日期(华中科技大学复试上机题)=>上题的反向输出
    题目描述:
        给出年份m和一年中的第n天，算出第n天是几月几号。
    输入:
        输入包括两个整数: y (1≤y≤3000)和n (1≤nS 366)。
    输出:
        可能有多组测试数据，对于每组数据，
        按格式yyyy-mn-dd将输入中对应的日期打印出来。
 */

/**
 * 思路 判断年份是否为闰年，进入不同的数组=>for循环(最大12次)累加月份的天数,循环体内判断是否越过给出的天数
 * =>越过后说明循环体内的month的前一个月为当前月=>第n天减去当前月的累加日=>day
 * sout=> month、day
 */
public class WhatDate {
    //数据预先保存在二维数组中
    static int daytab[][] = {
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},//普通年
            {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}//闰年：2月=>29天
    };
    //日期格式化
    public static String formatDate(int year, int month, int day) {
        return year + "-" + month + "-" + day;
    }
    //闰年判断函数
    static int isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) {
        WhatDate wd2 = new WhatDate();
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();//输入判断的年份
        int daySum = input.nextInt();//输入当前年的第n天
        int number = 0;
        int lastNumber = 0;
        int day = 0;
        int month = 0;
        int index = isLeapYear(year);
        for (int i = 1; i <= 12; i++) {//这里必须是"<"，
            number += daytab[index][i];//累加每月的天数
            lastNumber =number - daytab[index][i];//上个月的累加天数=当前月最大天数-当前月的天数
            if(number>daySum){
                day = daySum-lastNumber;//当前月的天数
                month = i;//当前月
                break;//退出循环
            }
        }
        String date = formatDate(year,month,day);
        System.out.println(date);
    }
}
