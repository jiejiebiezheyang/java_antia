package cn.ltpcloud.pattern.proxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/05/11:28
 * @Description:
 */
/*
 * 静态代理
 * 需要定义代理类
 * */
interface Person {
    String BuyHouse(double money);
}

// 真实类
class Doctor implements Person {
    @Override
    public String BuyHouse(double money) {
        System.out.println("买房人买房");
        return "买房人花了" + money + "圆去买房";
    }
}

// 代理类：对真实类的功能进行代理
class Mediator implements Person {
    Person person;

    public Mediator(Person person) {
        this.person = person;
    }

    /*
     * 代理对象可以对真实对象的被代理功能进行增强
     * 1）参数增强
     * 2）功能增强
     * 3）返回值增强
     * */
    @Override
    public String BuyHouse(double money) {
        // 参数增强
        money *= 0.9;
        // 功能增强
        System.out.println("专车接");
        // 返回值增强
        System.out.println("专车送");
        // 返回值增强
        return person.BuyHouse(money) + "赠送豪华大礼包";
    }
}

public class StaticProxyDemo {
    public static void main(String[] args) {
        // 真实对象：买房人
        Person doctor = new Doctor();
        // 代理对象：中介
        Person intermediary = new Mediator(doctor);
        // 代理真实类功能
        System.out.println(intermediary.BuyHouse(100));
    }
}
