package cn.ltpcloud.collection.day03;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/24/14:30
 * @Description:
 */
/*
 * 使用Deque模拟栈
 * */
public class DequeDemo {
    public static void main(String[] args) {
        // 创建双端队列
        Deque<String> deque = new LinkedList<>();
        // 压入元素
        deque.push("hello");
        deque.push("world");
        deque.push("java");
        System.out.println(deque);

        System.out.println("首元素(栈顶元素):" + deque.peek()); // java

        // 弹出元素
        while (deque.size()>0){
            System.out.println(deque.pop());
        }
        System.out.println(deque);
    }
}
