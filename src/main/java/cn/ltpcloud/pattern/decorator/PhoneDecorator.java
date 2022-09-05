package cn.ltpcloud.pattern.decorator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/05/9:52
 * @Description:
 */
/*
 * 对功能进行装饰-->对对象进行装饰-->对类进行装饰-->最接口进行装饰
 * */
public class PhoneDecorator implements Phone{
    private Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    public void fun() {
        phone.fun();
    }
}
