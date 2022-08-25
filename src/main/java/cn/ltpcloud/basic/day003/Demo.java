package cn.ltpcloud.basic.day003;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/02/16:12
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        /*
         * 假设一个简单的ATM机的取款过程是这样的：
         * 首先提示用户输入密码（password），
         * 最多只能输入三次，超过3次则提示用户“密码错误，
         * 请取卡”结束交易。如果用户密码正确，
         * 再提示用户输入取款金额（amount），
         * ATM机只能输出100元的纸币，一次取钱数要求最低
         * 100元，最高1000元。
         * 若用户输入的金额符合上述要求，则打印输出用户取得钱数，
         * 最后提示用户“交易完成，请取卡”，否则提示用户重新输入金额。
         *假设用户密码是111111，请编程实现
         * */
        Scanner sc = new Scanner(System.in);
        String pwd = "011111";
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入密码：");
            String password = sc.next();
            if (password.equals(pwd)) {
                System.out.println("登陆成功");
                while (true) {
                    System.out.println("请输入取款金额：");
                    if (sc.hasNextInt()) {
                        int amount = sc.nextInt();
                        if (amount <= 100 || amount >= 1000) {
                            System.out.println("ATM机只能输出100元的纸币，一次取钱数要求最低100元，最高1000元。");
                        } else if ((amount == 1000) || (amount % 10 == 0 && (amount / 10) % 10 == 0)) {
                            System.out.println("成功取款" + amount + "元");
                            System.out.println("继续取款请按1，结束取款请按2.");
                            int a = sc.nextInt();
                            if (a == 1) {
                                continue;
                            } else if (a == 2) {
                                System.out.println("结束取款，请不要忘记取走您的卡片");
                                return;
                            }
                        } else {
                            System.out.println("ATM机只能输出100元的纸币，一次取钱数要求最低100元，最高1000元。");
                        }
                    }
                }
            }
        }
        System.out.println("连续三次密码错误，结束交易，请取卡");
        sc.close();
    }
}
