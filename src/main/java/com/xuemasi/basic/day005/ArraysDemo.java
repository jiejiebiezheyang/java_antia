package com.xuemasi.basic.day005;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/04/12:00
 * @Description:
 */

public class ArraysDemo {
    public static void main(String[] args) {
        // 数组工具栏
        int[] arr = {3, 1, 5, 2, 4};
        //1)返回数组中元素的字符串表示
        System.out.println(Arrays.toString(arr));
        //2)排序（由小到大）
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //3）二分法查找（元素唯一且排序）
        System.out.println(Arrays.binarySearch(arr, 0));
        //4)比较2个数组是否相等
        int arr1[] = {1, 2, 3};
        int arr2[] = {2, 2, 3};
        System.out.println(Arrays.equals(arr1, arr2));
        //5)数组填充
        Arrays.fill(arr, 10);
        System.out.println(Arrays.toString(arr));

        // 6)数组复制
        char[] src = {'a', 'b', 'c', 'd', 'e'};
        // 6.1整体复制
        char[] dest1 = Arrays.copyOf(src, src.length);
        System.out.println(Arrays.toString(dest1));
        // 6.2数组的扩容
        char[] dest2 = Arrays.copyOf(src, src.length + 1); // [a, b, c, d, e,  ]
        System.out.println(Arrays.toString(dest2));
        // 6.2数组的减容
        char[] dest3 = Arrays.copyOf(src, src.length - 1); // [a, b, c, d,]
        System.out.println(Arrays.toString(dest3));

        /*
         * 7)System类中的arraycopy()
         * 参数1：复制源 参数2：复制的起始位置
         * 参数3：目的端 参数4：目的端接收的起始位置  参数5：复制的元素个数
         */
        char[] dest = {'B', 'Y', 'E', '8', '8', '6'};
        // 需求将dest中的YE8替换成abc
        System.arraycopy(src, 0, dest, 1, 3);
        System.out.println(Arrays.toString(dest));

    }
}
