package com.xuemasi.oop.day05;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/11/14:26
 * @Description:
 */
/*
 *  一个交通工具接口类Vehicles，work接口，有Horse类和Boat类分别实现Vehicles，
 *  创建交通工具工厂类，两个方法分别获得交通工具Horse和Boat
 *  有Person类，有name和Vehicles属性，在构造器中赋值，实例化“唐僧”，一般情况下用Horse作为交通工具，遇到大河时用Boat作为交通工具。
 *  */
interface Vehicles {
    void work();
}


class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("骑大马");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("乘小船");
    }
}

class VehiclesFactory {
    public Horse getHorse() {
        return new Horse();
    }

    public Boat getBoat() {
        return new Boat();
    }
}

class Person {
    String name;
    Vehicles vehicles;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void jia() {

    }
}

public class Test02 {
    public static void main(String[] args) {
        Person ts = new Person("唐僧");
        VehiclesFactory vf = new VehiclesFactory();
        String info = "大河";
        if (info.equals("大河")) {
            ts.vehicles = vf.getBoat();
        } else {
            ts.vehicles = vf.getHorse();
        }

        System.out.println(ts.vehicles);
    }
}
