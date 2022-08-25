package cn.ltpcloud.oop.day06;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/12/14:06
 * @Description:
 */

abstract class Animal {

    public abstract void eat();
}

class AnimalTool {
    public static void show(Animal animal) {
        animal.eat();
    }
}

public class InnerDemo05 {
    public static void main(String[] args) {
        // 通过匿名内部类Animal的子类对象
        Animal a = new Animal() {
            @Override
            public void eat() {
                System.out.println("吃鱼");
            }
        };
        AnimalTool.show(a);
    }
}
