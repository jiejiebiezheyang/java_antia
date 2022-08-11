package com.xuemasi.basic.day004;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/03/17:18
 * @Description: 线性查找
 */
public class Test09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12, 54, 83, 4, 14, 6,};
        System.out.println("输入要查找的内容:");
        int s = sc.nextInt();
        search(arr, s);
    }

    public static void search(int[] arr, int n) {
        for (int i = 0; i <= arr.length; i++) {
            if (i == arr.length) {
                System.out.println("数组中没有此元素");
            } else if (arr[i] == n) {
                System.out.println("数组下标为：" + i);
            }
        }
    }
}
