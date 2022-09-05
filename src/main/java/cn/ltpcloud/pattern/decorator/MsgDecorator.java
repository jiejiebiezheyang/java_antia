package cn.ltpcloud.pattern.decorator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/05/10:06
 * @Description:
 */
/*
 *
 * 由具体的装饰类进行功能的装饰
 * 可以对IPhone的功能进行装饰
 * 也可以对具体的装饰类再次进行装饰
 * */
public class MsgDecorator extends PhoneDecorator {

    public MsgDecorator(Phone phone) {
        super(phone);
    }

    @Override
    public void fun() {
        System.out.println("发短信");
        super.fun();
    }
}
