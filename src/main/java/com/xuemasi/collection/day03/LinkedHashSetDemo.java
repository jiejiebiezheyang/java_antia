package com.xuemasi.collection.day03;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/24/11:36
 * @Description:
 */
/*
 * 里面的元素有序且唯一
 * 链表办证元素序,由哈希表保证元素唯一
 * */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("javaSE");
        linkedHashSet.add("javaEE");
        linkedHashSet.add("hello");
        System.out.println(linkedHashSet);
    }
}
