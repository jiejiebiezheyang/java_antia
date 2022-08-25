package cn.ltpcloud.basic.day002;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/01/18:49
 * @Description: 生肖问题
 */
public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个年份：");
            int year = sc.nextInt();
            switch (year % 12) {
                case 0:
                    System.out.println("🐒猴-monkey");
                    break;
                case 1:
                    System.out.println("🐓鸡-rooster");
                    break;
                case 2:
                    System.out.println("🐕狗-dog");
                    break;
                case 3:
                    System.out.println("🐖猪-pig");
                    break;
                case 4:
                    System.out.println("🐀鼠-rat");
                    break;
                case 5:
                    System.out.println("🐂牛-ox");
                    break;
                case 6:
                    System.out.println("🐅虎-tiger");
                    break;
                case 7:
                    System.out.println("🐇兔-rabbit");
                    break;
                case 8:
                    System.out.println("🐉龙-dragon");
                    break;
                case 9:
                    System.out.println("🐍蛇-snake");
                    break;
                case 10:
                    System.out.println("🐎马-horse");
                    break;
                case 11:
                    System.out.println("🐏羊-sheep");
                    break;
            }
        }
    }
}
