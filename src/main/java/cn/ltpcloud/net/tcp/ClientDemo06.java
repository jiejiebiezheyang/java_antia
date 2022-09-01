package cn.ltpcloud.net.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
 *	接收服务器返回的信息（响应）
 * */
public class ClientDemo06 {
    public static void main(String[] args) throws Exception {
        // 通过服务器ip和port创建TCP客户端的Socket对象
        InetAddress ip = InetAddress.getByName("172.30.16.115");
        Socket s = new Socket(ip, 10000);
        // 获取输出流,(写数据)
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        // 读取控制台
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            // 获取数据流，写数据
            String line = br.readLine();
            bw.write(line);
            bw.write('\n');
            bw.flush();
            if (line.equals("over")) {
                break;
            }
        }
        br.close();
        bw.close();
        s.close();
    }
}
