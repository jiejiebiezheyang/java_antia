package cn.ltpcloud.thread.day01;

import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/30/11:59
 * @Description:
 */
/*
 * 让当前线程“睡眠”指定的milli time毫秒。在指定的milli time毫秒时间内，当前线程是阻塞状态。
 * */
class SleepThread extends Thread {
    public SleepThread(@NotNull String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "===" + i);
            // 线程休眠，休眠时间到期后，继续和其他线程抢夺cpu的执行权，如果抢到执行权，会从之前未完成操作的位置开始继续往下执行
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e);
            }

            System.out.println(getName() + "===next");
        }
    }
}

public class ThreadDemo04 {
    public static void main(String[] args) {
        Thread t1 = new SleepThread("线程1");
        Thread t2 = new SleepThread("线程2");

        t1.start();
        t2.start();
    }
}
