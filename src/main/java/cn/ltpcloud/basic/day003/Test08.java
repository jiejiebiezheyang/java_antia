package cn.ltpcloud.basic.day003;

import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/02/13:33
 * @Description: 猜数字游戏
 */
public class Test08 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int rd = r.nextInt(100);
        for (int i = 1; i > 0; i++) {
            System.out.println("输入一个0~100的整数：");
            int input = sc.nextInt();
            if (input < rd) {
                System.out.println("小了");
            } else if (input > rd) {
                System.out.println("大了");
            } else if (rd == input) {
                System.out.println("猜对了，一共猜了" + i + "次");
                break;
            }
        }
        /*int i = 1;
        while (true) {
            System.out.println("输入一个0~100的整数:");
            int input = sc.nextInt();
            if (input < rd) {
                System.out.println("小了");
            } else if (input > rd) {
                System.out.println("大了");
            } else if (rd == input) {
                System.out.println("猜对了，一共猜了" + i + "次");
                break;
            }
            i++;
        }*/
        sc.close();
    }
}
