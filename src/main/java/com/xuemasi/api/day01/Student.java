package com.xuemasi.api.day01;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/16/9:41
 * @Description:
 */
// 所有类直接或间接继承Object
// class Student extends Object{}
public class Student implements Cloneable{
    private String name;
    private int age;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        if (obj == null || this == null) {
            return false;
        }
        Student s = (Student) obj;
        return s.name.equals(this.name) && s.age == this.age;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ",age=" + age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
