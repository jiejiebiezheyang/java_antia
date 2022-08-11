package com.xuemasi.oop.day05;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/11/15:17
 * @Description:
 */
public class Son extends com.xuemasi.oop.day05.modify.Fu{
    void show(){
        // 不同包的子类访问父类，只能访问protected和public
        // System.out.println(n1);
        // System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
    }
}
