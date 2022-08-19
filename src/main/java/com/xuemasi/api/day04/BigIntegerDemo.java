package com.xuemasi.api.day04;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/19/11:23
 * @Description:
 */
public class BigIntegerDemo {
    @Test
    public void demo1() {
        // 200!
        double jc = 1;
        for (int i = 200; i > 0; i--) {
            jc *= i;
        }
        System.out.println(jc);
    }

    @Test
    public void demo2() {
        BigInteger bi1 = new BigInteger("5");
        BigInteger bi2 = new BigInteger("2");
        System.out.println("bi1+bi2=" + bi1.add(bi2));
        System.out.println("bi1-bi2=" + bi1.subtract(bi2));
        System.out.println("bi1*bi2=" + bi1.multiply(bi2));
        System.out.println("bi1/bi2=" + bi1.divide(bi2));
        // 获取商和余数
        BigInteger[] bigIntegers = bi1.divideAndRemainder(bi2);
        System.out.println(Arrays.toString(bigIntegers));
    }

    @Test
    public void demo3() {
        // 200!
        BigInteger jc = new BigInteger("1");
        for (int i = 200; i > 0; i--) {
            jc = jc.multiply(BigInteger.valueOf(i));
        }
        System.out.println(jc);
    }
}
