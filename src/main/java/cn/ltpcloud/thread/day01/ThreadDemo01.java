package cn.ltpcloud.thread.day01;

import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/30/11:19
 * @Description:
 */
/*
 * 线程常用方法
 * */

class MyThread2 extends Thread {

    public MyThread2(@NotNull String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "==" + i);
        }
    }
}

class Target2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            // 获取当前线程对象
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName() + "==" + i);
        }
    }
}

public class ThreadDemo01 {
    public static void main(String[] args) {
        Thread t1 = new MyThread2("线程1");
        Thread t2 = new Thread(new Target2(), "线程2");

        System.out.println("线程是否存活" + t1.isAlive());

        // 启用线程
        t1.start();
        t2.start();

        System.out.println("线程是否存活" + t1.isAlive());
    }
}
