package com.xuemasi.api.day03.timeBefore8;

import java.util.Calendar;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/18/11:37
 * @Description:
 */
public class CalebdarDemo {
    public static void main(String[] args) {
        // 获取日历
        Calendar c = Calendar.getInstance();
        // 获取日历字段
        int year = c.get(Calendar.YEAR); // 年
        int month = c.get(Calendar.MONTH) + 1;  // 月 ，在Calendar中0表示一月份
        int day = c.get(Calendar.DAY_OF_MONTH); // 日
        int date = c.get(Calendar.DATE); // 日
        int hour = c.get(Calendar.HOUR);// 时
        int minute = c.get(Calendar.MINUTE); // 分
        int second = c.get(Calendar.SECOND); // 秒
        System.out.println(year + "-" + month + "-" + day + " " + date + " " + hour + ":" + minute + ":" + second);

        // 设置日期字段
        // 设置指定字段为指定的值
        c.set(Calendar.YEAR,2000);
        // 设置年月日
        c.set(2018,11,12);
        System.out.println(c);

        // 获取日期
        System.out.println(c.getTime());
        // 设置日期
        c.setTime(new Date());
        System.out.println(c);

        // 给指定日历字段增加指定的值2022-8-18
        c.add(Calendar.YEAR,2);
        c.add(Calendar.MONTH,-2);
        c.add(Calendar.DAY_OF_MONTH,7);
        System.out.println(c.getTime());
    }
}
