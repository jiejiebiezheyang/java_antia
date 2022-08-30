package cn.ltpcloud.thread.day01;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/30/14:11
 * @Description:
 */
/*
 * void setDaemon(boolean flag):设置守护线程（后台线程如果前台线程执行完毕，JVM退出
 * */
class KTVRoom extends Thread {
    int time;

    public KTVRoom(int time) {
        this.time = time;
    }

    // 模拟客人唱歌
    @Override
    public void run() {
        System.out.println("客人开始唱歌了");
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("时间到了，客人走人");
    }
}

class Waiter extends Thread {

    // 给客人计时，每隔一秒计时一次
    @Override
    public void run() {
        while (true) {
            System.out.println(new Date());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadDemo05 {
    public static void main(String[] args) {
        KTVRoom room = new KTVRoom(5000);
        Waiter waiter = new Waiter();

        // 设置后台线程
        waiter.setDaemon(true);

        room.start();
        waiter.start();
    }
}
