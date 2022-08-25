package cn.ltpcloud.api.day03.time8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/18/14:54
 * @Description:
 */

/*
 * 任意年份2月天数
 * */
public class Test01 {
    public static void main(String[] args) {
        System.out.println(getDays(2022));
    }

    public static int getDays(int year) {
        LocalDate time = LocalDate.of(year, 3, 1);
        return time.minusDays(1).getDayOfMonth();
    }
}
