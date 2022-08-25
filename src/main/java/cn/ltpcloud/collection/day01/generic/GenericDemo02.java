package cn.ltpcloud.collection.day01.generic;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/19/17:04
 * @Description:
 */

/*
 * 泛型接口：泛型定义在接口上
 * 格式
 * interface 接口名<泛型类型1,泛型类型2>{}
 * */

interface Person<T> {
    void eat(T t);
}

// 实现类
// 知道实现什么类型
class PersonImpl1 implements Person<String> {

    @Override
    public void eat(String s) {
        System.out.println("吃" + s);
    }
}

// 不知什么类型
class PersonImpl2<T> implements Person<T> {
    @Override
    public void eat(T t) {
        System.out.println("吃" + t);
    }
}

public class GenericDemo02 {
    public static void main(String[] args) {
        Person<String> p1 = new PersonImpl1();
        p1.eat("馒头");

        Person<String> p2 = new PersonImpl2<>();
        p2.eat("包子");
        Person<Integer> p3 = new PersonImpl2<>();
        p3.eat(100);
    }
}
