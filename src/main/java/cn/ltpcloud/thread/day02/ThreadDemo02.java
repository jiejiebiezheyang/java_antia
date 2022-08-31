package cn.ltpcloud.thread.day02;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/31/14:25
 * @Description:
 */
/*
 * 多线程实现方式3：实现Callable
 * */
class Target implements Callable<Integer> {
    @Override
    // 该方法定义了线程对象需要执行的操作
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }
}

public class ThreadDemo02 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 通过callable创建FutureTask（异步操作）
        FutureTask<Integer> task = new FutureTask<Integer>(new Target());
        // FutureTask创建Thread
        Thread thread = new Thread(task);

        thread.start();

        // 获取异步操作的结果值
        Integer integer = task.get();
        System.out.println(integer);
    }
}
