package com.xuemasi.basic.day003;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/02/11:47
 * @Description: 循环练习
 */
public class Test06 {
    /* 输入高度，输出倒直角角形。如：输入4, 将输出如下图形
     * ####
     * ###
     * ##
     * #
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("要打印几层：");
        int a = sc.nextInt();
        for (int i = a; i >0 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
