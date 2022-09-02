package cn.ltpcloud.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/02/11:32
 * @Description:
 */
/*
 * 获取成员变量并使用
 * */
public class ReflectDemo02 {
    public static void main(String[] args) throws Exception {
        // 获取类
        Class<?> clazz = Class.forName("cn.ltpcloud.reflection.Student");
        // 获取所有公共的成员变量
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("==========================================================");
        // 获取所有的成员变量
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }
        System.out.println("==========================================================");
        // 获取指定名称的公共的成员变量
        System.out.println(clazz.getField("name"));
        // 获取指定名称的任意权限的成员变量
        Field age = clazz.getDeclaredField("age");
        System.out.println(age);
        System.out.println("==========================================================");

        // 获取字段的修饰符
        int modifiers = age.getModifiers();
        String s = Modifier.toString(modifiers);
        System.out.println(s);
        // 获取字段类型
        Class<?> type = age.getType();
        System.out.println(type);
        // 获取字段的名称
        System.out.println(age.getName());
        System.out.println("==========================================================");

        Student stu = (Student) clazz.newInstance();
        System.out.println(stu);
        // 取消访问age的语言检查机制（无障碍）
        age.setAccessible(true);
        // 设置字段值
        age.set(stu, 11);
        // 获取字段值
        System.out.println(age.get(stu));
        System.out.println(stu);
    }
}
