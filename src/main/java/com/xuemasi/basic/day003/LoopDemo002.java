package com.xuemasi.basic.day003;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/02/11:13
 * @Description: 跳转关键字：break、continue
 */
public class LoopDemo002 {
    /*
     * break：结束单层循环
     * continue：结束当前循环操作，继续下一次循环
     * return：结束当前方法
     * */
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                // break;
                // continue; // 1 3 5 7 9 next
                return; // 1
            }
            System.out.println(i);
        }
        System.out.println("next");
    }

}
