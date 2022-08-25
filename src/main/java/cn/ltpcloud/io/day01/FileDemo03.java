package cn.ltpcloud.io.day01;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/25/16:46
 * @Description:
 */
public class FileDemo03 {
    @Test
    public void demo1() {
        File folder = new File("C:\\Users\\0816\\Desktop\\demo");

        // 获取目录下所有文件和目录名称
        String[] list = folder.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("----------------------");

        // 获取目录下所有文件和目录的绝对路径
        File[] files = folder.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

    // 需求:获取指定目录下所有的.txt文件
    @Test
    public void demo2() {
        File folder = new File("C:\\Users\\0816\\Desktop\\demo");
        // 通过指定的文件名称过滤器将不符合条件的文件过滤掉
        File[] files = folder.listFiles(new FilenameFilter() {
            // dir-文件所在目录
            // name-文件的名称
            @Override
            public boolean accept(File dir, String name) {
                // 被找到文件File
                File file = new File(dir, name);
                return file.isFile() && name.endsWith(".txt");
            }
        });
        for (File file : files) {
            System.out.println(file);
        }
    }

    @Test
    public void demo3() {
        File folder = new File("C:\\Users\\0816\\Desktop\\demo");
        // 通过指定的文件名称过滤器将不符合条件的文件过滤掉
        File[] files = folder.listFiles(new FileFilter() {
            // file-被找到的文件
            @Override
            public boolean accept(File file) {
                return file.isFile() && file.getName().endsWith(".txt");
            }
        });
        for (File file : files) {
            System.out.println(file);
        }
    }
}
