package cn.ltpcloud.thread.day01;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/30/14:44
 * @Description:
 */
/*
 * MAX_PRIORITY：10
 * MIN _PRIORITY：1
 * NORM_PRIORITY：5  -->默认优先级
 * 2.如何获取和设置当前线程的优先级：
 * getPriority():获取线程的优先级
 * setPriority(int p):设置线程的优先级
 *
 * 说明：高优先级的线程要抢占低优先级线程cpu的执行权。但是只是从概率上讲，高优先级的线程高概率的情况下被执行。
 * 并不意味着只当高优先级的线程执行完以后，低优先级的线程才执行。
 * */

class Target3 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "执行了...");
    }
}

public class ThreadDemo07 {
    public static void main(String[] args) {
        // 创建线程任务
        Target3 target = new Target3();
        // 线程
        Thread t1 = new Thread(target, "线程1");
        Thread t2 = new Thread(target, "线程2");

        // 获取默认优先级
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        // 设置优先级
        t1.setPriority(1);
        t2.setPriority(1);

        t1.start();
        t2.start();
    }
}
