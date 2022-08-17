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
        System.out.println(repeat("ab", "abcdabcdabcdabcdabcd"));
        System.out.println(getStr("cqabse", "abfrrhsafdsfhh"));
        System.out.println(strSort("ikyhnvfrs"));
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

    public static int repeat(String str, String src) {
        int index = 0;
        int count = 0;

        while ((index = src.indexOf(str, index)) != -1) {
            count++;
            index = index + str.length();
        }
        return count;
    }

    // 4)
    public static String getStr(String str, String src) {
        if (src.contains(str)) {
            return str;
        }
        String temp;
        for (int i = 0; i < src.length() - 1; i++) {
            temp = str;
            temp = temp.substring(i);
            while (temp.length() > 1) {
                temp = temp.substring(0, temp.length() - 1);
                if (src.contains(temp)) {
                    return temp;
                }
            }

        }
        return "";
    }

    public static String strSort(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return String.valueOf(arr);
    }
}