package com.xuemasi.oop.day06;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/12/11:23
 * @Description:
 */
/*
 * 计算器具work方法，功能是运算，时钟同样具有work方法，功能是计时，有一个手机类Cellphone，同时需要拥有运算和计时功能，通过内部类实现多继承效果。
 * */
class Cellphone {
    class Calc implements Works {
        @Override
        public void work() {
            System.out.println("+-*/");
        }
    }

    class Clock implements Works {
        @Override
        public void work() {
            System.out.println("time");
        }
    }
    public void work(String str){
        if (str.equals("运算")){
            Calc calc = new Calc();
            calc.work();
        } else if (str.equals("计时")) {
            Clock clock = new Clock();
            clock.work();
        }
    }
}

public class Test03 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.work("运算");
        cellphone.work("计时");
    }
}
