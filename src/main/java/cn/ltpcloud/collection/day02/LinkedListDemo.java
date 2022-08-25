package cn.ltpcloud.collection.day02;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/22/10:51
 * @Description:
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("hello");
        ll.add("world");

        // 对首尾元素的操作
        ll.addFirst("first");
        ll.addLast("last");
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
