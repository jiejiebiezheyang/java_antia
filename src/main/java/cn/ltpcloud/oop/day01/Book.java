package cn.ltpcloud.oop.day01;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/05/9:42
 * @Description: 成员变量和成员方法属于对象，只有对象存在，成员变量和成员方法才会存在
 *
 */
public class Book {
    // 成员变量
    String name;
    double price;
    // 成员方法(行为)
    public void read(){
        System.out.println("读");
    }
}
