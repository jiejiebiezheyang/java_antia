package cn.ltpcloud.basic.day002;

import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/01/18:01
 * @Description: 赌数游戏
 */
public class Test05 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        //0~5 --> +1 --> 1~6
        int a = rd.nextInt(6) + 1;
        int b = rd.nextInt(6) + 1;
        int c = rd.nextInt(6) + 1;
        // 输入
        System.out.println("请选择结果：" + "\n" + "1:豹子\t2:小\t3:大");
        int x = sc.nextInt();

        int sum = a + b + c;
        int rs;
        if (a == b && b == c) {
            rs = 1;
            System.out.println("豹子");
        } else if (sum <= 9) {
            rs = 2;
            System.out.println("小");
        } else {
            rs = 3;
            System.out.println("大");
        }

        if (x == rs) {
            System.out.println("押对了，骰子分别为：" + a + "\t" + b + "\t" + c +"\t总点数为："+ (a + b + c));
        } else {
            System.out.println("押错了，骰子分别为：" + a + "\t" + b + "\t" + c +"\t总点数为：" +(a + b + c));
        }
    }
}
