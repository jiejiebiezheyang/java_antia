package cn.ltpcloud.oop.day05;

import cn.ltpcloud.oop.day05.modify.Fu;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/11/15:17
 * @Description:
 */
public class Son extends Fu {
    void show(){
        // 不同包的子类访问父类，只能访问protected和public
        // System.out.println(n1);
        // System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
    }
}
