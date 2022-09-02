package cn.ltpcloud.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/02/14:45
 * @Description:
 */
/*
 * 获取父类
 *
 * 获取实现的接口
 *
 * 获取所在的包
 *
 * 获取类上声明的注解
 * */
public class ReflectDemo05 {
    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        // 加载配置文件
        prop.load(ReflectDemo05.class.getClassLoader().getResourceAsStream("reflect.properties"));
        // 获取类名
        String className = prop.getProperty("className");
        Class<?> clazz = Class.forName(className);

        // 获取父类
        Class<?> superclass = clazz.getSuperclass();
        System.out.println(superclass);
        // 获取实现的接口
        Class<?>[] interfaces = clazz.getInterfaces();
        System.out.println(Arrays.toString(interfaces));
        // 获取所在的包
        Package aPackage = clazz.getPackage();
        System.out.println(aPackage);
        // 获取类上面声明的所有注解
        Annotation[] annotations = clazz.getAnnotations();
        System.out.println(Arrays.toString(annotations));
        System.out.println("=======================================================================================================");
        // 获取泛型父类定义的泛型  class Dog extends Animal<String>
        Class<?> clazz2 = Class.forName("cn.ltpcloud.reflection.Dog");
        // 获取泛型父类
        Type type = clazz2.getGenericSuperclass();
        // 转成参数化类型
        ParameterizedType parm = (ParameterizedType) type;
        // 获取声明的泛型
        Type[] types = parm.getActualTypeArguments();
        Class type1 = (Class) types[0];
        System.out.println(type1);
    }
}
