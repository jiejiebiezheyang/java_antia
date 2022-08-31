package cn.ltpcloud.thread.day02;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/31/16:51
 * @Description:
 */
class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("叮叮当...");
    }
}

public class TimerDemo {
    public static void main(String[] args) {
        // 创建定时器
        Timer timer = new Timer();
        // 创建定时任务
        TimerTask task = new MyTask();
        // 在3秒后执行一次定时任务
        // timer.schedule(task, 3000);

        // 在3秒后执行一次定时任务，以后每2秒执行一次定时任务
        timer.schedule(task, 3000, 2000);

    }
}
