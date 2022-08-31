package cn.ltpcloud.thread.day02;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/31/9:43
 * @Description:
 */
/*
 * 使用匿名内部类创建Thread对象
 * */
public class ThreadDemo01 {
    public static void main(String[] args) {
        // 创建Thread子类对象
        new Thread() {
            @Override
            public void run() {
                System.out.println("线程1操作");
            }
        }.start();
        //通过提供的Runnable创建Thread对象
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程2操作");
            }
        }).start();
    }
}
