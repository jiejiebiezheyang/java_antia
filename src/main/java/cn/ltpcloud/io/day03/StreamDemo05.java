package cn.ltpcloud.io.day03;

import org.junit.Test;

import java.io.RandomAccessFile;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/29/15:00
 * @Description:
 */
public class StreamDemo05 {
    @Test
    public void demo1() throws Exception {
        // 创建随机访问流,rw表示可读可写
        RandomAccessFile raf = new RandomAccessFile("C:\\Users\\0816\\Desktop\\demo\\10.txt", "rw");
        // 写数据
        // 写入字节
        raf.write(97);
        // 写入基本类型和String
        raf.writeInt(100);
        raf.writeUTF("hello");

        // 设置读的位置
        raf.seek(0);

        // 读数据
        // 读一个字节
        System.out.println(raf.read());
        // 读基本类型和String
        System.out.println(raf.readInt()); // EOFException
        System.out.println(raf.readUTF());

        raf.close();
    }
}
