package cn.ltpcloud.jdk8.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/06/9:51
 * @Description:
 */
/*
 * 终止操作
 * */
@SuppressWarnings("all")
public class StreamDemo03 {
    List<Employee> employees;

    @Before
    public void init() {
        employees = new ArrayList<>();
        employees.add(new Employee(1001, "tom", 31, 5555));
        employees.add(new Employee(1002, "jerry", 41, 6555));
        employees.add(new Employee(1003, "lucy", 51, 7555));
        employees.add(new Employee(1004, "tony", 61, 8555));
        employees.add(new Employee(1005, "tomas", 71, 9555));
        employees.add(new Employee(1006, "tfBoy", 21, 4555));
        employees.add(new Employee(1003, "lucy", 51, 7555));
    }

    // 匹配与查找
    @Test
    public void demo1() {
        // 判断所有员工年龄是否大于30
        boolean b = employees.stream().allMatch(employee -> employee.getAge() > 30);
        System.out.println(b);
        // 判断有员工年龄大于30
        boolean b1 = employees.stream().anyMatch(employee -> employee.getAge() > 30);
        System.out.println(b1);
        // 判断是否所有员工的年龄都不大于30
        boolean b3 = employees.stream().noneMatch(employee -> employee.getAge() > 30);
        System.out.println(b3);
        // 查找第一个姓名中包含t的员工
        Optional<Employee> t = employees.stream().filter(employee -> employee.getName().contains("t")).findFirst();
        System.out.println(t.get());

        // 查找任意姓名中包含t的员工
        Optional<Employee> t2 = employees.parallelStream().filter(employee -> employee.getName().contains("t")).findAny();
        System.out.println(t2.get());
        // 查找任意姓名中包含t的员工个数
        System.out.println(employees.stream().filter(employee -> employee.getName().contains("t")).count());
        // 获取年龄最大的员工
        System.out.println(employees.stream().max((e1, e2) -> e1.getAge() - e2.getAge()).get());
    }

    // 规约
    @Test
    public void demo2() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        /*
         * 运算规则：
         * 第一次运算：x的值为identity，y的值为流处理的第一个元素
         * 第二次运算：x的值为第一次运算的结果，y的值为流处理的第二个元素
         * */
        Integer reduce = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println(reduce); // 15

        Optional<Integer> op = list.stream().reduce((x, y) -> x * y);
        System.out.println(op);
    }

    // 收集
    @Test
    public void demo3() {
        // 获取所有姓名以t开头的员工
        List<Employee> t = employees.stream().filter(e -> e.getName().startsWith("t")).collect(Collectors.toList());
        t.forEach(System.out::println);
        // 获取员工的平均薪资
        Double t1 = employees.stream().filter(e -> e.getName().startsWith("t")).collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(t1);


    }
}
