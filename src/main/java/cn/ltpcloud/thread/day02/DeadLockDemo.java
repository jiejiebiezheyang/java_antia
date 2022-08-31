package cn.ltpcloud.thread.day02;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/31/9:42
 * @Description:
 */
/*
 * 死锁:多个线程在争夺同步资源的过程中，发生的相互等待的现象
 * */
class LookPool {
    public static final Object OBJA = new Object();
    public static final Object OBJB = new Object();
}

class DeadLockThread extends Thread {
    boolean flag;

    public DeadLockThread(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (LookPool.OBJA) {
                System.out.println("lock is objA");
            }
            synchronized (LookPool.OBJB) {
                System.out.println("lock is objB");
            }
        } else {
            synchronized (LookPool.OBJB) {
                System.out.println("lock2 is objB");
            }
            synchronized (LookPool.OBJA) {
                System.out.println("lock2 is objA");
            }
        }
    }
}

public class DeadLockDemo {
    public static void main(String[] args) {
        DeadLockThread t1 = new DeadLockThread(true);
        DeadLockThread t2 = new DeadLockThread(false);

        t1.start();
        t2.start();
    }
}
