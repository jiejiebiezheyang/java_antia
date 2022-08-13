package com.xuemasi;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/13/14:09
 * @Description:
 */
interface Sing {
    void Sing();
}

abstract class Animal {
    String name;
    int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void Move();
}

class Bird extends Animal implements Sing {
    String color;

    public Bird() {
    }

    public Bird(String color) {
        this.color = color;
    }

    public Bird(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void Move() {
        System.out.println("飞");
    }

    @Override
    public void Sing() {
        if (name.equals("大雁"))
            System.out.println("民歌");
        else if (name.equals("鹦鹉"))
            System.out.println("山歌，英语");
    }
}

public class Test003 {
    public static void main(String[] args) {
        Sing b1 = new Bird("大雁", 1, "灰");
        Sing b2 = new Bird("鹦鹉", 2, "绿色");
        b1.Sing();
        b2.Sing();
    }
}
