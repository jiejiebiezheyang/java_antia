package cn.ltpcloud.pattern.strategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/05/10:23
 * @Description:
 */
/*
 *
 * 获取所有年龄大于50的员工
 * 获取所有薪资小于5000的员工
 * */
public class EmployeeTest {
    public static void main(String[] args) {
        // 准备员工
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("zs", 33, new BigDecimal(8000)));
        employees.add(new Employee("ls", 44, new BigDecimal(9000)));
        employees.add(new Employee("ww", 55, new BigDecimal(1000)));
        employees.add(new Employee("zl", 66, new BigDecimal(4000)));
        employees.add(new Employee("tq", 77, new BigDecimal(3000)));
        employees.add(new Employee("fb", 22, new BigDecimal(2000)));

        // List<Employee> list1 = getEmployeeForAge(employees);
        // System.out.println(list1);

        // List<Employee> list2 = getEmployeeForSalary(employees);
        // System.out.println(list2);
        List<Employee> list3 = getEmployee(employees, new AgePredicate());
        System.out.println(list3);

        List<Employee> list4 = getEmployee(employees, new SalaryPredicate());
        System.out.println(list4);
        List<Employee> list5 = getEmployee(employees,e -> e.getAge()>50);
    }

    // 获取所有年龄大于50的员工
    private static List<Employee> getEmployeeForAge(List<Employee> employees) {
        List<Employee> list = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() > 50) {
                list.add(employee);
            }
        }
        return list;
    }

    //获取所有薪资小于5000的员工
    private static List<Employee> getEmployeeForSalary(List<Employee> employees) {
        List<Employee> list = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getSalary().doubleValue() < 5000) {
                list.add(employee);
            }
        }
        return list;
    }

    // 优化
    private static List<Employee> getEmployee(List<Employee> employees, MyPredicate<Employee> pre) {
        List<Employee> list = new ArrayList<>();
        for (Employee employee : employees) {
            if (pre.test(employee)) {
                list.add(employee);
            }
        }
        return list;
    }
}
