package com.xuemasi.exception;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/15/11:41
 * @Description:
 */
/*
 * Error:一般来说不需要进行处理
 * */
public class ErrorDemo {
    //
    @Test
    public void demo1() {
        // StackOverflowError(栈溢出错误)
        fun();
    }

    public void fun() {
        while (true) {
            fun();
        }
    }

    public static void main(String[] args) {
        String s = "hello";
        while (true) {
            // OutOfMemoryError(内存溢出错误，实际上是堆溢出)
            s += "worldWorldWorldWorldWorldWorldWorld";
            System.out.println(s);
        }
    }

    @Test
    public void demo02() {

    }

}
