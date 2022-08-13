package com.xuemasi.oop.day05;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/11/14:14
 * @Description:
 */
/*
 * （1）Shape.java文件，在该文件中定义接口类Shape，该接口在shape包中。
 *      属性：PI。
 *      接口：求面积的方法area()。
 * */
interface Shape {
    double PI = Math.PI;

    double area();
}

/*
 *（2）Circle.java文件，在该文件中定义圆类Circle，该类在circle包中，实现Shape接口类。
 *      属性：圆半径radius。
 *      方法：构造器；实现求面积方法area()；求周长方法perimeter()。
 * */
class Circle implements Shape {
    public double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // 求面积
    @Override
    public double area() {
        return radius * radius * PI;
    }

    // 求周长
    public double perimeter() {
        return 2 * radius * PI;
    }
}

/*
 * （3）Cylinder.java文件，在该文件中定义圆柱体类Cylinder，该类在cylinder包中，继承圆类。
 *      属性：圆柱体高度height。
 *      方法：构造器；求表面积方法area()；求体积方法volume()。
 * */
class Cylinder extends Circle {
    double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double area() {
        return super.area() * 2 + super.perimeter() * height;
    }

    public double volume() {
        return super.area() * height;
    }
}

/*
 *（4）X5_3_6.java文件，在该文件中定义主类X5_3_6，该类在默认包中，其中包含主方法main()
 *      在主方法中创建两个圆类对象cir1和cir2，具体尺寸自己确定，并显示圆的面积和周长
 *      再创建两个圆柱体类的对象cy1和cy2，具体尺寸自己确定，然后分别显示圆柱体cy1和cy2的底圆的面积和周长以及它们各自的体积和表面积。
 *      【编程分析】本题主要考察接口、包、继承、封装等问题
 * */
public class Test01 {
    public static void main(String[] args) {
        Circle cir1 = new Circle(20);
        Circle cir2 = new Circle(15);
        System.out.println(cir1.area() + "\t" + cir1.perimeter());
        System.out.println(cir2.area() + "\t" + cir2.perimeter());

        Cylinder c1 = new Cylinder(20, 30);
        Cylinder c2 = new Cylinder(7, 13);
        System.out.println(c1.area() + "\t" + c1.volume());
        System.out.println(c2.area() + "\t" + c2.volume());
    }
}
