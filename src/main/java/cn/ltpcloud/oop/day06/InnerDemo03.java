package cn.ltpcloud.oop.day06;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/12/10:13
 * @Description:
 */
class Outher {
    int n1 = 1;
    static int n2 = 2;

    static class Inner {
        public void show1() {
            // System.out.println(n1);
            System.out.println(n2);
        }

        // 如果成员内部类中存在静态的成员，则该成员内部类了一定是静态成员内部类
        public static void show2() {
            // System.out.println(n1);
            System.out.println(n2);
        }
    }
}

public class InnerDemo03 {
    public static void main(String[] args) {
        // 外界创建静态内部类对象
        Outher.Inner oi = new Outher.Inner();
        oi.show1();
        oi.show1();

        Outher.Inner.show2();
    }
}
