package cn.ltpcloud.api.day01;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/16/11:29
 * @Description:
 */
public class StringDemo01 {
    @Test
    public void demo01() {
        // 创建一个空的字符串
        String s = new String();
        System.out.println(s);

        byte[] b = {97, 98, 99, 100};
        //通过byte[] 创建字符串对象
        String s2 = new String(b);
        System.out.println(s2);

        // String(byte[] arr,int offset,int length):通过byte[]数组中的一部分创建字符串对象
        String s3 = new String(b, 1, 2);
        System.out.println(s3);

        char[] c = {'A', 'B', 'C', 'D', 'E'};
        // String(char[] arr):通过char[]创建字符串对象
        String s4 = new String(c);
        System.out.println(s4);

        // String(char[] arr,int offset,int length):通过char[]数组中的一部分创建字符串对象
        String s5 = new String(c, 2, 3);
        System.out.println(s5);

        // String(String original):通过字符串常量值创建字符串对象
        String s6 = new String("hello");
        System.out.println(s6);
    }

    /*
     * 面试题:
     *     前提:不能同时出现
     *     区别:
     *         String s1 = "hello";创建一次对象
     *         String s2 = new String("hello");创建两次对象
     * */
    @Test
    public void demo2() {
        String s1 = "hello";
        String s2 = new String("hello");
    }

    /*
     * 字符串拼接方式赋值的对比
     * 常量与常量的拼接结果在常量池。且常量池中不会存在相同内容的常量。
     *  2）只要其中一个是变量，结果就在堆中。
     *  3）如果拼接的结果调用intern()方法，返回值就在常量池中
     * */
    @Test
    public void demo3() {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "HelloWorld";
        System.out.println(s3 == s1 + s2);
        System.out.println(s3 == (s1 + s2).intern());
        System.out.println(s3.equals(s1 + s2));

        System.out.println(s3 == "Hello" + "World");
        System.out.println(s3.equals("Hello" + "World"));
    }

}
