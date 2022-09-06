package cn.ltpcloud.jdk8.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/06/9:51
 * @Description:
 */
/*
 * 中间操作
 * */
@SuppressWarnings("all")
public class StreamDemo02 {
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

    @Test
    public void demo1() {
        // 筛选和切片
        // 过滤:获取所有年龄大于50的员工
        employees.stream().filter((employee -> employee.getAge() > 50)).forEach(System.out::println);
        System.out.println("============================================================");
        // 去重
        employees.stream().distinct().forEach(System.out::println);
        System.out.println("============================================================");
        // 限制：获取所有t开头的员工只要前两个
        employees.stream().filter(employee -> employee.getName().startsWith("t")).limit(2).forEach(System.out::println);
        System.out.println("============================================================");
        // 跳过：获取所有t开头的员工不要前两个
        employees.stream().filter(employee -> employee.getName().startsWith("t")).skip(2).forEach(System.out::println);
    }

    // 映射
    @Test
    public void demo2() {
        // 获取所有员工的姓名
        employees.stream().map(employee -> employee.getName()).forEach(System.out::println);
        System.out.println("============================================================");
        // 获取所有员工名称的字符
        employees.stream().map(employee -> getStram(employee.getName())).forEach(stm -> {
            stm.forEach(System.out::println);

        });
        System.out.println("============================================================");
        employees.stream().flatMap(employee -> getStram(employee.getName())).forEach(System.out::println);
    }

    public Stream<Character> getStram(String s) {
        Character[] chars = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        return Arrays.stream(chars);
    }

    // 排序
    @Test
    public void demo3() {
        // 自然排序
        employees.stream().sorted().forEach(System.out::println);
        System.out.println("============================================================");

        // 比较器排序
        employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary() - o2.getSalary();
            }
        }).forEach(System.out::println);
    }
}
