package cn.ltpcloud.oop.day02;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/08/9:50
 * @Description:
 */
public class ArgsDemo {
    /*
     * 形参类型问题
     * 1)形参是基本类型
     *  形参改变，实参不会变
     * 2)形参是引用类型
     *  形参改变，实参会跟着改变（特列：String）
     * */
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("change前，a=" + a + ",b=" + b);
        change(a, b);
        System.out.println("change后，a=" + a + ",b=" + b);

        int[] arr = {1, 2, 3};
        System.out.println("change前，a=" + Arrays.toString(arr));
        change(arr);
        System.out.println("change后，a=" + Arrays.toString(arr));
    }

    private static void change(int[] arr) {
        arr[0] += 10;
    }

    private static void change(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

}