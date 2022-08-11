package com.xuemasi.basic.day003;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/02/11:45
 * @Description: 打印1-100之间13的倍数，使用for循环
 */
public class Test03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i%13==0){
                System.out.println(i);
            }
        }
    }
}
