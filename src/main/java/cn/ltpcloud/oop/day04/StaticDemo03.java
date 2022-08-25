package cn.ltpcloud.oop.day04;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/10/16:43
 * @Description:
 */

class Circle {

    private double radius;
    private int id;//自动赋值

    public Circle() {
        id = init++;
        total++;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;

    }

    private static int total;//记录创建的圆的个数
    private static int init = 1001;//static声明的属性被所对象所共享

    public double findArea() {
        return 3.14 * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public static int getTotal() {
        return total;
    }

}

public class StaticDemo03 {
    public static void main(String[] args) {

    }
}
