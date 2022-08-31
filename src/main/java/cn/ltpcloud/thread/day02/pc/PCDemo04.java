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
 * 解决等待唤醒机制的死锁问题
 * 方式1
 * wait(time)
 * notifyAll() 唤醒所有
 * */
// 资源类
class MyList3 {
    List<Integer> list = new ArrayList<>();
    public static final int MAX_SIZE = 1;
    int n = 1;

    // 生产数据
    public synchronized void addSource() {
        // 判断集合是否装满了
        if (list.size() <= MAX_SIZE) {
            System.out.println(Thread.currentThread().getName() + "生产的数据为：" + n);
            list.add(n++);
            System.out.println(Thread.currentThread().getName() + "生产后的list=" + list);
            // 唤醒（期望唤醒消费者进行消费）
            this.notifyAll();
        } else {
            // 等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
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
            // 唤醒（期望唤醒生产者进行生产）
            this.notifyAll();
        } else {
            // 等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            Thread.sleep(50);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Producer4 extends Thread {
    private MyList3 myList;

    public Producer4(@NotNull String name, MyList3 myList) {
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

class Consumer4 extends Thread {
    private MyList3 myList;

    public Consumer4(@NotNull String name, MyList3 myList) {
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

public class PCDemo04 {
    public static void main(String[] args) {
        MyList3 myList = new MyList3();
        Thread p = new Producer4("生产1号", myList);
        Thread c = new Consumer4("消费1号", myList);
        Thread c2 = new Consumer4("消费2号", myList);
        Thread c3 = new Consumer4("消费3号", myList);

        p.start();
        c.start();
        c2.start();
        c3.start();
    }
}
