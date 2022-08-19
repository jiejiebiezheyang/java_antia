package com.xuemasi.api.day04;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/19/10:29
 * @Description:
 */
public class MathDemo {
    public static void main(String[] args) {
        // abs(int a):绝对值
        System.out.println(Math.abs(-2));
        // ceil(double d):向上取整
        System.out.println(Math.ceil(2.1));
        // floor(double d):向下取整
        System.out.println(Math.floor(3.2));
        // max(int a,int b):最大值
        System.out.println(Math.max(12, 854));
        // pow(double a,double b):a的b次幂
        System.out.println(Math.pow(2, 3));
        // random():随机数
        System.out.println(Math.random());
        // round( float f):四舍五入
        System.out.println(Math.round(465.452));
        // sqrt( double d):算术平方根
        System.out.println(Math.sqrt(9));
    }
}
