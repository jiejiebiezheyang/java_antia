package com.xuemasi.basic.day002;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/01/11:57
 * @Description: Scanner
 */
public class ScannerDemo {
    //scanner:简单文本扫描器
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个整数，并Enter确认");
        if (sc.hasNextInt()){
            // 获取控制台录入的下一个int数据
            int a = sc.nextInt();
            System.out.println(a);
        }else {
            System.out.println("你眼瞎啊！");
        }
    }
}
