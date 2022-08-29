package cn.ltpcloud.io.day03;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/29/10:13
 * @Description:
 */
public class StreamDemo02 {
    public static void main(String[] args) throws IOException {
        demo1();
        demo2();
    }

    // 数据输入流
    private static void demo2() throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\0816\\Desktop\\demo\\7.txt"));
        // 读入基本类型和字符串数据
        int i = dis.readInt();
        char c = dis.readChar();
        String s = dis.readUTF();
        System.out.println(i);
        System.out.println(c);
        System.out.println(s);

    }

    // 数据输出流
    private static void demo1() throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\0816\\Desktop\\demo\\7.txt"));
        // 写出基本类型数据
        dos.writeInt(100); // 写出4个字节
        dos.writeChar('a'); // 写出两个字节
        // 以UTF-8写出
        dos.writeUTF("中国你好"); //

        dos.close();
    }
}
