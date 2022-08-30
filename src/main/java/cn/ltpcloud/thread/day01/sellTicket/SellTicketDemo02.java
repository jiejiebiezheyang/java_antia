package cn.ltpcloud.thread.day01.sellTicket;

import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/30/16:41
 * @Description:
 */
/*
 * 模拟售票
 * 例子：有3个窗口共同售卖同一电影票，总票数为100张.使用实现Runnable接口的方式
 * 1.问题：卖票过程中，出现了重票、错票 -->出现了线程的安全问题
 * 2.问题出现的原因：当某个线程操作车票的过程中，尚未操作完成时，其他线程参与进来，也操作车票。
 * 3.如何解决：当一个线程a在操作ticket的时候，其他线程不能参与进来。直到线程a操作完ticket时，其他线程才可以开始操作ticket。这种情况即使线程a出现了阻塞，也不能被改变。
 * */

/*
 * 存在的问题有重复票
 * */
class Target2 extends Thread {
    static int count = 100;

    public Target2(@NotNull String name) {
        super(name);
    }

    // 锁对象
    // 锁对象一定要是唯一的
    static Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            int cou = 0;
            /*
             * 同步代码块
             * 同步内容：操作共享数据的代码
             * 原则：同步的代码越少，效率越高
             * */
            synchronized (lock) {
                if (count == 0) {
                    return;
                }
                cou = (100 - count--) + 1;// 对共享数据进行操作
            }
            System.out.println(getName() + "卖出第" + cou + "张电影票");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);

            }
        }


    }
}

public class SellTicketDemo02 {
    public static void main(String[] args) {
        Thread t1 = new Target2("售票口1");
        Thread t2 = new Target2("售票口2");
        Thread t3 = new Target2("售票口3");

        t1.start();
        t2.start();
        t3.start();

    }
}
