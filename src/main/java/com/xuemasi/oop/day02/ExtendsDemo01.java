package com.xuemasi.oop.day02;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/08/16:27
 * @Description:
 */

/*
 * 继承注意
 * 1)父类中的私有成员，子类不能继承
 * 虽然子类不能继承父类中私有的成员变量，但是可以继承对应的Getter（）和Setter（）方法
 * 带来了弊端：打破了类的封装性
 * 2) 父类中的静态static成员，子类不能继承
 * 3) 父类中的构造方法子类不能继承
 * */
class Fu {
    int n1 = 1;
    private int n2 = 2;

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public static void show() {
        System.out.println("fu show");
    }
}

class Zi extends Fu {

}

public class ExtendsDemo01 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        System.out.println(zi.n1);
        zi.setN2(100);
        System.out.println(zi.getN2());
        zi.show();
    }
}
