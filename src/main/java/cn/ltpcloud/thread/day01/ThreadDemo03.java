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
 * main {
 *     t1.start();
 *     t1.join(); // main线程阻塞，执行t1线程的操作，当t1线程操作全部执行完毕，放开main线程，启动t2线程
 *     t2.start();
 * }
 * main {
 *     t1.start();
 *     t1.join(10);
 *     t2.start();
 * }
 *
 * 阻塞10毫秒，10毫秒内t1操作是否能执行完毕
 * 能:
 *     main线程阻塞，执行t1线程的操作，当t1线程操作全部执行完毕，放开main线程，启动t2线程
 * 不能:
 *     10毫秒内先执行t1里的操作，10毫秒后放开main线程，然后启动t2，这时候t1和t2一起参与cpu的抢夺，谁抢到，谁执行
 * */
class JoinThread extends Thread {

    public JoinThread(@NotNull String name) {
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

class Player extends Thread {
    int time;

    public Player(@NotNull String name, int time) {
        super(name);
        this.time = time;
    }

    // 模拟从家到棋牌室
    @Override
    public void run() {
        System.out.println(getName() + "+++从家出发了");
        try {
            sleep(time);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(getName() + ":" + time + "到棋牌室了");
    }
}

public class ThreadDemo03 {
    public static void main(String[] args) throws Exception {
        Player p1 = new Player("小明", 5000);
        Player p2 = new Player("小王", 8000);
        Player p3 = new Player("小张", 7000);
        Player p4 = new Player("小李", 6000);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p1.join();
        p2.join();
        p3.join();
        p4.join();
        System.out.println("人到齐了，开局");
    }
}
