package com.xuemasi.oop.day02;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/08/10:05
 * @Description:
 */
public class ArgsDemo2 {
    public static void main(String[] args) {


        System.out.println(getSum(1,2,3,4));

    }


    // 2个int类型的和
    // public static int getSum(int[] in) {return 0;}

    // 下面的方法不构成重载
    // 可变参数本质上就是一个数组
    public static int getSum(int... nums) { // 所有int参数存储在nums数组中
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

}
