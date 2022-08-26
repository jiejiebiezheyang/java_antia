package cn.ltpcloud.io.day02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/26/16:53
 * @Description:
 */
public class CharStreamDemo02 {
    public static void main(String[] args) throws Exception {
        // 创建字符流
        FileReader fr = new FileReader("C:\\Users\\0816\\Desktop\\demo\\4.txt");
        FileWriter fw = new FileWriter("C:\\Users\\0816\\Desktop\\demo\\4c.txt");

        // 每次读写一个字符数组
        char[] buf = new char[5];
        int len;
        while ((len = fr.read(buf)) != -1) {
            fw.write(buf, 0, len);
        }

        fw.close();
        fr.close();
    }
}
