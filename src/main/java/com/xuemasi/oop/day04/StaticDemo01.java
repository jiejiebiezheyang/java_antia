package com.xuemasi.oop.day04;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/10/14:12
 * @Description:
 */

/*
 * 静态的访问
 * */
class Aoo {
    int n1 = 1;
    static int n2 = 2;

    public void show1() {
        System.out.println("show1");
    }

    public static void show2() {
        System.out.println("show2");
    }

    // 非静态方法可以访问任意的成员
    public void method1() {
        System.out.println(n1);
        System.out.println(n2);
        show1();
        show2();
    }

    // 静态方法只能访问静态成员
    public static void method2() {
        // System.out.println(n1);
        System.out.println(n2);
        // show1();
        show2();
    }
}

public class StaticDemo01 {
    public static void main(String[] args) {
        Aoo aoo = new Aoo();
        System.out.println(aoo.n1);
        System.out.println(aoo.n2);
        System.out.println(Aoo.n2);

        aoo.method1();
        aoo.method2();

        // 通过静态访问的方式访问静态的成员(建议)
        Aoo.method2();
    }

}
