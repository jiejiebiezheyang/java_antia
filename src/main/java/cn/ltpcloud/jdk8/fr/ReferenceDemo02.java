package cn.ltpcloud.jdk8.fr;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/05/17:17
 * @Description:
 */
/*
 * 构造器引用
 * 类名::new
 * */
@FunctionalInterface
interface BiiFunction<A, B, C, D, R> {
    R apply(A a, B b, C c, D d);
}

public class ReferenceDemo02 {
    public static void main(String[] args) {
        // 通过无参构造创建
        Employee e1 = new Employee();
        Supplier<Employee> sup = Employee::new;
        System.out.println(sup.get());
        // 通过1个参数构造创建
        Function<String, Employee> fun = Employee::new;
        System.out.println(fun.apply("张三"));
        // 通过多个参数构造创建
        BiiFunction<Integer, String, Integer, Integer, Employee> biiFun = Employee::new;
        System.out.println(biiFun.apply(1001, "李四", 11, 1234));
    }
}
