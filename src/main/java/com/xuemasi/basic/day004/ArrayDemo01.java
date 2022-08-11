package com.xuemasi.basic.day004;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/03/14:32
 * @Description:
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        // 动态初始化
        int[] arr1 = new int[3];
        // 访问数组元素
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

        // 自定义元素值
        arr1[0] = 1;

        // 静态初始化
        char[] arr2 = new char[]{'b', 'b', 'a'};
        /*System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);*/

        System.out.println("数组长度：" + arr2.length);
        // for (int i = 0; i < arr2.length; i++) {
        //     System.out.println(arr2[i]);
        // }

        // 静态初始化简写 只适用于初始化
        char[] arr3 = {'a','b','c','d'};
        // arr3 = {} ×
        // arr3 = new char[]{} √
        // for (int i = 0; i < arr3.length; i++) {
        //     System.out.println(arr3[i]);
        // }

        showArr(arr3);
        showArr(arr3);
    }
    // 遍历char数组
    public static void showArr(char[] arr ){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
