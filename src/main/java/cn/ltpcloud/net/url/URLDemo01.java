package cn.ltpcloud.net.url;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/02/9:40
 * @Description:
 */
public class URLDemo01 {
    public static void main(String[] args) throws Exception {
        // 创建url
        URL url = new URL("http://172.30.16.115:8080/examples/beauty.jpg?uname=zs&age=11");

        System.out.println("协议=" + url.getProtocol());
        System.out.println("主机/ip=" + url.getHost());
        System.out.println("端口=" + url.getPort());
        System.out.println("path=" + url.getPath()); // /examples/beauty.jpg
        System.out.println("file=" + url.getFile()); // /examples/beauty.jpg?uname=zs&age=11
        System.out.println("参数列表=" + url.getQuery()); // uname=zs&age=11

        // 获取url资源的连接
        URLConnection connection = url.openConnection();
        System.out.println(connection);

        InputStream is = connection.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\0816\\Desktop\\server\\1.jpg");
        byte[] buf = new byte[1024];
        int len;
        while ((len = is.read(buf)) != -1) {
            fileOutputStream.write(buf, 0, len);
        }
    }
}
