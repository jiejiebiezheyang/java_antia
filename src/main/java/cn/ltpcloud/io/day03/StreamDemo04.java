package cn.ltpcloud.io.day03;

import org.junit.Test;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/29/11:44
 * @Description:
 */
/*
 * 序列化流和反序列化流
 * */
public class StreamDemo04 {
    // 序列化：对象变成流数据（流数据可以存在文件或网络中）
    @Test
    public void demo1() throws Exception {
        // 创建序列化流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\0816\\Desktop\\demo\\bean"));
        Dog d = new Dog("旺财");
        oos.writeObject(d);
        oos.close();
    }

    // 反序列化：对象的流数据还原成对象
    @Test
    public void demo2() throws Exception {
        // 创建反序列化流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\0816\\Desktop\\demo\\bean"));
        // 反序列化
        Dog d = (Dog) ois.readObject();
        System.out.println(d);
        ois.close();
    }

    // 序列化注意：不光序列化对象对应的类需要实现Serializable接口，对象属性涉及到的其他类也需要实现Serializable
    @Test
    public void demo3() throws Exception {
        // 创建序列化流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\0816\\Desktop\\demo\\bean"));
        Dog dog = new Dog("大黄", new Person("小明"), new Cat("小白"));

        oos.writeObject(dog);
        oos.close();
    }
}
