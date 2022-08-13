package com.xuemasi.basic.day003;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/02/10:05
 * @Description: 循环练习
 */
public class Test02 {
    /*
     * 1）计算1~100中所有偶数的和
     * 2）计算5!= 5*4*3*2*1
     * 3）获取水仙花数
     *    水仙花数：是一个三位数，且个位立方+十位数立方+百位数立方=这个数
     * */
    public static void main(String[] args) {
        // 1）计算1~100中所有偶数的和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("和为：" + sum);
        sum = 0;
        for (int ii = 2; ii <= 100 ; ii+=2) {
            sum += ii;
        }
        System.out.println("====================");
        // 计算5!= 5*4*3*2*1
        int prod = 1;
        for (int j = 1; j <= 5; j++) {
            prod *= j;
        }
        System.out.println("为：" + prod);
        System.out.println("====================");
        // 所有水仙花数
        for (int k = 100; k < 1000; k++) {
            int bai = (int) Math.pow(k / 100, 3);
            int shi = (int) Math.pow((k / 10) % 10, 3);
            int ge = (int) Math.pow(k % 10, 3);
            if ((ge+shi+bai)==k) {
                System.out.println(k);
            }
        }
        System.out.println("====================");
    }
}
