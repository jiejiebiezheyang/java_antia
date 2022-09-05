package cn.ltpcloud.pattern.strategy;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/05/11:15
 * @Description:
 */
public class AgePredicate implements MyPredicate<Employee> {
    @Override
    public boolean test(Employee employee) {
        return employee.getAge() > 50;
    }
}
