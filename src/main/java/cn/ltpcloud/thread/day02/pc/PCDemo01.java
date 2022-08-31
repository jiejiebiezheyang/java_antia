package cn.ltpcloud.thread.day02.pc;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/31/10:13
 * @Description:
 */
/*
 * 资源：list集合
 * 创建2个线程，一个线程不停的向集合中存储数，另一个不停的删除集合中的数据
 * 存在线程安全问题
 * */
// 生产者
class Producer extends Thread {
    static List<Integer> list = new ArrayList<>();
    static int i = 0;

    public Producer(@NotNull String name) {
        super(name);
    }

    @Override
    public void run() {
        // 不停的在生产数据
        while (true) {
            System.out.println(getName() + "生产的数据为" + i);
            list.add(i++);
            System.out.println(getName() + "生产后list为=" + list);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

// 消费者
class Consumer extends Thread {
    public Consumer(@NotNull String name) {
        super(name);
    }

    @Override
    public void run() {
        // 不停的消费
        while (true) {
            // 有数据才消费
            if (Producer.list.size() > 0) {
                System.out.println(getName() + "消费前，list=" + Producer.list);
                System.out.println(getName() + "消费的数据为=" + Producer.list.get(0));
                Producer.list.remove(0);
                System.out.println(getName() + "消费后，list=" + Producer.list);
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class PCDemo01 {
    public static void main(String[] args) {
        Thread p = new Producer("生产1号");
        Thread p2 = new Producer("生产2号");
        Thread c = new Consumer("消费1号");
        Thread c2 = new Consumer("消费2号");

        p.start();
        p2.start();
        c.start();
        c2.start();
    }
}
