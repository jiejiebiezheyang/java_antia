package com.xuemasi.oop.day04.single;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/10/16:12
 * @Description:
 */
/*
 * 单例设计模式（内存中有且只有该类的一个实例）
 * 1）饿汉式
 *  类加载唯一实例就创建了
 * 2）懒汉式
 * 当调用方法的时候，才去创建唯一是实例
 * */

// 饿汉式
class Student {
    // 1)构造器私有（不让外界创建该类实例）
    private Student() {
    }

    // 2)由当前类提供唯一实例
    private static Student s = new Student();

    // 3)提供公共方法，来获取唯一实例
    public static Student getInstance() {
        return s;
    }
}



public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = Student.getInstance();
        Student s2 = Student.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}
