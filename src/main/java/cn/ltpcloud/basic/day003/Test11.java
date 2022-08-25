package cn.ltpcloud.basic.day003;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/02/14:45
 * @Description: 打印1~100之间 6的倍数的个数
 *                 2求出1～100之间，既是3又是7的倍数的自然数出现的次数？
 */
public class Test11 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 6 == 0) {
                a += 1;
            }
            if (i % 3 == 0 && i % 7 == 0) {
                b ++;
            }
        }
        System.out.println("1~100之间 6的倍数的个数 = " + a);
        System.out.println("1～100之间，既是3又是7的倍数的自然数出现的次数 = " + b);

    }
}
