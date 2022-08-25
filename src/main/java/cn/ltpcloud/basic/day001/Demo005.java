package cn.ltpcloud.basic.day001;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/07/29/14:47
 * @Description: 字符型 "Unicode"默认
 */
public class Demo005 {
    public static void main(String[] args) {
        // 字符：单个的文字或符号，用''括起来
        char c = 'a';
        c = '咋';
        c = '#';
        System.out.println(c);
        /*
         * 实际上字符就是一个整数
         * 英文兼容ASCII
         * '0' -> 48
         * 'A' -> 67
         * 'a' -> 97
         * */

        int n = 'a';
        System.out.println(n);

        // 输出所有字符
        for (int i = 0; i < 65535; i++) {
            System.out.print((char) i + "\t");
            if (i % 50 == 0) {
                System.out.println();
            }
        }


        System.out.println("\r");//回车（确认，换行）

        System.out.println("\u6888");//16进制

    }
}
