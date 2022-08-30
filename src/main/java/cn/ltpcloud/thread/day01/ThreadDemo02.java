package cn.ltpcloud.thread.day01;

import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/30/11:31
 * @Description:
 */
/*
 * 线程礼让
 * yield():释放当前cpu的执行权
 * */
class YldThread extends Thread {

    public YldThread(@NotNull String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "==" + i);
            Thread.yield();
        }
    }
}

public class ThreadDemo02 {
    public static void main(String[] args) {
        // 创建线程对象
        Thread t1 = new YldThread("线程1");
        Thread t2 = new YldThread("线程2");

        // 启用线程
        t1.start();
        t2.start();
    }
}
