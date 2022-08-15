package com.xuemasi.exception;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/15/14:39
 * @Description: 多异常的处理
 */
public class ExceptionDemo02 {
    public static void main(String[] args) {
        // demo1();
        demo2();
    }

    // throws可以抛出多个异常名（实际上最多只会抛出一个异常对象）
    private static void demo2() throws ArithmeticException,ArrayIndexOutOfBoundsException{
        int a = 10;
        int b = 0;
        int[] arr = {1, 2, 3};
            System.out.println(a / b);
            System.out.println(arr[3]);
    }

    private static void demo1() {
        int a = 10;
        int b = 0;
        int[] arr = {1, 2, 3};
        try {
            System.out.println(a / b);
            System.out.println(arr[3]);
            System.out.println("不知道的异常");
        }catch (ArithmeticException ae) {
            System.out.println("除数不能为零");
        }catch (ArrayIndexOutOfBoundsException ie) {
            System.out.println("数组下标越界");
        }catch (Exception e) {
            System.out.println("未知异常");
        }
    }
}
