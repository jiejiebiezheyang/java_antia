package cn.ltpcloud.pattern.adaptor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/02/15:32
 * @Description:
 */
/*
 * 适配器类：对接口中所有方法进行空实现
 * */
public class MyMathAdaptor implements MyMath {
    @Override
    public void add() {
    }

    @Override
    public void aub() {
    }

    @Override
    public void mul() {
    }

    @Override
    public void div() {
    }
}
