package com.xuemasi.basic.day005;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/04/15:47
 * @Description:
 */
public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] arr = {3,2,5,1,4};
        //bubbleSort(arr);
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //快速选择排序
    private static void selectSort(int[] arr) {
        //i:比较的轮次;每一轮前面元素下标
        for(int i=0;i<arr.length-1;i++) {
            //j:每一轮比较的次数;每一轮后面元素下标
            for(int j=i+1;j<arr.length;j++) {
                //前面和后面所有的进行比较，小的往前放
                if(arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    //冒泡排序
    private static void bubbleSort(int[] arr) {
        //i:比较的轮次
        for(int i=0;i<arr.length-1;i++) {
            //j:每一轮比较的次数;当前比较的前面元素下标
            for(int j=0;j<arr.length-1-i;j++) {
                /*
                 * 相邻2个元素进行比较，大的往后放
                 * i=0
                 * 	j=0		0	1
                 * 	j=1		1	2
                 * 	j=2		2	3
                 * 	j=3		3	4
                 */
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
