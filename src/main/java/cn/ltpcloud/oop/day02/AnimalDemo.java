package cn.ltpcloud.oop.day02;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/08/14:51
 * @Description:
 */
/*
 * 继承的由来
 * 一开始在Cat和Dog类中定义了相同的属性和行为（代码冗余）
 * 解决问题:将冗余代码放到一个新的类中（Animal）
 * 新的问题：虽然解决了冗余代码，但Cat和Dog也不再拥有之前的属性和行为了
 * 解决：Java提供了继承解决上面问题
 *
 * 继承：子类继承父类，可以使用父类中非私有的成员(成员变量和成员方法)
 * 格式：子类 extents 父类{}
 * */
class Animal {
    String name;
    int age;


    public void eat() {
        System.out.println("吃");
    }

}

class Cat extends Animal {

}

class Dog extends Animal {

}

public class AnimalDemo {
    public static void main(String[] args) {
        Cat c = new Cat();
        System.out.println(c.name);
        System.out.println(c.age);
        c.eat();
    }
}
