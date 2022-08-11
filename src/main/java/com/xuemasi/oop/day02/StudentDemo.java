package com.xuemasi.oop.day02;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/08/10:21
 * @Description:
 */
class Student {
    String name;
    int age;

    /*
     * 1) 如果没有定义构造器，系统会提供1个无参构造器
     * 2)
     * 3) 如果定义了构造器，系统将不会提供无参构造器
     * */
    // 无参构造
    public Student() {
    }

    // 有参构造
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("name=" + name + "，agr=" + age);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // 问题1：对象创建后，虽然有属性值，但是这个属性值没有意义。
        // 2)创建对象的时候会通过调用对应的构造方法创建对象
        Student s = new Student();// 调用无参构造器
        s.show();

        // 解决方式一：创建对象后属性自定义
        // 问题2：当对象存在后，不光要有属性值，且属性值要有意义，但是对象先于有意义的属性值前存在
        s.name = "zxf";
        s.age = 18;
        s.show();

        // 问题2解决：通过有参构造器
        Student s2 = new Student("张三丰", 28);
        s2.show();
    }
}
