package com.xuemasi.collection.day03;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/24/17:18
 * @Description:
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "java", "world");
        System.out.println(list);
        // 注意通过adList创建的集合长度不能变:UnsupportedOperationException
        // list.add("javaSE");
        list.set(0,"javaSE");
        System.out.println(list);
    }
}
