package cn.ltpcloud.basic.day002;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/01/17:02
 * @Description: 录入月份，输出季节
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        if (month > 0 && month <= 12) {
            /*switch (month) {
                case 3:
                case 4:
                case 5:
                    System.out.println("春");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("夏");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("秋");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println("冬");
                    break;
            }*/
            // 优化
            switch (month / 3) {
                case 1:
                    System.out.println("春");
                    break;
                case 2:
                    System.out.println("夏");
                    break;
                case 3:
                    System.out.println("秋");
                    break;
                default:
                    System.out.println("冬");
                    break;
            }
        } else {
            System.out.println("输入有误");
        }

        sc.close();
    }
}