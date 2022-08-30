package cn.ltpcloud.thread.day01.sellTicket;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/30/14:52
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
class Target implements Runnable {
    static int count = 0; // 已经卖的电影票

    @Override
    public void run() {
        while (count < 100) {
            count++; // 对共享数据进行操作
            System.out.println(Thread.currentThread().getName() + "卖出第" + count + "张电影票");
        }
    }
}

public class SellTicketDemo01 {
    public static void main(String[] args) {
        Target target = new Target();

        Thread t1 = new Thread(target, "售票口1");
        Thread t2 = new Thread(target, "售票口2");
        Thread t3 = new Thread(target, "售票口3");

        t1.start();
        t2.start();
        t3.start();

    }
}
