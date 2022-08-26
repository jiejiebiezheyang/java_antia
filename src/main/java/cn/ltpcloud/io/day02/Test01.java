package cn.ltpcloud.io.day02;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/26/10:34
 * @Description:
 */
/*
 * 将JDK 1.6 API.chm复制到当前项目下C:\Users\0816\Desktop\demo\file\目录内
 * */
public class Test01 {
    public static void main(String[] args) throws IOException {
        FileInputStream src = new FileInputStream("C:\\Users\\0816\\Desktop\\demo\\JDK 1.6 API.chm");
        FileOutputStream dest = new FileOutputStream("C:\\Users\\0816\\Desktop\\demo\\file\\JDK 1.6 API.chm", true);
        copyFile(src, dest);
        dest.close();
        src.close();
    }

    // 文件复制
    public static void copyFile(FileInputStream src, FileOutputStream dest) throws IOException {
        byte[] buf = new byte[1024];
        int len;
        while ((len = src.read(buf)) != -1) {
            dest.write(buf, 0, len);
        }
        System.out.println("复制完成");
    }
}
