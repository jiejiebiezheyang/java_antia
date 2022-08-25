package cn.ltpcloud.api.day03.time8;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/18/16:16
 * @Description:
 */
public class PeriodDemo {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2000, 8, 16);
        LocalDate date2 = LocalDate.of(2022, 8, 18);
        // 获取日期间隔
        Period between = Period.between(date1, date2);
        // 获取间隔的日期
        System.out.println("间隔的年数="+between.getYears());
        System.out.println("间隔的月份="+between.getMonths());
        System.out.println("间隔的天数="+between.getDays());
        // 设置间隔的日期
        Period period = between.withYears(10);
        System.out.println(period);
    }
}
