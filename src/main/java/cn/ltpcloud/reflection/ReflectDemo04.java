package cn.ltpcloud.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/02/11:55
 * @Description:
 */
/*
 * 获取成员方法并使用
 * */
public class ReflectDemo04 {
    public static void main(String[] args) throws Exception {
        // 获取类
        Class<?> clazz = Class.forName("cn.ltpcloud.reflection.Student");

        // 获取当前类和父类中所有公共方法
        Method[] method = clazz.getMethods();
        System.out.println(Arrays.toString(method));
        // 获取当前类所有方法
        Method[] declaredMethods = clazz.getDeclaredMethods();
        System.out.println(Arrays.toString(declaredMethods));
        // 获取单个公共的方法
        Method eat = clazz.getMethod("eat");
        System.out.println(eat);
        // 获取单个任意方法
        Method sleep = clazz.getDeclaredMethod("sleep", String.class);
        System.out.println(sleep);
        System.out.println("============================================================================================================");
        Method getStr = clazz.getDeclaredMethod("getStr", int.class);
        getStr.setAccessible(true);
        // 获取修饰符
        int modifiers = getStr.getModifiers();
        System.out.println(Modifier.toString(modifiers));
        // 获取返回值类型
        System.out.println(getStr.getReturnType());
        // 获取方法名
        System.out.println(getStr.getName());
        // 获取参数类型
        Class<?>[] parameterTypes = getStr.getParameterTypes();
        System.out.println(Arrays.toString(parameterTypes));
        // 获取异常
        Class<?>[] exceptionTypes = getStr.getExceptionTypes();
        System.out.println(Arrays.toString(exceptionTypes));

        // 获取注解
        Annotation annotation = getStr.getAnnotation(Deprecated.class);
        System.out.println(annotation);
        System.out.println("============================================================================================================");
        Student student = (Student) clazz.newInstance();
        String invoke = (String) getStr.invoke(student,100);
        System.out.println(invoke);
    }
}
