package cn.ltpcloud.io.day01;

import cn.ltpcloud.movieBuy.MainApp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/25/15:16
 * @Description:
 */
/*
 *
 * */

public class Test01 {
    public static Logger logger = LoggerFactory.getLogger(Test01.class);

    public static void main(String[] args) {
        File file = new File("C:\\Users\\0816\\Desktop\\demo");
        rm_R(file);
    }

    // 递归删除目录
    public static void rm_R(File file) {
        // 判断是否是文件，是文件直接删除
        if (file.isFile()) {
            logger.info("删除文件：" + file);
            file.delete();
        } else {
            // 不是文件，遍历目录
            File[] files = file.listFiles();
            for (File aFile : files) {
                rm_R(aFile);
            }
            // 遍历完删除当前目录
            logger.info("删除目录：" + file);
            file.delete();
        }
    }
}

