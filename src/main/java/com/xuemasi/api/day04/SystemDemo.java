package com.xuemasi.api.day04;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/19/9:43
 * @Description:
 */
public class SystemDemo {
    public static void main(String[] args) {
        Student s = new Student("xw");
        System.out.println(s);

        // 结束jvm
        // System.exit(0);
        // System.out.println(s);

        s = null;
        // 调用gc（垃圾处理机制）
        System.gc();

    }
}
