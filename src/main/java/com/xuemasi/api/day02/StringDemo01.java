package com.xuemasi.api.day02;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/17/10:34
 * @Description:
 */
/*
 * 编码：String --> byte[]:调用String的getBytes()
 * 解码：byte[] --> String:调用String的构造器
 * */
public class StringDemo01 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "hello太阳";
        // 编码操作
        // 1）默认编码表()进行编码
        byte[] bytes = s.getBytes();
        // [104, 101, 108, 108, 111, -27, -92, -86, -23, -104, -77]
        System.out.println(Arrays.toString(bytes));
        byte[] bytes2 = s.getBytes("gbk");
        System.out.println(Arrays.toString(bytes2));

        // 解码操作
        // 默认编码进行解码
        String s1 = new String(bytes);
        System.out.println(s1);
        // 以指定编码进行解码
        String s2 = new String(bytes2, "gbk");
        System.out.println(s2);

        // 注意如果编码和解码使用的编码表不一致(会产生锟斤拷)
        String s3 = new String(bytes2, "Unicode");
        System.out.println(s3);
    }
}
