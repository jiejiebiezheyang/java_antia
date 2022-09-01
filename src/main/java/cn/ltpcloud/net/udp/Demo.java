package cn.ltpcloud.net.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/01/12:05
 * @Description:
 */
class Send extends Thread {
    @Override
    public void run() {
        // 创建发送端的Socket对象
        DatagramSocket s = null;
        try {
            s = new DatagramSocket();
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }

        // 创建数据
        InetAddress ip = null;
        try {
            ip = InetAddress.getByName("172.30.16.29");
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        int port = 65535;
        // 封装System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = null;
            try {
                line = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            byte[] buf = line.getBytes();
            int len = buf.length;
            // 数据打包
            DatagramPacket packet = new DatagramPacket(buf, len, ip, port);
            // 发送数据
            try {
                s.send(packet);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if ("over".equals(line)) {
                break;
            }
        }
        // 释放资源
        s.close();
    }
}

class Receive extends Thread {
    @Override
    public void run() {
        // 以指定的端口后当前主机的IP创建socket
        DatagramSocket s = null;
        try {
            s = new DatagramSocket(65534);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }

        // 创建数据包用于接收数据
        byte[] buf = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        while (true) {
            // 接收数据
            try {
                s.receive(packet);
                // 解析数据包
                byte[] data = packet.getData();
                System.out.println("李元昊说：" + new String(data, 0, packet.getLength()));
                if (new String(packet.getData()).equals("over") || new String(packet.getData()).equals("拜拜")) {
                    break;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        // 释放资源
        s.close();
    }
}

public class Demo {
    public static void main(String[] args) {
        Thread t1 = new Send();
        Thread t2 = new Receive();

        t1.start();
        t2.start();
    }
}
