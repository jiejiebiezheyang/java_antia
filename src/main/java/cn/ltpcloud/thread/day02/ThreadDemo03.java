package cn.ltpcloud.thread.day02;

import java.util.concurrent.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/31/15:01
 * @Description:
 */
/*
 * 多线程创建方式4：线程池
 *
 * */
public class ThreadDemo03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建一个定长的线程池
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        // 配置线程池
        threadPoolExecutor.setCorePoolSize(2);
        threadPoolExecutor.setMaximumPoolSize(2);
        threadPoolExecutor.setKeepAliveTime(10, TimeUnit.MINUTES);

        // 执行操作
        threadPoolExecutor.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行了1");
            }
        });

        System.out.println(threadPoolExecutor.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(Thread.currentThread().getName() + "执行了2");
                return "haha";
            }
        }).get());

        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行了3");
            }
        });


        // 关闭线程池
        // threadPoolExecutor.shutdown();
    }
 }
