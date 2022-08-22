package com.xuemasi.collection.day02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/22/17:45
 * @Description:
 */
/*
 * 增强for：专门用来简化数组和集合的遍历
 * */
public class AddFor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');

        // 遍历数组
        for (int n : arr) {
            System.out.println(n);
        }
        // 遍历集合
        for (Character c : list) {
            System.out.println(c);
        }
    }
}
