package com.xuemasi.api.day04;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/19/10:01
 * @Description:
 */
public class TestGC {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            MyClass m = new MyClass();//这里本次循环完，本次创建的对象就成为垃圾了
            System.out.println("创建第" + (i + 1) + "的对象：" + m);
        }

        //通知垃圾回收机制来收集垃圾
        System.gc();

        //为了延缓程序结束
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("程序在继续....");
        }
    }
}

class MyClass {
    //这个方法是垃圾回收机制在回收它的对象时，自动调用，理解成对象留临终遗言的方法
    public void finalize() {
        System.out.println("轻轻的我走了.....");
    }
}