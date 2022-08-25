package cn.ltpcloud.oop.day04;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/10/17:03
 * @Description:
 */
/*
修饰局部变量
        基本类型：值不可改变
        引用类型：地址值不可改变
        注意：当使用final修饰形参的时候，形参变为常量。调用该方法时，形参只能被赋值一次*/

public class FinalDemo02 {
    public static void main(String[] args) {
        final int n = 1;
        // n = 2;
        final int[] arr = {1, 2, 3};
        change(arr);
        System.out.println(Arrays.toString(arr));
        // 引用类型：地址值不可改变
        // arr = new int[2];
        fun(18);
    }

    public static void fun(final int age) {
        // 使用final修饰形参的时候，形参变为常量。调用该方法时，形参只能被赋值一次
        // age = 22;
        System.out.println(age);
    }

    private static void change(int[] arr) {
        arr[0] += 2;
    }
}
