package com.xuemasi.oop.day02;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/08/17:15
 * @Description: 方法重写
 */
/*
 * 方法重写
 * 1)在子父类中，出现方法签名相同的方法
 * 方法签名：方法名+参数列表
 *
 * 2)规则
 * 修饰符：子类的修饰权限不能比父类的低
 * 返回值类型
 * 基本类型，void：子父类一致
 * 引用类型：子类可以和父类一致，也可以是父类返回值类型的子类型
 * 方法名：子父类一致
 * 参数列表:子父类一致
 * */
class Father {
    public void eat() {
        System.out.println("吃大白菜");
    }

    public Animal createAnimal(){
        return null;
    }
}

class Son extends Father {

    @Override  // 校验方法是否为重写方法
    public void eat() {
        System.out.println("吃青菜");
    }
    @Override
    public Cat createAnimal(){
        return null;
    }
}

public class ExtendsDemo03 {
    public static void main(String[] args) {
        Son son = new Son();
        son.eat();
    }
}
