package cn.ltpcloud.thread.day01.sellTicket;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/30/17:21
 * @Description:
 */
class SellTarget implements Runnable {
    int count = 100;

    @Override
    public void run() {
        while (true) {
            int no = getNo(); // 获取票号
            if (no > 100) {
                return;
            }
            System.out.println(Thread.currentThread().getName() + "卖出第" + no + "张电影票");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized int getNo() {
        return (100 - count--) + 1;
    }
}

public class SellTicketDemo04 {
    public static void main(String[] args) {
        // 线程任务
        SellTarget target = new SellTarget();
        // 3个售票窗口
        Thread t1 = new Thread(target, "售票口1");
        Thread t2 = new Thread(target, "售票口2");
        Thread t3 = new Thread(target, "售票口3");

        t1.start();
        t2.start();
        t3.start();

    }
}