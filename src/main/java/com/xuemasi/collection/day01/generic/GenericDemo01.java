package com.xuemasi.collection.day01.generic;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/19/16:54
 * @Description:
 */
/*
 * 泛型：泛型定义在类上
 * 格式：
 * class 类名<泛型类型1,泛型类型2,...>{}
 * */
class Doo<T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

public class GenericDemo01 {
    public static void main(String[] args) {
        // 创建对象时确定泛型的具体类型
        Doo<String> doo1 = new Doo<String>();
        doo1.setT("张三");
        System.out.println(doo1.getT());

        // jkd7可以省略后面<>里的具体类型
        Doo<Integer> doo2 = new Doo<>();
        doo2.setT(100);
        System.out.println(doo2.getT());
    }
}
