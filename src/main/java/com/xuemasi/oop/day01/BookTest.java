package com.xuemasi.oop.day01;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/05/10:24
 * @Description:
 */
public class BookTest {
    public static void main(String[] args) {
         // 创建book对象

        Book book = new Book();

        // 访问成员变量和方法
        System.out.println(book.name);
        System.out.println(book.price);

        book.read();
        // 自定义设置对象的属性值
        book.name = "Java从入门到入土";
        book.price = 23.1;
        System.out.println(book.name);
        System.out.println(book.price);
    }
}
