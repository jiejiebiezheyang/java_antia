package cn.ltpcloud.pattern.strategy;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/05/11:13
 * @Description:
 */
@FunctionalInterface
public interface MyPredicate<T> {
    boolean test(T t);
}
