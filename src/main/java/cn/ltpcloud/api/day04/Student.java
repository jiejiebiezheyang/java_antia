package cn.ltpcloud.api.day04;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/19/9:44
 * @Description:
 */
public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    // 垃圾对象在回收前，会执行finalize()方法
    @Override
    protected void finalize() throws Throwable {
        System.out.println("over...");
        super.finalize();
    }
}

