package cn.ltpcloud.net.url;

import java.net.URL;
import java.net.URLConnection;
import java.time.Instant;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/02/9:40
 * @Description:
 */
/*
 * URLConnection:常用方法
 * */
public class URLDemo03 {
    public static void main(String[] args) throws Exception {
        // 创建url
        URL url = new URL("http://localhost:8080/oa/img/02.png");
        // 获取url资源的连接
        URLConnection conn = url.openConnection();
        System.out.println(conn);

        // 获取内容
        // URLImageSource content = (URLImageSource) conn.getContent();
        System.out.println(conn.getContent());
        // 获取资源的字节数
        System.out.println(conn.getContentLength());
        // 获取内容的类型
        System.out.println(conn.getContentType());
        // 获取日期(当前时间)
        long time = conn.getDate();
        System.out.println(time);
        Date date = new Date(time);
        // 获取资源最后修改时间毫秒值
        long lastModified = conn.getLastModified();
        Instant instant = Instant.ofEpochMilli(lastModified);
        System.out.println(instant);
    }
}
