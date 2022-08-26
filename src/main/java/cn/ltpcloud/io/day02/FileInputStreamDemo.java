package cn.ltpcloud.io.day02;


import jdk.jfr.Description;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/26/10:09
 * @Description:
 */

public class FileInputStreamDemo {

    FileInputStream fis;

    @Before
    public void setUp() throws IOException {
        // 创建文件字节输入流
        fis = new FileInputStream("C:\\Users\\0816\\Desktop\\demo\\file\\2.txt");
    }

    @Test
    public void demo1() throws IOException {
        // 读一个字节
        char ch = (char) fis.read();
        System.out.println(ch);
        // 读一个字节数组
        byte[] buf = new byte[5];
        // 将读取到的字节存在字节数组中，并返回读取到的字节个数
        int len = fis.read(buf);
        System.out.println(new String(buf));
    }

    @Test
    public void demo2() throws IOException {
        // 读不到数据返回-1
        int ch = -1; // 读取到的字节
        while ((ch = fis.read()) != -1) {
            System.out.println((char) ch);
        }
    }

    @Test
    public void demo3() throws IOException {
        byte[] buf = new byte[5];
        int len;
        while ((len = fis.read(buf)) != -1) {
            // 将读取到的数据转成字符串
            System.out.print(new String(buf, 0, len));
        }

    }

    @After
    public void tearDown() throws IOException {
        // 关闭流
        fis.close();
    }
}
