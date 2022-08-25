package cn.ltpcloud.oop.day05;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/11/12:11
 * @Description:
 */

interface CompareA{
    default void method3(){
        System.out.println("CompareA method3");
    }
}
interface CompareB{
    default void method3(){
        System.out.println("CompareB method3");
    }
}

class Fu{
    public void method3(){
        System.out.println("Fu method3");
    }
}

class Zi extends Fu implements CompareA,CompareB{
    public void myMethod(){
        method3();//调用自己定义的重写的方法
        super.method3();//调用的是父类中声明的
        //调用接口中的默认方法
        CompareA.super.method3();
        CompareB.super.method3();
    }

    @Override
    public void method3() {
        System.out.println("Zi method");
    }
}

public class InterfaceDemo03 {

}
