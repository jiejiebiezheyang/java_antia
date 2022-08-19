package com.xuemasi.collection.day01;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/19/16:15
 * @Description:
 */
/*
 * 定义1个list集合，里面存储一些字符串，然后进行遍历
 * 遍历方式一：Iterator
 * 遍历方式二：for+get(index)
 * */
public class Test01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        traverse1(list);
        traverse2(list);
    }

    public static void traverse1(List list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void traverse2(List list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
