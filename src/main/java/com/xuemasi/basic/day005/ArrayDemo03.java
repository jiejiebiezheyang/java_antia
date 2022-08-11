package com.xuemasi.basic.day005;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/04/16:52
 * @Description:
 */
public class ArrayDemo03 {
    public static void main(String[] args) {
        // 动态初始化
        // 1)一维数组长度固定
        // 创建一个二维数组，里面存储3个一维数组，一维数组长度都为二
        int[][] arr1 = new int[3][2];

        // 2)一维数组长度不固定
        // 创建一个二维数组，里面存储3个一维数组，一维数组长度没有定义（二维数组中的元素默认为null）
        int[][] arr2 = new int[3][];
        // 动态给二维数组元素复制
        arr2[0] = new int[2];
        arr2[1] = new int[]{1, 2, 3};
        arr2[2] = new int[3];

        // 静态初始化
        int[][] arr3 = {{1, 2, 3}, {2}, {2, 3}};
        show(arr3);
    }

    // 二维数组遍历
    public static void show(int[][] arr) {
        // 遍历获取二维数组中的元素一维数组
        for (int i = 0; i < arr.length; i++) {
            // 遍历获取一维数组中的元素
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
