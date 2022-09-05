package cn.ltpcloud.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/05/14:08
 * @Description:
 */
/*
 * 动态代理
 * 不需要定义代理类
 * */
interface Function {
    String sail(double money);
}

// 真实类
class Lenovo implements Function {
    @Override
    public String sail(double money) {
        return "买联想电脑,只要" + money + "元";
    }
}

@SuppressWarnings("all")
public class DynamicProxyDemo {
    public static void main(String[] args) {
        // 创建真实类对象
        Lenovo l = new Lenovo();

        // 加载代理类的类加载器(系统类加载器)
        ClassLoader loader = l.getClass().getClassLoader();
        // 代理类实现接口（真实类实现的接口）
        Class<?>[] interfaces = l.getClass().getInterfaces();
        // 代理功能的实现
        InvocationHandler handler = new InvocationHandler() {
            /*
             * proxy:代理对象
             * method:真实类中被代理的方法
             * args:代理方法的形参
             * */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                double money = (Double) args[0];
                money *= 0.95;
                System.out.println("专车接");
                System.out.println("专车送");
                return method.invoke(l, money) + "还送一个大礼包";
            }
        };
        // 创建代理对象
        Function proxy = (Function) Proxy.newProxyInstance(loader, interfaces, handler);
        String s = proxy.sail(5000);
        System.out.println(s);
    }
}
