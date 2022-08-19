package com.xuemasi.api.day04;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/19/11:34
 * @Description:
 */
public class BigDecimalDemo {
    @Test
    public void demo1() {
        double d1 = 3;
        double d2 = 2.9;
        System.out.println(d1 - d2); // 0.10000000000000009
    }

    @Test
    public void demo2() {
        BigDecimal bd1 = new BigDecimal("11");
        BigDecimal bd2 = new BigDecimal("3");
        System.out.println("bd1+bd2=" + bd1.add(bd2));
        System.out.println("bd1-bd2=" + bd1.subtract(bd2));
        System.out.println("bd1*bd2=" + bd1.multiply(bd2));
        /*
         * 注意：
         * 如果结果为有限小数（除的尽），则不报错
         * 如果结果为无限小数（除不尽），则报错
         * */
        // System.out.println("bd1/bd2=" + bd1.divide(bd2));
        /*
         * scale:保留的位数
         * BigDecimal.ROUND_HALF_UP:BigDecimal提供的四舍五入
         * RoundingMode.HALF_UP:RoundingMode提供的四舍五入
         * */
        System.out.println("bd1/bd2=" + bd1.divide(bd2, 5, BigDecimal.ROUND_HALF_UP));
        System.out.println("bd1/bd2=" + bd1.divide(bd2, 5, RoundingMode.HALF_UP));
        // 获取商和余数
        BigDecimal[] bigDecimal = bd1.divideAndRemainder(bd2);
        System.out.println(Arrays.toString(bigDecimal));
    }

    @Test
    public void demo3() {
        BigDecimal db1 = new BigDecimal("3.0");
        BigDecimal db2 = new BigDecimal("2.9");
        System.out.println(db1.subtract(db2));
    }
}
