package cn.ltpcloud.collection.day02;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/22/12:05
 * @Description:
 */
public class ListIteratorDemo {
    @Test
    public void demo1() {
        // 需求：判断List集合中是否包含"hello",如果存在就在集合中添加"JavaSE"
        List<String> list = new ArrayList<>();
        list.add("world");
        list.add("hello");
        list.add("java");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            // ConcurrentModificationException(并发修改异常)
            if (iterator.next() == "hello") {
                list.add("JavaSE");
            }
        }
    }

    @Test
    public void demo2() {
        // 需求：判断List集合中是否包含"hello",如果存在就在集合中添加"JavaSE"
        List<String> list = new ArrayList<>();
        list.add("world");
        list.add("hello");
        list.add("java");

        // 获取列表迭代器
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next() == "hello") {
                // 在迭代期间，让迭代器添加集合元素
                listIterator.add("JavaSE");
            }
        }
        System.out.println(list);
    }

    @Test
    public void demo3() {
        // 需求：判断List集合中是否包含"hello",如果存在就在集合中添加"JavaSE"
        List<String> list = new ArrayList<>();
        list.add("world");
        list.add("hello");
        list.add("java");

        // 获取列表迭代器
        ListIterator<String> listIterator = list.listIterator();

        // 想要进行逆向遍历必须先正向遍历
        // 正向遍历
        while (listIterator.hasNext()) { // 判断是否有下一个元素
            listIterator.next(); // 获取下一个元素
        }
        // 逆向遍历
        while (listIterator.hasPrevious()) { // 判断是否有上一个元素
            System.out.println(listIterator.previous()); // 获取上一个元素
        }
        System.out.println(list);
    }
}
