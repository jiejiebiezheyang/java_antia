package cn.ltpcloud.api.day03.timeBefore8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/18/10:46
 * @Description:
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        // 以默认模式创建对象
        SimpleDateFormat sdf1 = new SimpleDateFormat();

        // 以指定模式创建对象
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");

        Date date = new Date();
        // 格式化
        String time1= sdf1.format(date);
        System.out.println(time1);
        System.out.println(sdf2.format(date));

        // 解析
        // 注意：字符串模式必须和dateFormat模式一致，不然会发生ParseException
        // Date date2 = sdf2.parse("2012-12-12");
        // System.out.println(date2);
        Date date3 = sdf2.parse("2012-12-12 12:12:12");
        System.out.println(date3);
    }
}
