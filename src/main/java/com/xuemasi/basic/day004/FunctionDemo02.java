package com.xuemasi.basic.day004;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/03/11:55
 * @Description:
 */
public class FunctionDemo02 {
    public static void main(String[] args) {
        f(5);
    }

    // 1+2+3+......+n
    public static int f(int n) {

        // 递归一定要有结束条件
        if (n == 1) {
            return 1;
        }
        // 找准递归的规律
        // 方法递归:在方法内部调用方法本身的现象
        return f(n - 1) + n;

    }
}
