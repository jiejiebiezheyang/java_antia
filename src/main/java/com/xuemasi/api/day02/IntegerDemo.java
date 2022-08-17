package com.xuemasi.api.day02;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/17/17:16
 * @Description:
 */
public class IntegerDemo {
    @Test
    // 构造
    public void demo1() {
        // 所有的包装内对象都可以通过基本类型进行构造
        Integer it1 = new Integer(100);
        // 有些包装类对象可以通过字符串进行构造
        Integer it2 = new Integer("200");
    }

    @Test
    // 属性
    public void demo2() {
        System.out.println("最大值=" + Integer.MAX_VALUE);
        System.out.println("最小值=" + Integer.MIN_VALUE);
        System.out.println("位=" + Integer.SIZE);
        System.out.println("类型(class)=" + Integer.TYPE);
    }

    @Test
    // 常用方法
    public void demo3() {
        Integer it = new Integer(10);
        // 可以通过xxxValue()将包装类型转成对应的基本类型
        int i = it.intValue();
        System.out.println(i);

        // 求和
        Integer.sum(1, 2);
        // 求最大值最小值
        Integer.max(2, 3);
        Integer.min(2, 3);

        // 可以通过parseXXX()将字符串转为对应的基本类型
        int i1 = Integer.parseInt("100");
        System.out.println(i1);

        // 可以通过valueOf方法将其他类型转为当前类 类型
        Integer it1 = Integer.valueOf(12);
        Integer it2 = Integer.valueOf("13");
    }

    @Test
    // 基本类型，包装类类型和字符串之间的相互转换
    public void demo4() {
        // 基本类型 <===> 包装类
        //int ==> Integer
        Integer it1 = new Integer(10);
        Integer it2 = Integer.valueOf(20);
        // Integer ==> int
        int i1 = it1.intValue();

        // 基本类型 <===> 字符串 (重点)
        // int ==> String
        String s1 = String.valueOf(10);
        // String ==> int
        int i = Integer.parseInt("10");

        // 包装类 <===> 字符串
        // Integer ==> String
        String s2 = it2.toString();
        String s3 = String.valueOf(it2);
        //String ==> Integer
        Integer.valueOf("123");
    }
}