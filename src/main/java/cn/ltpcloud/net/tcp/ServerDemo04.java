package cn.ltpcloud.net.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/01/16:53
 * @Description:
 */
public class ServerDemo04 {
    public static void main(String[] args) throws Exception {
        // 创建服务器
        ServerSocket s = new ServerSocket(10000);
        while (true) {
            // 监听客户端
            Socket client = s.accept();
            new Thread() {
                @Override
                public void run() {
                    synchronized (s){
                        try {
                            // 获取输入流，获取文件
                            BufferedInputStream bis = new BufferedInputStream(client.getInputStream());
                            // 获取输出流 保存文件
                            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\0816\\Desktop\\server\\"+ System.currentTimeMillis() +  ".jpg"));

                            // 读取客户端发来的数据，并保存
                            byte[] buf = new byte[1024];
                            int len;
                            while ((len = bis.read(buf)) != -1) {
                                bos.write(buf, 0, len);
                                bos.flush();
                            }

                            // 服务器给客户端发送信息
                            OutputStream os = client.getOutputStream();
                            os.write("上传成功！".getBytes());

                            os.close();
                            bos.close();
                            bis.close();
                            client.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }.start();
        }
    }
}
