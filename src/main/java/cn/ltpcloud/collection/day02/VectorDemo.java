package cn.ltpcloud.collection.day02;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/22/11:58
 * @Description:
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        // 添加元素
        vector.addElement("hello");
        vector.addElement("world");
        vector.addElement("Java");

        // 遍历Vector
        // 方式一：迭代器
        // 方式二：for+get()
        // 方式三：for+elementAt()
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }
        System.out.println("=============================");

        // 方法四：elements()
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
