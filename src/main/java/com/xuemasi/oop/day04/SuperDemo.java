package com.xuemasi.oop.day04;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/10/10:28
 * @Description:
 */
/*
 * super表示父类存储空间的表示
 * 用来调用父类的成员变量和成员方法、构造方法
 * */

class Fu {
    String name = "fu";

    public Fu() {

    }

    public Fu(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("吃白菜");
    }
}

class Zi extends Fu {
    String name = "zi";
    int age = 18;

    public Zi() {

    }

    public Zi(String name, int age) {
        // 调用父类构造
        super(name);
        this.age = age;


    }

    @Override
    public void eat() {
        System.out.println("吃萝卜");
    }

    public void show(){
        System.out.println("father Name = "+super.name); // 调用父类中的成员变量
        System.out.println("son Name = "+this.name);
        System.out.println("son Name = "+name);

        super.eat(); // 调用父类中的成员方法
        this.eat();
        eat();
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show();
    }

}
