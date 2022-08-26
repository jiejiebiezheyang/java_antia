package cn.ltpcloud.io.day02;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/26/12:04
 * @Description:
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        FileInputStream src = new FileInputStream("C:\\Users\\0816\\Desktop\\demo\\JDK 1.6 API.chm");
        FileOutputStream dest = new FileOutputStream("C:\\Users\\0816\\Desktop\\demo\\file\\JDK 1.6 API.chm", true);
        copyFile(src, dest);
        dest.close();
        src.close();
    }

    // 文件复制
    public static void copyFile(FileInputStream src, FileOutputStream dest) throws IOException {
        BufferedInputStream srcB = new BufferedInputStream(src);
        BufferedOutputStream destB = new BufferedOutputStream(dest);
        byte[] buf = new byte[1024];
        int len;
        while ((len = srcB.read(buf)) != -1) {
            destB.write(buf, 0, len);
            destB.flush();
        }
        System.out.println("复制完成");
        destB.close();
        srcB.close();
    }
}
