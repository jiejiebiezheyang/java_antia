package cn.ltpcloud.oop.day02;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/08/12:00
 * @Description:
 */

/* 定义一个类，用于描述坐标点
 *       0——————>X
 *       |
 *       |
 *       |          P(X,Y)
 *       |
 *       |
 *       Y
 * （1具计算当前点到原点距离的功能
 * （2求到任意一点（m，n的距离
 * （3求到任意一点（Point p的距离
 * （4具坐标点显示功能，显示格式（x，y
 * （5提供无参的构造器和一个有参的构造器
 * */
class Point {
    private int x;
    private int y;

    // 无参构造器
    public Point() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // 有参构造器
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 到原点距离
    public void originPoint() {
        double n = Math.sqrt(x * x + y * y);
        System.out.println(showPoint() + "到原点的距离为：" + n);
    }

    // 到任意点的距离
    public void anyPoint(int x, int y) {
        double n = Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
        System.out.println(showPoint() + "到(" + x + "," + y + ")的距离为：" + n);
    }

    // 到任意Point p点距离
    public void anyPointP(Point p) {
        double n = Math.sqrt((p.getX() - this.x) * (p.getX() - this.x) + (p.getY() - this.y) * (p.getY() - this.y));
        System.out.println("(" + x + "," + y + ")到" + p.showPoint() + "的距离为：" + n);
    }

    // 显示坐标点
    public String showPoint() {
        return "(" + x + "," + y + ")";
    }
}

/*
 * 定义一个圆
 * 属性自定义
 * 提供无参的构造器和一个有参的构造器
 * 计算圆周长
 * 计算圆面积
 * 判断指定点（x,y）是否在圆内
 * 判断指定点（point p）是否在圆内
 * */
class Round {
    private int radius;
    private int x;
    private int y;

    public Round() {

    }

    public Round(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    // 计算圆周长
    public void circumference() {
        double circumference = 2 * 3.14 * this.radius;
        System.out.println("圆周长=" + circumference);
    }

    // 计算圆面积
    public void roundArea() {
        double area = 3.14 * this.radius * this.radius;
        System.out.println("圆的面积=" + area);
    }

    // 判断指定点是否在圆内
    public void isInside(int x, int y) {

        int rx = x + this.radius;
        int ry = y + this.radius;
        double n = Math.sqrt((x - rx) * (x - rx) + (y - ry) * (y - ry));
        if (n <= radius) {
            System.out.println("在圆内");
        } else
            System.out.println("不在圆内");
    }

    // 判断Point p是否在圆内
    public void isInsidePoint(Point p) {
        this.isInside(p.getX(),p.getY());
    }
}

public class Test01 {
    public static void main(String[] args) {
        Point p1 = new Point(12, 8);
        Point p2 = new Point(9, 6);
        p1.originPoint(); // (12,8)到原点的距离为：14.422205101855956
        p1.anyPoint(12, 4); // (12,8)到(12,4)的距离为：4.0
        p1.anyPointP(p2); // (12,8)到(9,6)的距离为：3.605551275463989
        System.out.println(p1.showPoint()); // (12,8)

        Round r1 = new Round(15, 8, 10);
        r1.circumference(); // 圆周长=94.2
        r1.roundArea(); // 圆的面积=706.5
        r1.isInside(16, 5); // 不在圆内
        r1.isInsidePoint(p1); // 不在圆内
    }
}
