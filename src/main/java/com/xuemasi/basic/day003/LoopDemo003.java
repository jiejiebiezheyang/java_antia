package com.xuemasi.basic.day003;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/02/11:20
 * @Description: 嵌套循环
 */
public class LoopDemo003 {
    /*
     * 打印如下图形
     * *****
     * *****
     * *****
     * *****
     * */
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("============================");

        // 如何跳出单层循环
        bf:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    // break;
                    break bf; // 跳出指定标签的循环
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
