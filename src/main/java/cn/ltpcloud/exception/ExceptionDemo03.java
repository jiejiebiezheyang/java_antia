package cn.ltpcloud.exception;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/15/14:56
 * @Description:
 */

/*
 * finally
 *  里面的代码一定会执行（除非JVM退出）
 *  一般用来进行资源释放
 * */
public class ExceptionDemo03 {
    public static void main(String[] args) {
        int n = getN();
        System.out.println(n);
    }

    private static int getN() {
        int n = 1;
        try {
            n = 2;
            System.out.println(1 / 0);
        } catch (Exception e) {
            n = 3;
            /*
            * return 具体操作
            * 1) 打开方法和方法调用者之间的回路路径
            * 2) 传值（既使后面的值发生了改变，传的还是当前需要传的值）
            * 3) 关闭回路路径
            *
            * 当执行return操作时发现存在finally，等finally中所有代码执行完毕之后再传值
            * */
            return n;
        } finally {
            n = 4;
            return n;
        }
    }
}
