package cn.ltpcloud.api.day03.time8;

import javax.crypto.spec.PSource;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/18/14:31
 * @Description:
 */
public class InstantDemo {
    public static void main(String[] args) {
        // 获取当前时间戳
        Instant now = Instant.now();
        System.out.println(now);

        // 通过毫秒值获取对应时间戳
        Instant it = Instant.ofEpochMilli(1000);
        System.out.println(it);

        // 获取时间戳的毫秒值
        System.out.println(it.toEpochMilli());

        // 通过指定的时区偏移量获取OffsetDateTime
        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);
    }
}
