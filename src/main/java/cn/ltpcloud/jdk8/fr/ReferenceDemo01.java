package cn.ltpcloud.jdk8.fr;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/05/16:57
 * @Description:
 */
/*
 * 方法引用可以看做是Lambda表达式深层次的表达。换句话说，方法引用就是Lambda表达式，
 * 也就是函数式接口的一个实例，通过方法的名字来指向一个方法。
 * */
public class ReferenceDemo01 {
    @Test
    public void test1() {
        Consumer<String> con1 = str -> System.out.println(str);
        con1.accept("北京");

        System.out.println("*******************");
        Consumer<String> con2 = System.out::println;
        con2.accept("beijing");
    }

    @Test
    public void test2() {
        Employee emp = new Employee(1001, "Tom", 23, 5600);

        Supplier<String> sup1 = () -> emp.getName();
        System.out.println(sup1.get());

        System.out.println("*******************");
        Supplier<String> sup2 = emp::getName;
        System.out.println(sup2.get());

    }

    // 情况二：类 :: 静态方法
    @Test
    public void test3() {
        Comparator<Integer> com1 = (t1, t2) -> Integer.compare(t1, t2);
        System.out.println(com1.compare(12, 21));

        System.out.println("*******************");
        Comparator<Integer> com2 = Integer::compare;
        System.out.println(com2.compare(12, 3));

    }

    @Test
    public void test4() {
        Function<Double, Long> func = new Function<Double, Long>() {
            @Override
            public Long apply(Double d) {
                return Math.round(d);
            }
        };

        System.out.println("*******************");

        Function<Double, Long> func1 = d -> Math.round(d);
        System.out.println(func1.apply(12.3));

        System.out.println("*******************");

        Function<Double, Long> func2 = Math::round;
        System.out.println(func2.apply(12.6));
    }

    @Test
    public void test5() {
        Comparator<String> com1 = (s1, s2) -> s1.compareTo(s2);
        System.out.println(com1.compare("abc", "abd"));

        System.out.println("*******************");

        Comparator<String> com2 = String::compareTo;
        System.out.println(com2.compare("abd", "abm"));
    }

    @Test
    public void test6() {
        BiPredicate<String, String> pre1 = (s1, s2) -> s1.equals(s2);
        System.out.println(pre1.test("abc", "abc"));

        System.out.println("*******************");
        BiPredicate<String, String> pre2 = String::equals;
        System.out.println(pre2.test("abc", "abd"));
    }

    @Test
    public void test7() {
        Employee employee = new Employee(1001, "Jerry", 23, 6000);


        Function<Employee, String> func1 = e -> e.getName();
        System.out.println(func1.apply(employee));

        System.out.println("*******************");

        Function<Employee, String> func2 = Employee::getName;
        System.out.println(func2.apply(employee));
    }
}
