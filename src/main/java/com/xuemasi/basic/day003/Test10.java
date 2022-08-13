package com.xuemasi.basic.day003;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/02/14:22
 * @Description: 求最大公约数和最小公倍数
 */
public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数：");
        int n = sc.nextInt();
        System.out.println("在输入一个：");
        int m = sc.nextInt();

        // 最大公约数
        int gcd = Math.min(m, n);
        while (gcd > 0) {
            if (m % gcd == 0 && n % gcd == 0) {
                System.out.println(n + "和" + m + "最大公约数为：" + gcd);
                break;
            }
            gcd--;
        }
        // 最小公倍数
        int LCM = 1;
        while (true) {
            if (LCM % n == 0 && LCM % m == 0) {
                System.out.println(n + "和" + m + "最小公倍数为：" + LCM);
                break;
            }
            LCM++;
        }
        sc.close();
    }
}
