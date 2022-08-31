package cn.ltpcloud.thread.day02;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/31/16:59
 * @Description:
 */
/*
 * 在指定的日期删除指定目录
 * 比如：在2022-8-31 17：15：00 删除桌面demo目录
 * */
class Task extends TimerTask {
    File file;

    public Task(File file) {
        this.file = file;
    }

    @Override
    public void run() {
        rm_R(file);
    }

    // 删除文件
    public static void rm_R(File file) {
        // 判断是否是文件，是文件直接删除
        if (file.isFile()) {
            file.delete();
        } else {
            // 不是文件，遍历目录
            File[] files = file.listFiles();
            for (File aFile : files) {
                rm_R(aFile);
            }
            // 遍历完删除当前目录
            file.delete();
        }
    }
}

public class Test01 {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2022-08-31 17:15:00");

        // 创建任务
        Task task = new Task(new File("C:\\Users\\0816\\Desktop\\demo"));
        // 创建定时器
        Timer timer = new Timer();

        timer.schedule(task, date);
    }
}
