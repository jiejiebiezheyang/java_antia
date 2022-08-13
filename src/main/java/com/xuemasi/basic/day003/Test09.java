package com.xuemasi.basic.day003;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/02/14:00
 * @Description: 找出1000以内的所完数
 */
public class Test09 {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            int a = 0;
            for (int j = 1; j < i; j++) {
                if(i%j==0){
                    a += j;
                }
            }
            if (a == i){
                System.out.println("="+i);
            }
        }
    }
}
