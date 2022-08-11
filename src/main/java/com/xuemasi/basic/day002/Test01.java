package com.xuemasi.basic.day002;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/01/12:12
 * @Description: 控制台录入三个整数，输去其中最大值
 */
public class Test01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个整数：");
        System.out.println("第一个");
        int a = sc.nextInt();
        System.out.println("第二个");
        int b = sc.nextInt();
        System.out.println("第三个");
        int c = sc.nextInt();
        System.out.println("最大的数为：" + ((a > b) ? (a > c ? a : c) : (b > c ? b : c)));


    }
}

