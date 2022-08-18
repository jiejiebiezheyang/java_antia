package com.xuemasi.api.day03.time8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/18/16:22
 * @Description:
 */
public class DurationDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime time1 = LocalDateTime.of(2000, 8, 15, 10, 57, 25);
        // 获取时间的间隔
        Duration between = Duration.between(time1, now);

        // 获取间隔的纳秒
        System.out.println(between.getNano());
        // 获取间隔的秒
        // System.out.println(between.getSeconds());
        
        //获取间隔的时间
        System.out.println("间隔的天数="+between.toDays());
        System.out.println("间隔的小时="+between.toHours());
        System.out.println("间隔的分钟="+between.toMinutes());
        System.out.println("间隔的毫秒="+between.toMillis());
    }
}
