package com.xuemasi.basic.day001;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/07/29/17:21
 * @Description: 字符串:多个字符的连接,用“”括起来，可以存储0、1或多个字符
 */
public class Demo007 {
    public static void main(String[] args) {
        String s = "";
        s = "a";
        s = "abc";

        /*
         * 连接符：当+边上存在string时，+作为连接符
         * 连接操作后，会生成新的字符串
         * */

        System.out.println("Hello" + 100);
        System.out.println("a" + 1 + 2);
        System.out.println('a' + 1 + 2);
        System.out.println(1 + '2' + 3);
        System.out.println(1 + 2 + "3");
        System.out.println(1 + "2" + '3');

    }
}
