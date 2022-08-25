package cn.ltpcloud.basic.day004;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/03/10:31
 * @Description: 判断是否可以构建三角形
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个整数");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("是等边三角形");
            } else if (a == b || b == c || a == c) {
                System.out.println("等腰三角形");
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("直角三角形");
            } else {
                System.out.println("普通三角形");
            }

            // 求面积
            double p = (a + b + c) / 2.0;
            double area = Math.sqrt(p * (p - a) * (p - b) * (p = c));
            System.out.println("面积为：" + area);
        } else {
            System.out.println("输入的数字无法构建三角形");
        }
    }
}

