package cn.ltpcloud.annotation;

import java.io.FileOutputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/02/17:41
 * @Description:
 */
class Calc {
    @Check
    public int add(int a, int b) {
        return a + b;
    }

    @Check
    public int sub(int a, int b) {
        return a - b;
    }

    @Check
    public int mul(int a, int b) {
        return a * b;
    }

    @Check
    public int div(int a, int b) {
        return a / b;
    }
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Check { // 声明了该注解的方法才会进行测试

}

public class Test01 {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("cn.ltpcloud.annotation.Calc");
        Object o = aClass.newInstance();
        // 获取所有方法
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.isAnnotationPresent(Check.class)) {
                // 将异常记录到文件中
                FileOutputStream fos = new FileOutputStream("C:\\Users\\0816\\Desktop\\server\\bug.txt", true);
                for (int i = 0; i < 20; i++) {
                    try {
                        // 判断方法是否定义了 Check
                        Object result = declaredMethod.invoke(o, 2, 0);
                        System.out.println(result);
                    } catch (Exception e) {

                        String name = declaredMethod.getName();
                        // 日期
                        Date date = new Date();
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
                        String s = sdf.format(date) + ":方法 " + name + " 出现异常:" + e.getCause().getClass().getSimpleName();
                        fos.write(s.getBytes());
                        fos.write('\n');
                    }
                }
            }
        }
    }
}
