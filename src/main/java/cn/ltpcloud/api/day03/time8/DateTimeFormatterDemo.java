package cn.ltpcloud.api.day03.time8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/18/14:42
 * @Description:
 */
public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        // 通过自定义模式获取DataTimeFormatter
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        // 格式化
        String time = dateTimeFormatter.format(now);
        System.out.println(time);

        // 解析
        // TemporalAccessor parse = dateTimeFormatter.parse("2022-08-18 14:49:25");

        // 一般使用LocalDateTime里面的解析方法
        LocalDateTime parse = LocalDateTime.parse("2022-08-18 14:49:25", dateTimeFormatter);
        System.out.println(parse);

    }
}
