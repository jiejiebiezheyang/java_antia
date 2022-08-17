package com.xuemasi.api.day02;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/17/14:03
 * @Description:
 */
public class RegexDemo02 {
    /*
     * 校验邮箱
     * @前5-10个单词
     * @后2-6个单词
     * .后面2-4个单词
     * */
    @Test
    public void demo1() {
        String s = "ltpcloud@qq.com";
        System.out.println(s.matches("\\w{5,10}@\\w{2,6}(.\\w{1,2}){1,2}"));
    }

    /*
     * 分割
     * */
    @Test
    public void demo2(){
        String s = "ab3ce123ef1234g412hij";
        // 需求通过数字进行分割
        String[] s1 = s.split("\\d+");
        System.out.println(Arrays.toString(s1));
        String[] s2 = s.split("\\d+",5);
        System.out.println(Arrays.toString(s2));
    }

    /*
     * 替换
     * */
    @Test
    public void demo3(){
        String s = "ab3ce123ef1234g412hij";
        // 需求将字符串中的每一组数字替换成*
        String s1 = s.replaceAll("\\d+","*");
        System.out.println(s1);
        String s2 = s.replaceFirst("\\d+","*");
        System.out.println(s2);
    }
}
