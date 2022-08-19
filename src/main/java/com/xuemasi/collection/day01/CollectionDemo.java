package com.xuemasi.collection.day01;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/19/14:24
 * @Description:
 */
public class CollectionDemo {
    @Test
    public void demo1() {
        // 创建集合
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        c2.add("hello");
        c2.add("world");

        // 增
        // 1)添加指定元素
        c1.add("hello");
        c1.add("Java");
        // 2)添加指定集合中所有元素
        c1.addAll(c2);

        // 删除
        // 3)清空
        // c1.clear();
        // 4)删除指定元素，只删除符合的第一个元素，只会删除一个
        //c1.remove("hello");
        // 5)删除指定集合中的所有元素
        // c1.removeAll(c2);

        // 判断功能
        // 6)是否为空
        System.out.println(c1.isEmpty());
        // 7)是否包含指定元素
        System.out.println(c1.contains("javaSE"));
        // 8)是否包含指定集合中的所有元素
        System.out.println(c1.containsAll(c2));
        System.out.println(c1);

        // 9)集合大小（有效元素的个数）
        System.out.println(c1.size()); // 4
        // 集合转数组
        Object[] arrays = c1.toArray();
    }

    @Test
    public void demo2() {
        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("a");
        c1.add("a");
        Collection c2 = new ArrayList<>();
        c2.add("a");
        c2.add("b");
        c2.add("d");
        /*
         * 集合交集，交集返回给了c1，
         * 返回值：判断从是否发生变化，发生变化返回true，否则返回false
         * */
        boolean b1 = c1.retainAll(c2);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(c2);
    }

    @Test
    public void demo3() {
        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        // 获取迭代器(遍历集合)
        Iterator it = c1.iterator();

        while(it.hasNext()){ // 如果有下一个元素
            String next = (String) it.next();// 获取下一个元素
            System.out.println(next);
        }

    }
}