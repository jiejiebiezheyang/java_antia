package com.xuemasi.oop.day04;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/10/11:37
 * @Description:
 */
class Animal {
    String name = "Animal";

    public void eat() {
        System.out.println("吃");
    }
}

class Cat extends Animal {
    String name = "Cat";
    int age = 1;

    @Override
    public void eat() {
        System.out.println("吃鱼");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("吃屎");
    }

    public void CatchMouse(){
        System.out.println("逮老鼠");
    }
}

public class DuotaiDemo {
    public static void main(String[] args) {
        // 父类引用指向子类对象
        Animal a1 = new Cat();
        Animal a2 = new Dog();


        // 成员变量:访问的是父类中的属性，如果父类没有，不能访问
        System.out.println(a1.name);
        // System.out.println(a1.age);

        // 成员方法: 访问的是子类中的重写的方法，如果父类没有，不能访问
        a1.eat();
        // a1.catchMouse();

        // 静态方法:访问的是父类中的静态方法，如果父类没有，不能访问
        // 通过上面的访问特性，可以验证静态的重写方法不是正真的重写，因为是真的重写，一定访问的是重写的方法
    }
}
