package cn.ltpcloud.pattern.strategy;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/05/11:17
 * @Description:
 */
public class SalaryPredicate implements MyPredicate<Employee> {
    @Override
    public boolean test(Employee employee) {
        return employee.getSalary().doubleValue() < 5000;
    }
}
