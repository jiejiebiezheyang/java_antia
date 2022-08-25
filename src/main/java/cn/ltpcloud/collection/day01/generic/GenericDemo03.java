package cn.ltpcloud.collection.day01.generic;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/19/17:23
 * @Description:
 */
/*
 * 泛型方法：将泛型定义在方法上
 * 修饰符 <泛型类型> 返回值类型 方法名(参数列表)
 * */

class Goo {
    public <T> void getInstance(T t) {
        System.out.println(t);
    }
}

public class GenericDemo03 {
    public static void main(String[] args) {
        Goo goo = new Goo();
        // 在调用方法的时候明确泛型的类型
        goo.getInstance(100);
        goo.getInstance("字符串");
    }
}
