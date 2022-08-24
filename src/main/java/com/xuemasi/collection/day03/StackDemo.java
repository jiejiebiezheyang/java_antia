package com.xuemasi.collection.day03;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/24/9:37
 * @Description:
 */
public class StackDemo {
    public static void main(String[] args) {
        // 创建栈
        Stack<String> stack = new Stack<>();
        // 压栈
        stack.push("a");
        stack.push("b");
        stack.push("c");

        // 获取栈顶元素
        System.out.println(stack.peek());

        System.out.println(stack);
        // 弹栈
        // for正向遍历存在问题，每次遍历size的值发生了改变
        /*for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.pop());
        }*/

        // 解决方式一:for逆向遍历
        /*for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.pop());
        }*/

        // 解决方式二:使用while循环
        /*while (stack.size()>0){

        }*/

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println(stack);
    }
}
