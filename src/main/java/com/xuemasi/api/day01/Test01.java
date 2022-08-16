package com.xuemasi.api.day01;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/16/16:39
 * @Description:
 */
public class Test01 {
    public static void main(String[] args) {
        String s = " abc ";

        System.out.println(trim(s));
        System.out.println(reverse("abcdefg", 3, 7));
    }

    public static String trim(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (chars[start] == ' ') {
            start++;
        }
        while (chars[end] == ' ') {
            end--;
        }

        return String.valueOf(chars, start, end);
    }

    /**
     *
     */
    public static String reverse(String str, int startIndex, int endIndex) {
        char[] chars = str.toCharArray();
        endIndex--;

        for (; startIndex < endIndex; startIndex++, endIndex--) {
            char temp = chars[startIndex];
            chars[startIndex] = chars[endIndex];
            chars[endIndex] = temp;
        }
        return String.valueOf(chars);
    }

}
