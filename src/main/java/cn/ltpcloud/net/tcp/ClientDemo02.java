package cn.ltpcloud.net.tcp;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/01/14:30
 * @Description:
 */
/*
 * 发送：
 *	控制台录入
 * */
public class ClientDemo02 {
    public static void main(String[] args) throws Exception {
        // 通过服务器ip和port创建TCP客户端的Socket对象
        InetAddress ip = InetAddress.getByName("172.30.16.115");
        while (true) {
            Socket s = new Socket(ip, 10000);
            OutputStream os = s.getOutputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // 获取数据流，写数据
            String line = br.readLine();
            byte[] buf = line.getBytes();
            os.write(buf);
            os.close();

            if (line.equals("over")) {
                s.close();
                break;
            }
        }
    }
}
