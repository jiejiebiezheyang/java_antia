package com.xuemasi.basic.day001;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/07/29/13:50
 * @Description: 整型
 */
public class Demo003 {
    public static void main(String[] args) {
        // 定义整型
        byte b1 = 1; //-128~127
        short s1 = 2;
        int i1 = 3;
        long l1 = 4;

        // b1 = 1.2; //类型不满足要求

        // b1 = 128; // 超出范围

        // int最大值
        System.out.println(Integer.MAX_VALUE);//2147483647
        // int最小值
        System.out.println(Integer.MIN_VALUE);//-2147483648

        //1java在数学运算的时候不检查范围；在超出范围的时候会发生溢出问题（数据损失
        int a = Integer.MAX_VALUE + 1;
        System.out.println(a);

        // 运算的时候要保持类型一致；同类型数据参与运算，返回同类型的结果
        long c = Integer.MAX_VALUE + 1;
        System.out.println(c);
        // 如果类型不同，需要类型转换
        long b = Integer.MAX_VALUE + 1L;
        System.out.println(b);
        // 2long一般用来处理时间，Java中时间是以毫秒计算；long类型的值一般以"l"或"L"结尾
        long l = 100L;
        long time = System.currentTimeMillis();//获取当前时间毫秒值 , JAVA时间元年：1970-1-1 00:00:00
        System.out.println(time);
        // 3通常，定义整型变量时，使用int型
        // 4整型的常量，默认类型是：int(缺省)


    }
}
