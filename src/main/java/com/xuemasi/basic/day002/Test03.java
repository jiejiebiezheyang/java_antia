package com.xuemasi.basic.day002;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/01/15:00
 * @Description: 彩票游戏
 */
public class Test03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个两位整数：");
        int a = sc.nextInt();
        int b = (int) (Math.random() * 90 + 10);
        if (a >= 10 && a < 100) {
            System.out.println("彩票的号码为：" + b);
            if (a == b) {
                System.out.println("恭喜您获得一等奖,奖金10 000美元");
            } else if (a / 10 == b % 10 && a % 10 == b / 10) {
                System.out.println("恭喜您获得二等奖,奖金3 000美元");
            } else if (a / 10 == b / 10 || a % 10 == b % 10) {
                System.out.println("恭喜您获得三等奖,奖金1 000美元");
            } else if ((a / 10 != b % 10 && a % 10 == b / 10) || (a % 10 != b / 10 && a / 10 == b % 10)) {
                System.out.println("恭喜您获得四等奖,奖金500美元");
            } else {
                System.out.println("很遗憾，您未中奖");
            }
        } else {
            System.out.println("输入有误");
        }
    }
}
