package com.xuemasi;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/09/9:49
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        char[] a = {'s', 'y', 'j', 'd'};

        sort(a);

        System.out.println(Arrays.toString(a));

    }

    public static void sort(char[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int a = arr[i];
                int b = arr[j];
                if (a < b) {
                    char c = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;
                }
            }
        }
    }
}
