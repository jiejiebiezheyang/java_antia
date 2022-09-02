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
/*
 *   下载服务器上的图片
 * */
public class URLDemo02 {
    public static void main(String[] args) throws Exception {
        // 创建url
        URL url = new URL("http://localhost:8080/oa/img/02.png");


        // 获取url资源的连接
        URLConnection connection = url.openConnection();
        System.out.println(connection);

        InputStream is = connection.getInputStream();
        FileOutputStream fos = new FileOutputStream("C:\\Users\\0816\\Desktop\\server\\1.jpg");
        byte[] buf = new byte[1024];
        int len;
        while ((len = is.read(buf)) != -1) {
            fos.write(buf, 0, len);
        }
        fos.close();
        is.close();
    }
}
