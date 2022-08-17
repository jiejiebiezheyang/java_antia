package com.xuemasi.api.day02;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/17/14:45
 * @Description:
 */
public class StringBuilderDemo01 {

    // 构造
    @Test
    public void demo1() {
        // 以默认容量（16）创建空的字符串缓冲区对象
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);

        // 以指定容量创建空StringBuilder对象
        StringBuilder sb2 = new StringBuilder(10);
        System.out.println(sb2);

        // 以指定字符串创建StringBuilder对象
        StringBuilder sb3 = new StringBuilder("hello");
        System.out.println(sb3);
    }

    /*
     * 常用功能
     * */
    @Test
    public void demo2() {
        StringBuilder sb = new StringBuilder();
        // 添加的元素类型可以是任意类型
        // 追加
        sb.append("hello");
        // 链式编程（调用方法返回对象，再次调用对象）
        sb.append(100);
        // 在指定位置添加元素
        sb.insert(5, "world");
        System.out.println(sb);

        // 删
        // 删除指定位置的元素
        sb.deleteCharAt(10);
        System.out.println(sb);
        // 删除指定范围的元素
        sb.delete(10, 12);
        System.out.println(sb);

        // 改
        // 设置指定位置的元素
        sb.setCharAt(5, 'W');
        System.out.println(sb);
        // 替换指定范围内的元素
        sb.replace(5, 10, "Java");
        System.out.println(sb);

        // 查
        System.out.println("查询第一个元素：" + sb.charAt(0));
        System.out.println("查询容量：" + sb.capacity());
        System.out.println("长度:" + sb.length());

        // 其他功能
        // 反转
        System.out.println(sb.reverse());
        StringBuilder sb2 = sb.reverse();
        // 截取
        System.out.println(sb.substring(5));
        System.out.println(sb2.substring(0, 5));
    }
}
