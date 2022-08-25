package cn.ltpcloud.basic.day004;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/03/11:30
 * @Description:
 */
public class FunctionDemo01 {
    public static void main(String[] args) {
        // 调用方法
        // printHello();
        // 这里的n叫实际参数，在方法调往时实参的值会传递给形参，对形参进行初始化赋值
        printHello(3);

        int sum = getSum(100);
        System.out.println(sum);
    }

    // 无参数无返回值
    // 打印输出十次hello
    // 参数列表中的n成为形式参数：只规定参数的类型
    public static void printHello(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
    }
    // 有参数无返回值
    public static void printHello(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Hello");
        }
    }

    // 无参数有返回值
    // 打印输出1-10整数和
    public static int getSum(){
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    // 有参数有返回值
    // 打印输出1-n整数和
    public static int getSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
