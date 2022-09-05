package cn.ltpcloud.jdk8.lambda;

import org.junit.Test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/05/15:17
 * @Description:
 */
/*
 * 公共的函数式接口
 * */
@SuppressWarnings("all")
public class LambdaDemo03 {
    @Test
    public void demo1() {
        // 需求：打印输出一个字符串
        // 消费型接口
        Consumer<String> con = s -> System.out.println("s=" + s);
        con.accept("hello");
    }

    @Test
    public void demo2() {
        // 需求：获取 1~10 的和
        // 供给型接口
        Supplier<Integer> supp = () -> {
            int sum = 0;
            for (int i = 0; i <= 10; i++) {
                sum += i;
            }
            return sum;
        };
        Integer integer = supp.get();
        System.out.println(integer);
    }

    @Test
    public void demo3() {
        // 需求：获取 1~n 的和
        // 函数型接口
        Function<Integer, Integer> fun = (n) -> {
            int sum = 0;
            for (int i = 0; i <= n; i++) {
                sum += i;
            }
            return sum;
        };

        System.out.println(fun.apply(10));
    }

    @Test
    public void demo4() {
        // 需求：判断字符串长度是否大于5
        // 断定型接口
        Predicate<String> pre = s -> s.length() > 5;
        System.out.println(pre.test("HelloWorld"));
        System.out.println(pre.test("java"));
    }
}
