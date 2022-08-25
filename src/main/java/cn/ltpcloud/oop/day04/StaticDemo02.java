package cn.ltpcloud.oop.day04;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/10/14:34
 * @Description:
 */
/*
 *
 * */
class Student {
    String name;
    int age;
    static String grade;

    public Student() {

    }

    public Student(String name, int age, String grade) {
        this(name, age);
        this.grade = grade;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{name=" + name + ",age=" + age + ",grade=" + grade + "}";
    }
}

public class StaticDemo02 {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 11, "五年级");
        Student s2 = new Student("李四", 12);
        Student s3 = new Student("王二", 10);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        s2.setGrade("六年级");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
