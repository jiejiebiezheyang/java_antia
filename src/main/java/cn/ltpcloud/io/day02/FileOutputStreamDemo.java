package cn.ltpcloud.io.day02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/26/9:55
 * @Description:
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        // 创建文件字节输出流对象
        // 注意：文件路径如果不存在，会发生FileNotFoundException异常
        // 如果文件不存在，不会发生异常，会创建文件
        FileOutputStream fos = new FileOutputStream("C:\\Users\\0816\\Desktop\\demo\\file\\1.txt", true);

        // 写出数据
        // 写出一个字节
        fos.write(97);
        // 写出一个字节数组
        byte[] buf = {65, 66, 67, 68, 69};
        fos.write(buf);
        // 写出一个字节数组中的一部分
        fos.write(buf, 1, 3);

        // 关闭流对象，释放资源
        fos.close();
    }
}
