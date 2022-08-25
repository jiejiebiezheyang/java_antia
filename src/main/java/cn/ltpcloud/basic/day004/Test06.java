package cn.ltpcloud.basic.day004;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/03/12:04
 * @Description: 练习
 */
public class Test06 {
    /*
     * 斐波那契数列
     * 1 1 2 3 5 8 13...
     *
     * */
    public static void main(String[] args) {


        int a = f(2);
        int b = f(3);
        int c = f(4);
        int d = f(5);
        int e = f(6);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }

    // 求出斐波那契数列第n项的值
    public static int Fibonacci(int n) {
        int a = 1; // 前面第一项的值
        int b = 1; // 前面第二项的值
        int c = 1; // 需要的值
        while (n > 2) {
            c = a + b;
            a = b;
            b = c;
            n--;
        }
        return c;
    }

    public static int f(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return f(n - 1) + f(n - 2);
        //
    }
}
