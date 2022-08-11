package com.xuemasi.basic.day003;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/02/9:30
 * @Description: 循环语句
 */
public class LoopDemo001 {
    public static void main(String[] args) {
        // 打印输出10次"hello"
        // for
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello" + i);
        }
        System.out.println("=======================================");
        // while
        int j = 1;
        while (j <= 10) {
            System.out.println("Hello" + j);
            j++;
        }
        System.out.println("=======================================");
        //do-while 至少执行一次
        int k = 1;
        do {
            System.out.println("Hello" + k);
            k++;
        } while(k <= 10);

    }
}
