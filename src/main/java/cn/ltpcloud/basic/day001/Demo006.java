package cn.ltpcloud.basic.day001;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/07/29/16:55
 * @Description: 基本类型转换
 */
public class Demo006 {
    public static void main(String[] args) {
        byte b = 10;
        // 默认转换;先将b由byte类型转为int类型，然后再进行=（赋值）操作
        int a = b;

        // 强制转换
        int m = 10000;
        // 先经m由int类型强制转为byte类型，然后进行=操作
        // 注意：强制转换可能会发生数据溢出（强转的值需要在强转类型的范围之内）
        byte n = (byte) m;
        System.out.println(n);

        // byte,short,char在参与运算的时候，会默认转成int
        short sh = 2;
        // sh = sh + 3; // sh是short，参与运算默认转成int，sh+3结果为int
        sh = (short) (sh + 3);

        //short 和 char 之间互相转换
        short s = 65;
        char c = (char) s;
        System.out.println(c);

        char c2 = 'B';
        short s2 = (short) c2;
        System.out.println(s2);

        // 不涉及常量的运算，只针对变量的运算
        byte bt = 10;
        // byte bt2 = bt + 20;

        // 常量运算，先运算，如果结果不超出范围，直接赋值，结果超出范围，报错
        byte bt2 = 10 + 20;
        // byte bt3 = 100+1000;

    }
}
