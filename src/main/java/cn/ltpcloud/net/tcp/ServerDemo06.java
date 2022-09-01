package cn.ltpcloud.net.tcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
 *	接收多个客户端
 * */
public class ServerDemo06 {
    public static void main(String[] args) throws Exception {
        // 创建TCP服务器端的Socket对象
        ServerSocket ss = new ServerSocket(10000);
        while (true) {
            // 监听客户端连接
            Socket s = ss.accept();
            // 服务器为每个客户端提供线程对象，用于和客户端进行交互
            new Thread() {
                @Override
                public void run() {
                    try {
                        // 获取输入流，读取数据
                        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                        while (true) {
                            String data = br.readLine();
                            // 客户端的ip
                            String ip = s.getInetAddress().getHostAddress();
                            // 客户端的端口号
                            int port = s.getPort();
                            System.out.println("from " + ip + ":" + port + " data is:" + data);

                            if (data.equals("over")) {
                                break;
                            }
                        }
                        // 释放资源
                        br.close();
                        s.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
