package cn.ltpcloud.thread.day02.pc;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/31/10:43
 * @Description:
 */
/*
 * 问题:效率底下
 * 当生产者生产数据后如果下次还是生产者抢到cpu的执行权
 * 这时候生产者没有执行任何操作
 * 当消费者消费数据后，如果下次还是消费者抢到cpu执行权
 * 这时候消费者没有执行任何操作
 * */
// 资源类
class MyList {
    List<Integer> list = new ArrayList<>();
    public static final int MAX_SIZE = 5;
    int n = 1;

    // 生产数据
    public synchronized void addSource() {
        // 判断集合是否装满了
        if (list.size() <= MAX_SIZE) {
            System.out.println(Thread.currentThread().getName() + "生产的数据为：" + n);
            list.add(n++);
            System.out.println(Thread.currentThread().getName() + "生产后的list=" + list);
        }
        try {
            Thread.sleep(50);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // 消费数据
    public synchronized void delSource() {
        // 判断是否有数据可以消费
        if (list.size() > 0) {
            System.out.println(Thread.currentThread().getName() + "消费前，list=" + list);
            Integer remove = list.remove(0);
            System.out.println("消费的数据为:" + remove);
            System.out.println(Thread.currentThread().getName() + "消费后，list=" + list);
        }
        try {
            Thread.sleep(50);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Producer2 extends Thread {
    private MyList myList;

    public Producer2(@NotNull String name, MyList myList) {
        super(name);
        this.myList = myList;
    }

    @Override
    public void run() {
        while (true) {
            myList.addSource();
        }
    }
}

class Consumer2 extends Thread {
    private MyList myList;

    public Consumer2(@NotNull String name, MyList myList) {
        super(name);
        this.myList = myList;
    }

    @Override
    public void run() {
        while (true) {
            myList.delSource();
        }
    }
}

public class PCDemo02 {
    public static void main(String[] args) {
        MyList myList = new MyList();
        Thread p = new Producer2("生产1号", myList);
        Thread c = new Consumer2("消费1号", myList);
        Thread c2 = new Consumer2("消费2号", myList);
        Thread c3 = new Consumer2("消费3号", myList);

        p.start();
        c.start();
        c2.start();
        c3.start();
    }
}
