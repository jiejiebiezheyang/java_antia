package cn.ltpcloud.net.udp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/01/11:35
 * @Description:
 */
/*
 * 发送：
 *  数据来自于控制台录入
 *  可以发送多条数据
 * */
public class SendDemo02 {
    public static void main(String[] args) throws Exception {
        // 创建发送端的Socket对象
        DatagramSocket s = new DatagramSocket();

        // 创建数据
        InetAddress ip = InetAddress.getByName("192.168.56.1");
        int port = 65534;
        // 封装System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("请发言：");
            String line = br.readLine();
            byte[] buf = line.getBytes();
            int len = buf.length;
            // 数据打包
            DatagramPacket packet = new DatagramPacket(buf, len, ip, port);
            // 发送数据
            s.send(packet);
            if ("over".equals(line)) {
                break;
            }
        }
        // 释放资源
        s.close();
    }
}
