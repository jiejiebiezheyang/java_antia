package cn.ltpcloud.pattern.decorator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/05/10:11
 * @Description:
 */
public class PhoneTest {
    public static void main(String[] args) {
        // 打电话
        Phone phone = new IPhone();
        phone.fun();

        // 发短信 打电话
        Phone phone2 = new MsgDecorator(phone);
        phone2.fun();

        // 打电话 发信息 听音乐
        Phone phone3 = new MusicDecorator(new MsgDecorator(new IPhone()));
        phone3.fun();
    }
}
