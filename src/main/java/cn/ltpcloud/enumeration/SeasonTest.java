package cn.ltpcloud.enumeration;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/25/11:54
 * @Description:
 */
public class SeasonTest {
    @Test
    public void demo1() {
        Season spring = Season.SPRING;
        System.out.println(spring);
    }

    @Test
    public void demo2() {
        Season2 spring = Season2.SPRING;
        System.out.println(spring);

        // 获取所有枚举对象
        System.out.println(Arrays.toString(Season2.values()));

        // 将String转为枚举对象(String值必须是枚举对象的名称)
        Season2 summer = Season2.valueOf("SUMMER");
        System.out.println(summer);

        Season2 summer1 = Enum.valueOf(Season2.class, "SUMMER");
        System.out.println(summer1
        );
    }
}
