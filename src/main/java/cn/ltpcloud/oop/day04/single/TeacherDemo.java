package cn.ltpcloud.oop.day04.single;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/10/16:25
 * @Description:
 */
// 懒汉式
class Teacher {
    // 构造器私有
    public Teacher() {
    }

    // 由当前类提供唯一实例
    private static Teacher t;


    // 提供公共方法，来获取唯一实例
    public synchronized static Teacher getInstance() {
        if (t == null) {
            t = new Teacher();
        }
        return t;
    }
}

public class TeacherDemo {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                System.out.println(Teacher.getInstance());
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                System.out.println(Teacher.getInstance());
            }
        }.start();
        String a =  "ad";
        String b = a ;
        b = "da";
        System.out.println(a);
        System.out.println(b);
    }
}
