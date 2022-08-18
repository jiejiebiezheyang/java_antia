package com.xuemasi.api.day03.timeBefore8;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/18/12:00
 * @Description:
 */
/*
 * 获取任意年份2月的天数
 * */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入年份:");
        int year = sc.nextInt();
        System.out.println(getDays(year));
    }

    public static int getDays(int year){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, Calendar.FEBRUARY);
        return c.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
}
