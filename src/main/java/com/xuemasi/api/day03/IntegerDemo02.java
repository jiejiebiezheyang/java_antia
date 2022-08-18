package com.xuemasi.api.day03;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/18/9:56
 * @Description:
 */
/*
 * Integer赋值
 * 如果是直接赋值，或者通过valueOf赋值，且值在-128~127之间，会先创建一个缓冲区，
 * 然后在创建Integer对象，之后将创建好的Integer对象放入缓冲区，
 * 如果后来又需要创建该对象，直接从缓冲区获取。
 * */
public class IntegerDemo02 {
    public static void main(String[] args) {
        Integer it1 = new Integer(127);
        Integer it2 = new Integer(127);
        System.out.println(it1 == it2);
        System.out.println(it1.equals(it2));
        Integer it3 = new Integer(128);
        Integer it4 = new Integer(128);
        System.out.println(it3 == it4);
        System.out.println(it3.equals(it4));

        Integer it5 = 127;
        Integer it6 = 127;
        System.out.println(it5 == it6);
        System.out.println(it5.equals(it6));
        Integer it7 = 128;
        Integer it8 = 128;
        System.out.println(it7 == it8);
        System.out.println(it7.equals(it8));
    }
}