package cn.ltpcloud.reflection;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/02/11:55
 * @Description:
 */
/*
 * 获取并使用构造器
 * */
public class ReflectDemo03 {
    public static void main(String[] args) throws Exception {
        // 获取类
        Class<?> clazz = Class.forName("cn.ltpcloud.reflection.Student");
        // 获取所有公共的构造器
        Constructor<?>[] constructors = clazz.getConstructors();
        System.out.println(Arrays.toString(constructors));
        // 获取所有的构造器
        Constructor<?>[] constructors2 = clazz.getDeclaredConstructors();
        System.out.println(Arrays.toString(constructors2));
        // 获取公共的构造器
        Constructor<?> constructor = clazz.getConstructor(); // 无参构造
        System.out.println(constructor);
        // 获取任意单个的构造器
        Constructor<?> constructor2 = clazz.getDeclaredConstructor(String.class, int.class); // 有参构造
        System.out.println(constructor2);
        Student s1 = (Student) constructor.newInstance(); // 通过无参构造创建对象
        constructor2.setAccessible(true);
        Student s2 = (Student) constructor2.newInstance("zs", 11); // 通过有参构造创建对象

        System.out.println(s1);
        System.out.println(s2);

    }
}
