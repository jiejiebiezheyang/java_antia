package cn.ltpcloud.basic.day005;

import org.jetbrains.annotations.Contract;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/04/10:10
 * @Description:
 */
public class Test01 {
    public static void main(String[] args) {
        // 创建一个长度为6的int型数组，要求取值为1-30，同时元素值各不相同
        int[] arr = new int[6];

        for (int i = 0; i < 20; i++) {
            createArr(arr);
            System.out.println(Arrays.toString(arr));
        }
        boolean b = cantains(arr, 2);
    }

    private static void createArr(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(30) + 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }
    }

    public static boolean cantains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}

