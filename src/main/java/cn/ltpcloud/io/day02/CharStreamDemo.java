package cn.ltpcloud.io.day02;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/26/15:14
 * @Description:
 */
public class CharStreamDemo {
    @Test
    public void demo1() throws Exception {
        // 转换输出流
        // 默认编码
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\0816\\Desktop\\demo\\5.txt"));
        // 指定编码
        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("C:\\Users\\0816\\Desktop\\demo\\5.txt"), "gbk");

        // 写出数据
        // 写出一个字符
        osw.write('a');
        // 写出一个字符数组
        char[] ch = {'h', 'e', 'l', 'l', 'o'};
        osw.write(ch);
        // 写出一个字符数组中的一部分
        osw.write(ch, 0, 3);
        // 写出一个String
        osw.write("world");
        // 写出一个String的一部分
        osw.write("java", 0, 2);

        osw2.close();
        osw.close();
    }

    @Test
    public void demo2() throws Exception {
        // 创建转换输入流
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\0816\\Desktop\\demo\\4.txt"));

        /*int len;
        while ((len = isr.read()) != -1) {
            System.out.println((char) len);
        }*/

        // 每次读取一个字符数组
        char[] buf = new char[5];
        int len;
        while ((len = isr.read(buf)) != -1) {
            System.out.print(String.valueOf(buf, 0, len));
        }
        isr.close();
    }
}
