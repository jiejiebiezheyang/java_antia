package com.xuemasi.oop.day04;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/10/16:51
 * @Description:
 */
/*final
表示最终的意思，可以修饰类、成员变量、成员方法、局部变量
        修饰类：
            类不能被继承
        修饰成员变量：
            变量变为常量，值不可以改变
static final 用来修饰属性：全局常量
        修饰成员方法：
            方法不能被重写
        修饰局部变量
            基本类型：值不可改变
            引用类型：地址值不可改变
        注意：当使用final修饰形参的时候，形参变为常量。调用该方法时，形参只能被赋值一次*/
final class A {

}

//修饰类：类不能被继承
// class B extends A { }
class C {
    int num = 1;
    // 修饰成员变量：变量变为常量，值不可以改变
    final int value = 2;
    // 常量名都是大写，如果有多个单词需要用下划线_隔开
    final double PI = 3.14;
    // final 一般和static一起使用
    static final int MAX_VALUE = 999;
    // 一般成员常量用public修饰（全局常量）
    public static final int MIN_VALUE = 1;

    public final void show(){}
}

class D extends C{
    //  修饰成员方法：方法不能被重写
    //public final show(){}

}

public class FinalDemo01 {
    public static void main(String[] args) {
        C c = new C();
        c.num = 2;
        // c.value = 4;
        double pi = Math.PI;
    }
}
