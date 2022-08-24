package com.xuemasi.collection.day03;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/24/14:25
 * @Description:
 */
public class QueueDemo {
    public static void main(String[] args) {
        // 创建队列
        Queue<String> queues = new LinkedList<>();
        // 入队
        queues.offer("hello");
        queues.offer("world");
        queues.offer("javaSE");
        System.out.println(queues);
        // 获取队列首元素
        System.out.println(queues.peek()); // "hello"
        while (queues.size() > 0) {
            System.out.println(queues.poll());
        }
        System.out.println(queues);
    }
}
