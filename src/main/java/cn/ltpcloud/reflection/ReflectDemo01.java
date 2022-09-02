package cn.ltpcloud.reflection;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/02/10:37
 * @Description:
 */
/*
 * 获取Class实例的方式
 * */
public class ReflectDemo01 {
    public static void main(String[] args) throws Exception {
        // 方式1:类名.class
        Class<Student> clazz1 = Student.class;

        // 方式2:对象.getClass
        Student s = new Student();
        Class<? extends Student> clazz2 = s.getClass();

        // 方式3: Class.forName(classPath)
        Class<?> clazz3 = Class.forName("cn.ltpcloud.reflection.Student");

        // 方式4:classLoader.loadClass(classPath)
        ClassLoader classLoader = ReflectDemo01.class.getClassLoader();
        Class<?> clazz4 = classLoader.loadClass("cn.ltpcloud.reflection.Student");
        System.out.println(clazz1);
        System.out.println(clazz2);
        System.out.println(clazz3);
        System.out.println(clazz4);
        System.out.println(clazz1==clazz2);
        System.out.println(clazz1==clazz3);
        System.out.println(clazz1==clazz4);
    }
}
