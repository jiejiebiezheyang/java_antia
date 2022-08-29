package cn.ltpcloud.io.day03;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/29/11:49
 * @Description:
 */
// 注意：序列化对象对应的类必须要实现序列化接口：不然会发生NotSerializableException异常
public class Dog implements Serializable {
    private static final long serialVersionUID = -7066711908656173840L;
    // 序列化版本id：保证可以用来正常的进行反序列化
    // 在进行反序列化的时候，会先判断类的UID和流数据中的UID是否一致，如果不一致会发生NotSerializableException
    String name;
    // transient临时的，被其修饰的成员不能进行序列化，保证了数据的安全性
    transient Person owner;
    Cat partner;

    public Dog() {
    }

    public Dog(String name, Person owner, Cat partner) {
        this.name = name;
        this.owner = owner;
        this.partner = partner;
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" + "name='" + name + '\'' + ", owner=" + owner + ", partner=" + partner + '}';
    }
}
