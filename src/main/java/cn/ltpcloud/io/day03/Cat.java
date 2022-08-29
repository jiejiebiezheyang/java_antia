package cn.ltpcloud.io.day03;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/29/11:49
 * @Description:
 */
public class Cat implements Serializable {
    private static final long serialVersionUID = 6269916341768937796L;
    String name;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
