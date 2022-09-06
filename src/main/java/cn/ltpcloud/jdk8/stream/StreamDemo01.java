package cn.ltpcloud.jdk8.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/06/9:51
 * @Description:
 */
public class StreamDemo01 {
    List<Employee> employees;

    @Before
    public void init() {
        employees = new ArrayList<>();
        employees.add(new Employee(1001, "zs", 31, 5555));
        employees.add(new Employee(1002, "ls", 41, 6555));
        employees.add(new Employee(1003, "ww", 51, 7555));
        employees.add(new Employee(1004, "zl", 61, 8555));
        employees.add(new Employee(1005, "tq", 71, 9555));
    }

    @Test
    public void demo1() {
        /*
         * 通过集合获取流
         * Collection
         *     Stream()
         * Map
         *     map.KeySet().stream()
         *     map.values().stream()
         *     map.entrySet().stream()
         * */
        Stream<Employee> stream = employees.stream();
        stream.forEach(System.out::println);
    }

    @Test
    public void demo2() {
        /*
         * 通过数组
         * Arrays.stream(arr)
         * */
        int[] arr = {1, 2, 3};
        IntStream stream = Arrays.stream(arr);
        stream.forEach(System.out::println);
    }


    @Test
    public void demo3() {
        /*
         * Stream.of(T ...  t)
         * */
        Stream<String> stream = Stream.of("tom", "jerry", "tony");
        stream.forEach(System.out::println);
    }

    @Test
    public void demo4() {
        /*
         * 获取无限流
         * 迭代
         *     iterate(final T seed, final UnaryOperator<T> f)
         *     seed,作为第一次操作的参数，得到了一个返回值
         *     以后每次操作f的时候，使用上一次操作的结果作为参数
         * 生成
         *     generate(Supplier<T> s)
         * */
        Stream<Integer> stream1 = Stream.iterate(1, a -> ++a);
        // stream1.limit(10).forEach(System.out::println);

        Stream<Integer> stream2 = Stream.generate(() -> (int) (Math.random() * 100 + 1));
        stream2.limit(10).forEach(System.out::println);
    }
}
