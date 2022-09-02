package cn.ltpcloud.annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/02/17:01
 * @Description:
 */
/*
 *@Override	：检测被该注解标注的方法是否是继承自父类(接口)的
 *	@Deprecated：该注解标注的内容，表示已过时
 *	@SuppressWarnings：压制警告
 *		一般传递参数all  @SuppressWarnings("all")
 * */

@SuppressWarnings("all")
class Foo {
    // 表示方法已过时
    @Deprecated
    public void stop() {

    }

    public void interrupt() {

    }
}

@SuppressWarnings("all")
public class AnnotationDemo01 {
    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.stop();
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
    }

    void fun() {
        Foo foo = new Foo();
        foo.stop();
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
    }
}
