package cn.ltpcloud.thread.day01;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/30/14:30
 * @Description:
 */
/*
 * stop():已过时。当执行此方法时，强制结束当前线程。
 * interrupt():终端线程
 * */
class InterruptThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i == 10) {
                // stop(); // 结束线程操作
                interrupted(); // 发送一个中断信号
                try {
                    // 一旦调用sleep，join，wait等方法时会先尝试获取中断信号
                    // 如果没有获取到正常执行
                    // 如果获取了终端信号会产生一个InterruptedException
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    return;
                }
            }
            System.out.println(i);
        }
    }
}

public class ThreadDemo06 {
    public static void main(String[] args) {
        Thread t = new InterruptThread();
        t.start();
    }
}
