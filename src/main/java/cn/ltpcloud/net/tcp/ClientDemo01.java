package cn.ltpcloud.net.tcp;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/01/14:30
 * @Description:
 */
/*
 * 发送：
 *	创建TCP客户端的Socket对象
 *	获取输出流，写数据
 *	释放资源
 * */
public class ClientDemo01 {
    public static void main(String[] args) throws Exception {
        // 通过服务器ip和port创建TCP客户端的Socket对象
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        Socket s = new Socket(ip, 10000);

        // 获取数据流，写数据
        OutputStream os = s.getOutputStream();
        os.write("啦啦啦啦啦".getBytes());

        os.close();
        s.close();
    }
}
