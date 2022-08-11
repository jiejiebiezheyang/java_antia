package com.xuemasi.basic.day002;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/01/16:14
 * @Description: 随机数
 */
public class RandomDemo {
    public static void main(String[] args) {
        // 方法1：Random类中的nextInt
        Random r = new Random();
        // 获取1个[0,10)的整数
        int a = r.nextInt(10);
        System.out.println(a);
        // 获取1个10~99范围的随机数
        int b = r.nextInt(90) + 10;
        System.out.println(b);

        // 方法2：Math类中的random()
        double d = Math.random(); // 获取一个0.0~1.0的小数，1.0不包含
        System.out.println(d);
        // 获取1个10~99范围的随机整数
        // 0.0~1.0 -->*90--> 0.0~90.0 -->+10--> 10.0~100.0 --(int)--> 10~100
        int i = (int) (Math.random() * 90 + 10);
        System.out.println(i);
    }
}
