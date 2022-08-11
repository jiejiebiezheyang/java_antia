package com.xuemasi.oop.day02;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/08/11:42
 * @Description:
 */

class Teacher {
    private String name;
    private int age;

    public Teacher() {

    }

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, int age) {
        // this.name = name;
        // 3) 调用构造方法
        this(name);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String show() {

        // 2) 调用成员方法
        return "name=" + this.getName();
    }
}

public class ThisDemo {
    /*
     * this:表示当前对象的引用
     * 可以调用当前类中的成员变量、成员方法和构造方法
     * */
    public static void main(String[] args) {

    }
}
