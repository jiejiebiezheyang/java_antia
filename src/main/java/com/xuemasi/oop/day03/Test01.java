package com.xuemasi.oop.day03;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/09/16:34
 * @Description:
 */
/* 创建一个汽车类（Car
 *（1为其定义两个属性：颜色和型号。每个属性都使用private进行封装，为每个属性设置set、get方法。
 *（2为该类创建两个构造方法。第一个为无参的构造方法。第二个为带参构造方法
 *（3重写toString方法，通过toString输出汽车信息。
 *（4重写equals方法，如果汽车的颜色和型号相同就认为是同一辆车。
 *（5实例化两个对象，输出两个对象的信息，比较两个对象是否是同一个对象。
 * */

class Car {
    private String color;
    private String model;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car() {
    }

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "颜色='" + color + '\'' +
                ", 型号='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Car car = (Car)obj;
        return this.color.equals(car.color)&&this.model.equals(car.model);
    }
}

public class Test01 {
    public static void main(String[] args) {
        Car c1 = new Car("白", "奔驰c63");
        Car c2 = new Car("白", "奔驰c63");
        Car c3 = new Car("黑", "EVO");
        System.out.println(c1.toString());
        System.out.println(c2); // 打印对象，会打印对象的toString方法

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        if (c1.equals(c2)) {
            System.out.println("是同一辆车");
        } else {
            System.out.println("不是同一辆车");
        }
    }
}