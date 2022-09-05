package cn.ltpcloud.jdk8.lambda;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/05/14:46
 * @Description:
 */
// 函数式接口
@FunctionalInterface
interface Calc {
    void add(int a, int b);
}

@FunctionalInterface
interface Calc2 {
    void add();
}

/*
 * lambda表达式
 * 格式
 * 　　(参数列表) -> {表达式｜方法体;}
 * 说明
 * 　　参数列表：函数式接口中抽象方法的参数列表
 * 　　－>：前面的参数被用于后面{}的操作
 *     {}：函数式接口中抽象方法的重写
 * 本质
 * 　　函数式接口的实现类对象
 * */

public class LambdaDemo01 {
    public static void main(String[] args) {
        // 匿名内部类
        Calc calc1 = new Calc() {
            @Override
            public void add(int a, int b) {
                System.out.println(a + b);
            }
        };
        calc1.add(1, 2);
        // lambda
        // lambda可以看成式匿名内部类的简写
        Calc calc2 = (int a, int b) -> {
            System.out.println(a + b);
        };
        calc2.add(1, 2);

        Calc2 calc3 = () -> System.out.println(" ");
    }
}
