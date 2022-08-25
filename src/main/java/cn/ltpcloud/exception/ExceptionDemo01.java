package cn.ltpcloud.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/15/14:06
 * @Description:
 */
/*
 * 异常处理方式1：try...catch
 * 异常处理方式2：throws（抛出）
 * */
public class ExceptionDemo01 {
    public static void main(String[] args) {
        try {
            /*
            * 调用的方法如果有异常抛出。则该方法的调用者要么自己解决该异常（try...catch）
            * 要么继续往上抛（throws）
            * */
            demo1();
        }catch (ArithmeticException e){
            System.out.println("除数不能为零");
        }
        // demo2();
    }

    /*
     * 运行时异常可以不用进行异常处理（使用默认的异常处理方案）
     * 但是在实际开发中，遇到运行时异常，也是需要进行处理的
     * */
    private static void demo1() throws ArithmeticException { // 异常抛给了方法的调用者
        int a = 10;
        int b = 0;
        // ArithmeticException(算数异常)
        System.out.println(a / b);
    }

    // 编译异常一定要进行异常的处理
    private static void demo2() {
        SimpleDateFormat sdf = new SimpleDateFormat();
        try {
            // 可能会发生异常的代码
            Date date = sdf.parse("2012-12-12");
            // 一旦出现异常，同意作用域下面的代码都不是执行
            System.out.println(date);
        } catch (ParseException e) {
            // 如果try中含有我们的异常，通过catch进行捕获，然后给出该异常的处理方案
            /*
             * JVM默认的处理方案
             * 1) 打印异常名
             * 2) 打印异常信息
             * 3) 给出异常代码的位置
             * */
            // e.printStackTrace();
            System.out.println("格式不对!");
        }
    }
}
