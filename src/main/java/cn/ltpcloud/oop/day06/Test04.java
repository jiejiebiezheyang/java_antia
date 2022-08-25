package cn.ltpcloud.oop.day06;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/12/14:18
 * @Description:
 */
/*
 * 一个铃声接口类Bell，有一个接口sound，有一个手机类Cellphone，具有闹钟功能alarmClock
 * 参数是Bell类型，测试手机类的闹钟功能，通过匿名内部类作为参数，打印：懒猪起床了
 * */
interface Bell{
    void sound();
}

class Cellphone2{
    public static void alarmClock(Bell bell){
        bell.sound();
    }
}

public class Test04 {
    public static void main(String[] args) {
    Cellphone2.alarmClock(new Bell() {
        @Override
        public void sound() {
            System.out.println("懒猪起床了");
        }
    });
    }
}
