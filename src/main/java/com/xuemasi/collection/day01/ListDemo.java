package com.xuemasi.collection.day01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/19/16:08
 * @Description:
 */
/*
 * List：元素有序可重复
 * 定义了一些关于索引的方法，用来进行增删改查操作
 * */
public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("java");
        list.add("hello");
        list.add("world");

        // 指定位置处添加指定元素
        list.add(2, "JavaSE");
        // 删除指定位置处元素
        list.remove(list.size() - 1);
        // 修改指定位置处元素
        list.set(1, "JAVA");
        // 查询指定位置处元素
        System.out.println(list.get(0));
        System.out.println(list);
    }
}
