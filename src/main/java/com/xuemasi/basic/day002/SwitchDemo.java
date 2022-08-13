package com.xuemasi.basic.day002;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/01/16:53
 * @Description: Switch
 */
public class SwitchDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        switch (a/b){
            case 1:
                System.out.println("A");
                break;
            /*
            * break可以省略,这时候switch不能结束,需要继续往下执行
            * （一直往下执行知道遇到break或执行到程序的末尾）,这种
            * 现象成为"case穿透".
            * */
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
                break;
        }
    }
}
