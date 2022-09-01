package cn.ltpcloud.net.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
 *	接收到客户端的数据后，给客户端发送一条反馈信息
 * */
public class ServerDemo03 {
    public static void main(String[] args) throws Exception {
        // 创建TCP服务器端的Socket对象
        ServerSocket ss = new ServerSocket(10000);
        // 监听客户端连接
        Socket s = ss.accept();
        // 客户端输出流，返回数据给客户端
        BufferedWriter sbf = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        // 获取输入流，读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        while (true) {
            String data = br.readLine();
            // 客户端的ip
            String ip = s.getInetAddress().getHostAddress();
            // 客户端的端口号
            int port = s.getPort();
            System.out.println("from " + ip + ":" + port + " data is:" + data);
            // 发送数据给客户端
            sbf.write("服务器响应：收到啦~");
            sbf.write('\n');
            sbf.flush();

            if (data.equals("over")) {
                break;
            }
        }
        // 释放资源
        sbf.close();
        br.close();
        s.close();
        ss.close();


    }
}
