package cn.ltpcloud.net.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/01/11:18
 * @Description:
 */
/*
 *接收：
 *	创建UDP接收端的Socket对象
 *	创建数据包用于接收数据
 *	接收数据
 *	解析数据包
 *	释放资源
 * */
public class ReceiveDemo01 {
    public static void main(String[] args) throws Exception {
        // 以指定的端口后当前主机的IP创建socket
        DatagramSocket s = new DatagramSocket(65534);

        // 创建数据包用于接收数据
        byte[] buf = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        // 接收数据
        s.receive(packet);

        // 解析数据包
        // 获取发送端的ip
        System.out.print(packet.getAddress().getHostAddress());
        // 获取发送端的端口
        System.out.println(":" + packet.getPort());
        // 获取发送过来的数据
        byte[] data = packet.getData();
        System.out.println("发送的数据为：\n" + new String(data, 0, packet.getLength()));
        // 获取发送过来的字节数
        System.out.println("字节数为：" + packet.getLength());

        // 释放资源
        s.close();
    }
}
