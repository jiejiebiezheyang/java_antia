package cn.ltpcloud.oop.day02;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/08/14:38
 * @Description:
 */

class Circle {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public Circle compare(Circle cir) {
        // 程序代码
        return this.radius>cir.radius?this:cir;
    }
}

public class Test02 {
    public static void main(String[] args) {
        Circle cir1 = new Circle(3.0);
        Circle cir2 = new Circle(2.0);
        Circle cir;
        cir = cir1.compare(cir2);
        if (cir1 == cir)
            System.out.println("圆1的半径比较大");
        else
            System.out.println("圆2的半径比较大");
    }
}
