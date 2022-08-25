package cn.ltpcloud.api.day03.time8;

import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/18/16:37
 * @Description:
 */
public class ZoneDemo {
    public static void main(String[] args) {

    }

    @Test
    public void demo1() {
        // 获取所有可用的时区id
        Set<String> ids = ZoneId.getAvailableZoneIds();
        for (String id : ids) {
            System.out.println(id);
        }
        //获取指定的ZoneId
        ZoneId id = ZoneId.of("Asia/Aden");
        System.out.println(id);
    }

    @Test
    public void demo2(){
        ZonedDateTime now1 = ZonedDateTime.now();
        System.out.println(now1);
        ZonedDateTime now2 = ZonedDateTime.now(ZoneId.of("Asia/Aden"));
        System.out.println(now2);
    }
}
