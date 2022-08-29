package cn.ltpcloud.io.day03;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/29/11:49
 * @Description:
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 7971524121415210280L;
    String name;
    int age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
