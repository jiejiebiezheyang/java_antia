package cn.ltpcloud.net.udp;

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
 *	创建UDP发送端的Socket对象
 *	创建数据
 *	数据打包
 *	发送数据
 *	释放资源
 * */
public class SendDemo01 {
    public static void main(String[] args) throws Exception {
        // 创建发送端的Socket对象
        DatagramSocket s = new DatagramSocket();

        // 创建数据
        byte[] buf = "hello udp...".getBytes();
        int len = buf.length;
        InetAddress ip = InetAddress.getByName("192.168.56.1");
        int port = 65534;
        // 数据打包
        DatagramPacket packet = new DatagramPacket(buf, len, ip, port);

        // 发送数据
        s.send(packet);

        // 释放资源
        s.close();
    }
}
