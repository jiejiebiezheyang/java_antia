package cn.ltpcloud.oop.day06;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/12/11:36
 * @Description:
 */

class Foo {
    int n1 = 1;
    private int n2 = 2;

    public void show() {
        // 局部内部类访问其所在方法中的局部变量，需要添加final变为常量（Jdk8+ 可以省略final）
        final int n1 = 1;
        int n2 = 2;
        //局部内部类
        class Fi {
            public void show() {
                System.out.println(n1);
                System.out.println(n2);
            }
        }
        // 只能在局部内部类所在方法中创建局部内部类方法
        Fi fi = new Fi();
        fi.show();
    }

    public void method() {
        // 外部类成员方法中也不能创建内部类对象
        // Fi fi = new Fi();
    }
}

public class InnerDemo04 {
    public static void main(String[] args) {
        // 外界不能创建局部内部类对象
        // Foo.Fi fi = new Foo().new Fi();

    }
}
