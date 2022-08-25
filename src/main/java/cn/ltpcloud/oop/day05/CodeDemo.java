package cn.ltpcloud.oop.day05;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/11/16:17
 * @Description:
 */

class Foo {
    String s;

    // 静态代码块
    static {
        System.out.println("静态代码块,一般用于初始化资源");
    }

    // 构造代码块：在执行构造方法前，需要先执行构造代码块
    {
        System.out.println("hello");
    }

    public Foo() {
        System.out.println("hello2");
    }

    public Foo(String s) {
        System.out.println("hello3");
        this.s = s;
    }
}

public class CodeDemo {
    public static void main(String[] args) {
        // 局部代码块
        {
            int a = 10;
            // System.out.println(a);
        }

        Foo foo = new Foo();
        Foo foo2 = new Foo("hello");
    }
}
