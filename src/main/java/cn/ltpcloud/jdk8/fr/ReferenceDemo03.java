package cn.ltpcloud.jdk8.fr;

import java.util.Arrays;
import java.util.function.Function;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/05/17:34
 * @Description:
 */
/*
 * 数组引用
 * 数据类型[]::new
 * */
public class ReferenceDemo03 {
    public static void main(String[] args) {
        Function<Integer, int[]> fun1 = length -> new int[length];
        int[] arr1 = fun1.apply(5);
        System.out.println(Arrays.toString(arr1));

        Function<Integer, int[]> fun2 = int[]::new;
        int[] arr2 = fun2.apply(3);
        System.out.println(Arrays.toString(arr2));
    }
}
