package com.xuemasi.basic.day001;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/07/29/12:26
 * @Description: 进制
 */
public class Demo001 {
    /*
     * main方法
     * 程序入口
     * */
    public static void main(String[] args) {
        // 二进制
        System.out.println(0b100);
        // 八进制
        System.out.println(0100);
        // 十进制
        System.out.println(100);
        // 十六进制
        System.out.println(0x100);

        // 十进制转二进制
        System.out.println(Integer.toBinaryString(56));

    }
}
