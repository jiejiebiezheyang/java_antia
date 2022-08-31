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
 * 最终版
 * */
// 资源类
class MyList4 {
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

class ProducerTarget implements Runnable {
    private MyList4 myList;

    public ProducerTarget(MyList4 myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        while (true) {
            myList.addSource();
        }
    }
}

class ConsumerTarget extends Thread {
    private MyList4 myList;

    public ConsumerTarget(MyList4 myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        while (true) {
            myList.delSource();
        }
    }
}

public class PCDemo05 {
    public static void main(String[] args) {
        // 资源
        MyList4 myList = new MyList4();

        // 生产者任务
        ProducerTarget pt = new ProducerTarget(myList);
        // 消费者任务
        ConsumerTarget ct = new ConsumerTarget(myList);

        // 生产者
        Thread p1 = new Thread(pt, "生产1号");
        Thread p2 = new Thread(pt, "生产2号");
        // 消费者
        Thread c1 = new Thread(ct, "消费1号");
        Thread c2 = new Thread(ct, "消费2号");

        p1.start();
        p2.start();
        c1.start();
        c2.start();
    }
}
