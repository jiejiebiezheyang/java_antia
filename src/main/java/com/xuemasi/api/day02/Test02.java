package com.xuemasi.api.day02;

import java.util.Random;

import static com.xuemasi.api.day01.Test01.strSort;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/17/10:03
 * @Description:
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println(getStr());
    }

    public static String getStr() {
        // 获取所有小写字母
        char[] c = getChar();
        int index = -1;
        Random r = new Random();
        // 小写字母下标，默认flase（表示未被抽取过）
        boolean[] flags = new boolean[c.length];
        // 存取抽取到的随机字母
        char[] result = new char[c.length];
        int i = 0;//result的下标

        while (i < 26) {
            index = r.nextInt(c.length);
            // 判断当前获取的随机元素是否被抽取到
            if (!flags[index]) {
                result[i++] = c[index];
                flags[index] = true;
            }
        }
        return String.valueOf(c);
    }

    private static char[] getChar() {
        char[] c = new char[26];
        for (int i = 0; i < 26; i++) {
            c[i] = (char) (i + 97);
        }
        return c;
    }
}