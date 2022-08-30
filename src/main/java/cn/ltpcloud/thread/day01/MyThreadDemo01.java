package cn.ltpcloud.thread.day01;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/30/10:20
 * @Description:
 */
/*
 * 继承Thread，重写run
 * */
class MyThread extends Thread {

    @Override
    public void run() { // run,线程对象需要执行的操作
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}

class Target implements Runnable {
    @Override
    public void run() {
        for (int i = 65; i < 165; i++) {
            System.out.println((char) i);
        }
    }
}

public class MyThreadDemo01 {
    public static void main(String[] args) {
        // 创建线程对象（Thread子类对象）
        Thread t1 = new MyThread();
        // 通过Runnable创建
        Thread t2 = new Thread(new Target());

        /* 只是普通的方法调用，按照先后的次序执行
        t1.run();
        t2.run();*/

        // 启动多线程环境，让t1和t2和main线程一起去抢夺cpu的执行权，谁抢到谁执行
        t1.start();
        t2.start();
    }
}
