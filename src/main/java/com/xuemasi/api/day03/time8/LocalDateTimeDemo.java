package com.xuemasi.api.day03.time8;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/18/14:10
 * @Description:
 */
public class LocalDateTimeDemo {
    public static void main(String[] args) {
        // 获取当前时区的当前日期时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // 获取指定时区的当前日期时间
        LocalDateTime now1 = LocalDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println(now1);

        // 通过指定的日期和时间创建LocalDateTime
        LocalDateTime ldt = LocalDateTime.of(2012, 12, 12, 12, 12, 12);

        // 获取日期和时间
        System.out.println("年=" + ldt.getYear());
        Month month = ldt.getMonth();
        System.out.println("月=" + month.getValue());
        System.out.println("日=" + ldt.getDayOfMonth());
        System.out.println("时=" + ldt.getHour());
        System.out.println("分=" + ldt.getMinute());
        System.out.println("秒=" + ldt.getSecond());
        System.out.println("年中的天数=" + ldt.getDayOfYear());
        System.out.println("星期=" + ldt.getDayOfWeek());

        // 设置日期时间，返回新的LocalDateTime
        LocalDateTime localDateTime = ldt.withYear(2022);
        System.out.println(localDateTime);

        // 增加指定的日期时间
        LocalDateTime localDateTime1 = ldt.plusDays(3);
        System.out.println(localDateTime1);

        // 减少指定的日期时间
        LocalDateTime localDateTime2 = ldt.minusHours(2);
        System.out.println(localDateTime2);

        // TemporalAdjuster
        // 这个月第一天
        LocalDateTime ldt5 = ldt.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(ldt5);

        // 今年最后一天
        LocalDateTime ldt6 = ldt.with(TemporalAdjusters.lastDayOfYear());
        System.out.println(ldt6);

        // 设置下一个星期五
        LocalDateTime ldt7 = ldt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(ldt7);
    }
}
