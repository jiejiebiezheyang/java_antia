package com.xuemasi.oop.day04;

import java.sql.SQLOutput;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/10/17:12
 * @Description:
 */

class Father {
    String name;

    public Father() {
    }

    public Father(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("吃白菜");
    }
}

class Son extends Father {
    String hobby;

    public Son() {

    }

    public Son(String name, String hobby) {
        super(name);
        this.hobby = hobby;
    }

    @Override
    public void eat() {
        System.out.println("吃米");
    }

    public void playGame() {
        System.out.println("玩游戏");
    }
}

class Zii extends Father {
}

// 需求：查看不同儿子的姓名和吃的东西
public class DuotaiDemo02 {
    public static void main(String[] args) {
        // 向上转型：由子类型默认转成父类型
        Father s1 = new Son("阿达", "赛车");
        Zii zi = new Zii();
        zi.name = "asd";
        Tool.show(s1);
        Tool.show(zi);

        // 向下转型：由父类型强制转成子类型
        Son s = (Son) s1;

        // 向下转型注意：只能转成本身的类型，不可以转乘其他子类型异常
        // 不然会发生ClassCastException（类型转换异常）
        Zii a = (Zii)s1;

    }
}

class Tool {
    // 需求：查看son1的姓名和吃的东西
    public static void showSon1(Son son) {
        System.out.println(son.name);
        son.eat();
    }

    // 需求：查看zi的姓名和吃的东西
    public static void showZi(Zii zi) {
        System.out.println(zi.name);
        zi.eat();
    }

    public static void show(Father father) {
        System.out.println(father.name);
        father.eat();
    }
}
