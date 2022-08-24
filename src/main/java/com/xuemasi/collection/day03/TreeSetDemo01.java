package com.xuemasi.collection.day03;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import java.util.Comparator;
import java.util.TreeSet;

import static java.lang.Integer.compare;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/24/11:40
 * @Description:
 */
class Cat implements Comparable<Cat> {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(@NotNull Cat cat) {
        if (this.age != cat.age) {
            return compare(this.age, cat.age);
        }
        return this.name.compareTo(cat.name);
    }
}

public class TreeSetDemo01 {
    @Test
    public void demo1() {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(6);
        ts.add(3);
        ts.add(1);
        ts.add(4);
        ts.add(2);
        for (Integer t : ts) {
            System.out.println(t);
        }
    }

    /*
     *创建1个TreeSet集合，里面放一些Cat对象
     * 比较规则:
     * 先按照年龄由小到大排序
     * 如果年龄相等，按姓名的字典顺序进行排序
     * */
    @Test
    public void demo2() {
        TreeSet<Cat> cats = new TreeSet<>();
        cats.add(new Cat("tom1", 2));
        cats.add(new Cat("tom2", 3));
        cats.add(new Cat("tom3", 1));
        cats.add(new Cat("tom4", 2));
        cats.add(new Cat("tom5", 4));
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    /*
     *创建1个TreeSet集合，里面放一些Cat对象
     * 比较规则:
     * 先按照年龄由大到小排序
     * 如果年龄相等，按姓名的字典顺序进行排序
     * */
    @Test
    public void demo3() {
        // 指定比较器创建TreeSet
        TreeSet<Cat> cats = new TreeSet<>(new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                if (o1.age != o2.age) {
                    return o2.age - o1.age;
                }
                return o1.name.compareTo(o2.name);
            }
        });
        cats.add(new Cat("tom1", 2));
        cats.add(new Cat("tom2", 3));
        cats.add(new Cat("tom3", 1));
        cats.add(new Cat("tom4", 2));
        cats.add(new Cat("tom5", 4));
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}
