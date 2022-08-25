package cn.ltpcloud.collection.day03;

import java.util.HashSet;
import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/24/9:57
 * @Description:
 */
public class HashSetDemo02 {
    static class Student {
        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return age == student.age && name.equals(student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        /*
         * Set集合是如何保证元素的唯一性：
         * 通过分析add(),我们发现该方法依赖于新增对像的hashCode()和equals()方法
         * 通过这两个方法对新增元素和集合内的元素进行比较（判断是否相等）
         * 而默认使用的是Object里的hashCode()和equals()方法,不适应
         * 所以需要重写
         * */
        students.add(new Student("张三", 11));
        students.add(new Student("李四", 12));
        students.add(new Student("王五", 13));
        students.add(new Student("赵六", 14));
        students.add(new Student("唐七", 15));
        students.add(new Student("张三", 11));
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
