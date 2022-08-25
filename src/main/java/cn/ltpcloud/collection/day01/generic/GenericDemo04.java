package cn.ltpcloud.collection.day01.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/22/9:42
 * @Description:
 */
/*
 * 通配符
 * */
public class GenericDemo04 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Number> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<Object> list4 = new ArrayList<>();

        fun1(list1);
        fun1(list2);
        fun1(list3);
        fun1(list4);

        fun2(list1);
        fun2(list2);
        // fun2(list3);
        // fun2(list4);

        // fun3(list1);
        fun3(list2);
        // fun3(list3);
        fun3(list4);
    }

    private static void fun1(List<?> list1) {
    }

    private static void fun2(List<? extends Number> list1) {
    }

    private static void fun3(List<? super Number> list1) {
    }
}
