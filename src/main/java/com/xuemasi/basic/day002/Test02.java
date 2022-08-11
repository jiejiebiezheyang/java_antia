package com.xuemasi.basic.day002;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/01/15:37
 * @Description: 求方程根
 */
public class Test02 {
    public static void main(String[] args) {

        SqRoot(1, -4, 1);
        SqRoot(1, -2, 1);
    }

    public static void SqRoot(double a, double b, double c) {
        if (a != 0) {
            double v = Math.pow(b, 2) - 4 * a * c;
            if (v > 0) {
                double x1 = (-b + Math.sqrt(v)) / (2 * a);
                double x2 = (-b - Math.sqrt(v)) / (2 * a);
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            } else if (v == 0) {
                double x = -(b) / (2 * a);
                System.out.println(x);
            } else {
                System.out.println("无解");
            }
        } else if (b != 0) {
            double x = -c / b;
            System.out.println(x);
        }
    }
}
