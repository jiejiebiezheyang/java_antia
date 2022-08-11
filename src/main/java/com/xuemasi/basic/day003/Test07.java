package com.xuemasi.basic.day003;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/02/11:50
 * @Description: 3000米长的绳子，每天减一半。问多少天这个绳子会小于5米？不考虑小数。
 */
public class Test07 {
    public static void main(String[] args) {
        int a = 3000;
        for (int i = 1; i > 0; i++) {
            a /= 2;
            if (a < 5) {
                System.out.println("需要" + i + "天");
                break;
            }
        }
    }

}
