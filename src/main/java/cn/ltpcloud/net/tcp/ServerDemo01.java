package cn.ltpcloud.net.tcp;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/01/14:22
 * @Description:
 */
/*
 * 接收：
 *	创建TCP服务器端的Socket对象
 *	监听客户端连接
 *	获取输入流，读取数据
 *	释放资源
 * */
public class ServerDemo01 {
    public static void main(String[] args) throws Exception {
        // 创建TCP服务器端的Socket对象
        ServerSocket ss = new ServerSocket(10000);
        // 监听客户端连接
        Socket s = ss.accept();
        // 获取输入流，读取数据
        InputStream is = s.getInputStream();
        byte[] buf = new byte[1024];
        int len = is.read(buf);
        String data = new String(buf, 0, len);
        // 客户端的ip
        String ip = s.getInetAddress().getHostName();
        // 客户端的端口号
        int port = s.getPort();
        System.out.println("from " + ip + ":" + port + " data is:" + data);
        // 释放资源
        is.close();
        s.close();
        ss.close();
    }
}
