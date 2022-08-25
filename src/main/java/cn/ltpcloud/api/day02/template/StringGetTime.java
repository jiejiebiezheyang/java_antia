package cn.ltpcloud.api.day02.template;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/17/15:32
 * @Description:
 */
public class StringGetTime extends GetTime {

    @Override
    public void code() {
        String s = "hello";
        for (int i = 0; i < 5000; i++) {
            s += "world";
        }
    }
}
