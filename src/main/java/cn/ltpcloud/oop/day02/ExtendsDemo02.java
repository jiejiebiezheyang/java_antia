package cn.ltpcloud.oop.day02;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/08/16:42
 * @Description:
 */

/*
 * 继承注意2：
 * 构造方法不能继承
 *
 * */

class Fu2 {
    String name;

    public Fu2() {
    }

    public Fu2(String name) {
        this.name = name;
    }
}

class Zi2 extends Fu2 {
    // 定义自有属性
    int age;

    public Zi2() {
        // 子类构造会默认调用父类无参构造器（对父类中的属性进行系统默认初始化）
        super(); // 可以省略
    }

    public Zi2(int age) {
        this.age = age;
    }

    public Zi2(String name, int age) {
        // this.name = name;
        // 2)一旦我们在子类构造中显示的指明了调用父类某个构造器，这时候就不会取调用父类的无参构造了
        super(name); // 调用父类有参构造
        this.age = age;
    }

    // 定义自有的方法，实现功能的扩展
    public void show(){
        System.out.println("name="+this.name);
        System.out.println("name="+super.name);
    }
}

public class ExtendsDemo02 {
    public static void main(String[] args) {
        Zi2 zi2 = new Zi2("儿子", 11);
        zi2.show();
    }
}
