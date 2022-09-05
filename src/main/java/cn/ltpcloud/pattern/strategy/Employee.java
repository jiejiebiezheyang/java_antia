package cn.ltpcloud.pattern.strategy;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/05/10:21
 * @Description:
 */
public class Employee {
    private String name;
    private Integer age;
    private BigDecimal salary;

    public Employee() {
    }

    public Employee(String name, Integer age, BigDecimal salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(age, employee.age) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", age=" + age + ", salary=" + salary + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
