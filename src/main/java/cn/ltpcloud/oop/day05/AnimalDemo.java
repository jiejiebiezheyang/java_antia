package cn.ltpcloud.oop.day05;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/11/9:44
 * @Description:
 */
// 抽象类不可以实例化
abstract class Animal {
    /*
     * Animal中的eat方法是一个抽象的行为，不能给出具体的行为方式
     * Java提供了抽象方法，解决上面的问题
     * */
    public abstract void eat();
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("吃鱼");
    }
}

interface Skill {
    abstract void guide();
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("吃骨头");
    }
}

// 实现类,需要实现接口中所有的抽象方法
class GuideDog extends Dog implements Skill {
    public void guide() {
        System.out.println("导盲");
    }
}


public class AnimalDemo {
    public static void main(String[] args) {
        /*
         * animal是很多类别的总成,是抽象的概念,是不能是实例话的
         * java提供了抽象类的概念，帮我们解决上面的问题
         * */
        // Animal a = new Animal();
        // a.eat();

        // 接口引用指向实现类对象（多态）
        Skill skill = new GuideDog();
        skill.guide();
    }
}
