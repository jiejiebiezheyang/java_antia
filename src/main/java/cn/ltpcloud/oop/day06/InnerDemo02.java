package cn.ltpcloud.oop.day06;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/12/9:56
 * @Description:
 */

class Body {
    // 成员内部一般私有化，提高安全性
    private class Heart {
        public void work() {
            System.out.println("咚咚...");
        }
    }

    // 对外提供公共的访问方式，以供外界该方式访问成员内部类中的成员
    public void check(Object obj) {
        // 判断obj是否为Doctor类的某个实例
        if (obj instanceof Doctor) {
            Heart heart = new Heart();
            heart.work();
        } else {
            System.out.println("死开...");
        }
    }
}

class Doctor {

}

class Cat {

}

public class InnerDemo02 {
    public static void main(String[] args) {
        /*
         * 外界可以直接创建内部类对象
         * 数据不安全
         * */
        // Body.Heart heart = new Body().new Heart();
        // heart.work();

        // 外界创建外部类对象，通过外部类提供的访问内部类成员的方法对内部类成员进行访问
        Body body = new Body();
        body.check(new Doctor());
        body.check(new Cat());
    }
}
