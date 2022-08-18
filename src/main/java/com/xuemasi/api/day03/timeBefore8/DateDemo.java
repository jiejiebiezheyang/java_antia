package com.xuemasi.api.day03.timeBefore8;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/18/10:25
 * @Description:
 */
public class DateDemo {
    public static void main(String[] args) {
        // 获取当前时间
        Date now = new Date();
        System.out.println(now);

        // 指定时间创建毫秒值
        Date date = new Date(1000);
        System.out.println(date);

        // 获取当前时间毫秒值
        System.out.println(now.getTime());
        System.out.println(date.getTime());

        // 设置日期的毫秒值
        // 需求：获取明天这个时候的日期
        now.setTime(now.getTime()+86400*1000);
        System.out.println(now);
    }
}
