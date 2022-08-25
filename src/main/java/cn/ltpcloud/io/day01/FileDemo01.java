package cn.ltpcloud.io.day01;

import org.junit.Test;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/25/14:25
 * @Description:
 */
public class FileDemo01 {
    // 构造
    @Test
    public void demo1() {
        // 通过全路径
        File file = new File("D:/file/1.txt");
        System.out.println(file);
        // 通过父路径+子路径创建
        File file2 = new File("D:/file", "1.txt");
        // 通过父File+子路径
        File fu = new File("D:/file");
        File file1 = new File(fu, "1.txt");
    }

    // 分隔符
    @Test
    public void demo2() {
        // 名称分隔符
        System.out.println(File.separator); // "\"
        System.out.println(File.separatorChar); // '\'
        // 路径分隔符
        System.out.println(File.pathSeparator); // ";"
        System.out.println(File.pathSeparatorChar); // ';'
    }
}
