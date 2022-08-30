package cn.ltpcloud.thread.day01.sellTicket;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/30/16:41
 * @Description:
 */

/*
 * 模拟售票
 * 解决线程安全问题(lock)
 * */
class Target5 extends Thread {
    static int count = 100;

    public Target5(@NotNull String name) {
        super(name);
    }

    // 锁对象
    private static final Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            // 获取锁
            lock.lock();
            int cou = (100 - count--) + 1;// 对共享数据进行操作
            // 释放锁
            lock.unlock();
            if (cou > 100) {
                return;
            }
            System.out.println(getName() + "卖出第" + cou + "张电影票");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);

            }
        }


    }
}

public class SellTicketDemo05 {
    public static void main(String[] args) {
        Thread t1 = new Target5("售票口1");
        Thread t2 = new Target5("售票口2");
        Thread t3 = new Target5("售票口3");

        t1.start();
        t2.start();
        t3.start();

    }
}
