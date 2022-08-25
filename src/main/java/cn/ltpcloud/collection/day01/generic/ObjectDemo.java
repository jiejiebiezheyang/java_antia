package cn.ltpcloud.collection.day01.generic;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/19/16:37
 * @Description:
 */
/*
 * 在泛型之前使用object表示所有的类型
 * 但是使用他会存在问题
 * */
class Foo {
    private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}

public class ObjectDemo {
    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.setObj("张三");
        System.out.println((String) foo.getObj());

        /*
         * 存在问题：
         * 在进行类型的向下转型时存在问题
         * */
        foo.setObj(11);
        System.out.println(foo.getObj());
    }
}