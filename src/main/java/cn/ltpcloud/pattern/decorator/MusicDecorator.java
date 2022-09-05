package cn.ltpcloud.pattern.decorator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/05/10:10
 * @Description:
 */
public class MusicDecorator extends PhoneDecorator {
    public MusicDecorator(Phone phone) {
        super(phone);
    }

    @Override
    public void fun() {
        super.fun();
        System.out.println("听音乐");
    }
}
