package cn.ltpcloud.io.day01;

import java.io.File;
import java.io.FileFilter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/25/17:15
 * @Description:
 */
/*
 * 获取指定目录下的所有txt文件
 * */
public class Test02 {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\0816\\Desktop\\demo");
        getTxT(folder);
    }

    private static void getTxT(File folder) {
        File[] files = folder.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                if (file.isFile()) {
                    return file.getName().endsWith(".txt");
                } else {
                    getTxT(file);
                }
                return false;
            }
        });
        for (File file : files) {
            System.out.println(file);
        }
    }
}
