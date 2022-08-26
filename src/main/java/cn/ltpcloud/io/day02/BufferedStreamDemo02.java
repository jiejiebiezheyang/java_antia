package cn.ltpcloud.io.day02;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/26/17:00
 * @Description:
 */
/*
 * 字符缓冲输入输出流
 * */
public class BufferedStreamDemo02 {
    @Test
    public void demo1() throws Exception {
        // 创建字符缓冲输入输出流
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\0816\\Desktop\\demo\\4.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\0816\\Desktop\\demo\\4cc.txt", true));

        // 读写一个字符
        int ch;
        while ((ch = br.read()) != -1) {
            bw.write(ch);
        }

        br.close();
        bw.close();
    }

    @Test
    public void demo2() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\0816\\Desktop\\demo\\4.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\0816\\Desktop\\demo\\4cc.txt", true));
        // 读取一个字符数组
        char[] buf = new char[5];
        int len;
        while ((len = br.read(buf)) != -1) {
            bw.write(buf, 0, len);
        }

        br.close();
        bw.close();
    }

    @Test
    public void demo3() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\0816\\Desktop\\demo\\4.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\0816\\Desktop\\demo\\4cc.txt", true));
        // 读取一个字符数组
        String s;
        while ((s = br.readLine()) != null) { // 读一行，读不到null
            bw.write(s);
            bw.newLine(); // 换行
            bw.flush();
        }

        br.close();
        bw.close();
    }
}
