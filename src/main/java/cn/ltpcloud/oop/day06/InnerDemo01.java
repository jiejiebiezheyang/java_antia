package cn.ltpcloud.oop.day06;


import cn.ltpcloud.oop.day06.Room.Student;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/12/9:42
 * @Description:
 */

class Room {

    int length = 10;
    private int width = 5;

    // 内部类
    class Student {
        String name = "张三";

        public void look() {
            // 内部类可以直接访问外部类的成员
            System.out.println(length);
            System.out.println(width);
        }
    }

    public void watch() {
        // 外部类的成员想要访问内部类的成员，需要创建内部类对象
        Student s = new Student();
        System.out.println(s.name);
        s.look();
    }
}


public class InnerDemo01 {
    public static void main(String[] args) {
        // 在外界访问成员内部类里面的成员，需要在外界创建成员内部类对象
        Room.Student s = new Room().new Student();
        System.out.println(s.name);
        s.look();
    }
}
