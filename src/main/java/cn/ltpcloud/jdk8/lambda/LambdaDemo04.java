package cn.ltpcloud.jdk8.lambda;

import java.util.function.BiFunction;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/06/9:36
 * @Description:
 */
/*
 * lambda延迟执行
 * */
public class LambdaDemo04 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        log("ok", s1 + s2);
        log2("ok", (a, b) -> a + b, s1, s2);
    }

    // 存在问题：当条件不成立的时候，还需要计算s1+s2，浪费时间
    public static void log(String condition, String msg) {
        if (condition.equals("ok")) {
            System.out.println("记录日志" + msg);
        }
    }

    public static void log2(String condition, BiFunction<String, String, String> msg, String s1, String s2) {
        if (condition.equals("ok")) {
            System.out.println("记录日志" + msg.apply(s1, s2));
        }
    }
}
