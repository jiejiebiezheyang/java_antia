package com.xuemasi.oop.day05;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/11/11:34
 * @Description:
 */

// 接口中的成员组成
interface JDK7 {
    // 1)常量：默认修饰符为public、static、final
    // int a = 1;
    public static final int NUM = 1;
    int MAN_VALUE = 100;

    // 2）抽象方法：默认修饰符static abstract(可以或全部省略)
    public abstract void show1();

    abstract void show2();

    public void show4();

    void show3();
}

interface JDK8 {
    // 1) 常量
    // 2) 抽象方法
    // 3) 默认方法（实现类使用）
    default void fun() {
        System.out.println("default fun");
    }

    // 4) 静态方法（接口使用）
    static void fun1() {
        System.out.println("static");
    }

}

class jdk8 implements JDK8 {

}

public class InterfaceDemo01 {
    public static void main(String[] args) {

    }
}
