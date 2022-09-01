package cn.ltpcloud.net.tcp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/01/16:45
 * @Description:
 */
public class ClientDemo04 {
    public static void main(String[] args) throws Exception {
        // 通过ip和port创建Socket
        Socket s = new Socket("172.30.16.29", 10000);

        // 封装文件的字节流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\0816\\Videos\\bilibili\\aa.mp4"));
        // 往服务器写
        BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());

        byte[] buf = new byte[1024];
        int len;
        while ((len = bis.read(buf)) != -1) {
            bos.write(buf, 0, len);
            bos.flush();
        }
        // 告诉服务器客户端发送数据结束
        s.shutdownOutput();

        // 接收服务器响应
        InputStream is = s.getInputStream();
        len = is.read(buf);
        System.out.println(new String(buf, 0, len));
        // 关闭资源
        bos.close();
        bis.close();
        s.close();

    }
}
