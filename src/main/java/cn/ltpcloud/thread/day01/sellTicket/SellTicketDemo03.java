package cn.ltpcloud.thread.day01.sellTicket;

import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/30/14:52
 * @Description:
 */
/*
 * 模拟售票
 * 解决线程安全问题(同步方法)
 *
 * 又出现了线程安全问题
 * 原因：同步方法是实例方法。锁对象为this。锁对象不唯一
 *
 * 解决方案
 * 将实例方法改为静态（不推荐）
 * 通过实现Runnable来实现多线程（推荐）
 * */
class Target3 extends Thread {
    static int count = 100;

    public Target3(@NotNull String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            int no = getNo();
            if (no > 100) {
                return;
            }
            System.out.println(getName() + "卖出第" + no + "张电影票");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);

            }
        }
    }

    // 取票
    /*
     * 同步方法的锁对象为
     * 实例方法
     *     锁对象：this
     * 静态方法
     *     锁对象:当前方法所在的类
     * */
    public synchronized int getNo() {
        return (100 - count--) + 1;
    }
}

public class SellTicketDemo03 {
    public static void main(String[] args) {
        Target target = new Target();

        Thread t1 = new Target3("售票口1");
        Thread t2 = new Target3("售票口2");
        Thread t3 = new Target3("售票口3");

        t1.start();
        t2.start();
        t3.start();

    }
}
