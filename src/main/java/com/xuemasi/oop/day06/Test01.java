package com.xuemasi.oop.day06;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/12/10:28
 * @Description:
 */

/*
 * 一个Car类，有属性temperature（温度，车内Air（空调），有吹风的功能flow，Air会监视车内的温度
 * 如果温度超过40度则吹冷气。如果温度低于0度则吹暖气，如果在这之间则关掉空调。
 * 实例化具有不同温度的Car对象，调用空调的flow方法，测试空调吹的风是否正确
 * */

class Car {
    static int temperature;

    class Air {
        public void flow(int temp) {
            if (temp < 0) {
                System.out.println("暖风~~~");
            } else if (temp > 40) {
                System.out.println("冷风~~~");
            } else {
                System.out.println("关闭");
            }
        }
    }
}

public class Test01 {
    public static void main(String[] args) {
        Car.Air ca = new Car().new Air();
        Car.temperature = 26;
        ca.flow(Car.temperature);
    }
}
