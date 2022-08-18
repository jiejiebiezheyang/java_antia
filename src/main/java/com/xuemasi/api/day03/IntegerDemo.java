package com.xuemasi.api.day03;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/18/9:47
 * @Description:
 */
public class IntegerDemo {
    public static void main(String[] args) {
        // 自动装箱：将基本类型， 自动转成对应的包装类类型
        Integer it1 = 10; // Integer it = Integer.valueOf(10);

        // 自动拆箱：将包装类类型，自动转成对应的基本类型
        // 下面的代码先自动拆箱（it1转成int），然后+20，最后自动装箱
        Integer it2 = it1 + 20; // Integer it2 = Integer.valueOf(it1.intValue()+20);
        System.out.println(it1);
        System.out.println(it2);
    }
}
