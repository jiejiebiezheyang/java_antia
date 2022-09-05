package cn.ltpcloud.pattern.decorator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/05/9:49
 * @Description:
 */
public class IPhone implements Phone {
    @Override
    public void fun() {
        System.out.println("打电话");
    }
}
