package cn.ltpcloud.jdk8.lambda;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/05/15:00
 * @Description:
 */
/*
 * lambda省略规则
 * ->左边：lambda形参列表的参数类型可以省略(类型推断)；如果lambda形参列表只一个参数，其一对()也可以省略
 * ->右边：lambda体应该使用一对{}包裹；如果lambda体只一条执行语句（可能是return语句，省略这一对{}和return关键字
 * */
public class LambdaDemo02 {
    @Test
    public void demo1() {
        Runnable target1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };

        // 通过lambda创建
        Runnable target2 = () -> {
            System.out.println("world");
        };
        Runnable target3 = () -> System.out.println("world");

        new Thread(target1).start();
        new Thread(target2).start();
    }

    @Test
    public void demo2() {
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i1 - i2;
            }
        };

        Comparator<Integer> com2 = (Integer i1, Integer i2) -> {
            return i1 - i2;
        };
        Comparator<Integer> com3 = (i1, i2) -> i1 - i2;
        Integer[] arr = {3, 1, 5, 2, 4};
        Arrays.sort(arr, com3);
        System.out.println(Arrays.toString(arr));
    }
}
