package cn.ltpcloud.reflection;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/02/10:38
 * @Description:
 */
@SuppressWarnings("all")
public class Student implements Serializable, Cloneable {
    public String name;
    private int age;

    public Student() {
    }

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("吃白萝卜");
    }

    @Deprecated
    protected String getStr(int n) throws ArithmeticException {
        return "hello" + n;
    }

    private void sleep(String addr) {
        System.out.println("在" + addr + "上睡觉...");
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
