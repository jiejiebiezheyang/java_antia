package cn.ltpcloud.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/02/17:10
 * @Description:
 */
/*
 * */

@Target({ElementType.TYPE, ElementType.METHOD}) // 用来描述注解作用的地方
@Retention(RetentionPolicy.RUNTIME) // 描述注解可被保留的阶段
@interface MyAnno {
    /*
     * 定义属性列表
     * 本质上就是抽象方法
     * 属性名：抽象方法名 属性值：抽象方法的返回值（抽象方法的具体实现）
     * 返回值类型：基本数据类型、String、枚举、注解、以上类型的数组
     * */
    int age() default 18;

    String name();

    MyMath mm();

    Anno ao();

    double[] score();

}

/*
 * 1）如果定义属性时，使用default关键字给属性默认初始化值，则使用注解时，可以不进行属性的赋值。
 * 2）如果只一个属性需要赋值，并且属性的名称是value，则value可以省略，直接定义值即可。
 * 3）数组赋值时，值使用{}包裹。如果数组中只一个值，则{}可以省略
 * */

// 使用注解（本质上创建接口的实现了对象）
@MyAnno(age = 11, name = "zs", mm = MyMath.EQ, ao = @Anno(value = "hello"), score = {97, 98})
public class AnnotationDemo02 {
    @MyAnno(name = "zs", mm = MyMath.EQ, ao = @Anno("hello"), score = 97)
    public void fun() {

    }
}
