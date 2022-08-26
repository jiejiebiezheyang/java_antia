package cn.ltpcloud.io.day02;

import org.junit.Test;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/26/11:48
 * @Description:
 */
/*
 * 缓冲字节输入输出流
 * */
public class BufferedStreamDemo01 {
    @Test
    public void write() throws Exception {
        // 创建缓冲字节输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\0816\\Desktop\\demo\\file\\3.txt"));
        // 写出数据(写出到缓冲区)
        bos.write("hello".getBytes());
        bos.write("world".getBytes());

        // 清空缓冲区(将缓冲区数据写出到目的端)
        // bos.flush();

        // 在关闭流对象前，会先清空缓冲区
        bos.close();
    }

    @Test
    public void read() throws Exception {
        // 通过字节输入流，创建缓冲字节输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\0816\\Desktop\\demo\\file\\3.txt"));
        /*int by;
        while ((by = bis.read()) != -1) {
            System.out.println((char) by);
        }*/

        // 每次读一个字节数组
        byte[] buf = new byte[3];
        int len;
        while ((len = bis.read(buf)) != -1) {
            System.out.print(new String(buf, 0, len));
        }

        // 释放资源
        bis.close();
    }
}
