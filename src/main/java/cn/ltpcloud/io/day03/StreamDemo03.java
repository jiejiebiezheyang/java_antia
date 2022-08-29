package cn.ltpcloud.io.day03;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/29/11:32
 * @Description:
 */
public class StreamDemo03 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // 写入数据到内存缓冲区中
        baos.write("hello".getBytes());
        // 缓冲区中的有效字节数
        int size = baos.size();
        // 获取缓冲区
        byte[] buf = baos.toByteArray();
        System.out.println(new String(buf, 0, size));

        // 获取缓冲区数据
        System.out.println(baos.toString());

    }
}
