package com.xuemasi.collection.day03;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/24/9:52
 * @Description:
 */
/*
 * HashSet:元素无序且唯一
 * */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("hello");
        hashSet.add("world");
        hashSet.add("java");
        hashSet.add("javaSE");
        hashSet.add("javaEE");
        hashSet.add("hello");

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
