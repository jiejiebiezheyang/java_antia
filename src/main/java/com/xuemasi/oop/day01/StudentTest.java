package com.xuemasi.oop.day01;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/05/14:18
 * @Description:
 */
class Student {
    /*
     * 为了保证属性的安全性，Java提供了private（私有）关键字
     * 被private修饰的对象只能在当前类中访问
     * 又存在新的问题
     * 现在外界不能对私有的成员进行访问，但是外界有访问私有成员的需求
     * 解决方案：
     * 对外提供一种公共的访问方式（getter和setter），外界可以通过该方式访问私有的成员
     * */
    private String name;
    private int age;

    // getter/setter
    public String getName() {

        return name;
    }
    // Java存在就近原则（当存在多个相同名称变量的时候，使用最近的那个变量）
    // this：调用当前对象的属性
    public void setName(String name) {
        this.name =
                name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 120 || age < 0) {
            System.out.println("年龄有误");
            return;
        }
        this.age = age;
    }

    public void study() {
        System.out.println(name + "正在学习...");
    }

    public void show() {
        System.out.println("[name=" + name + ",age=" + age + "]");
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        // s.name = "张三";
        // s.age = 11;
        /*
         * 存在问题，
         * 外界可以随意的对Student对象的属性进行任意的设置,会带来数据的不安全性
         * */
        // 外界通过getter和setter访问私有成员变量
        s.setName("张三");
        s.setAge(11);
        System.out.println(s.getName() + "====" + s.getAge());
        s.show();
    }
}