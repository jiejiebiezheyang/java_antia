package cn.ltpcloud.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/01/10:21
 * @Description:
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        // 通过主机名或ip字符串获取id对象
        InetAddress ip1 = InetAddress.getByName("DESKTOP-MTLPPP0");
        System.out.println(ip1);
        InetAddress ip2 = InetAddress.getByName("192.168.56.1");
        System.out.println(ip2);

        // 获取当前主机的IP对象
        InetAddress ip3 = InetAddress.getLocalHost();
        System.out.println(ip3);

        System.out.println(ip1 == ip2);
        System.out.println(ip1 == ip3);
        System.out.println(ip2 == ip3);
        System.out.println(ip1.equals(ip2));
        System.out.println(ip1.equals(ip3));
        System.out.println(ip2.equals(ip3));

        // 获取主机名
        System.out.println(ip1.getHostName());
        System.out.println(ip2.getHostName());
        System.out.println(ip3.getHostName());
        // 获取ip字符串
        System.out.println(ip1.getHostAddress());
        System.out.println(ip2.getHostAddress());
        System.out.println(ip3.getHostAddress());
    }
}
