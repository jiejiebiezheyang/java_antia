package com.xuemasi.basic.day001;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/07/29/14:25
 * @Description: 浮点型和布尔型
 */
public class Demo004 {
    public static void main(String[] args) {
        // 表示方式：
        // 十进制：比如10.23f，11.1
        float f = 3.1554949491961F; // 浮点型的常量，默认类型是：double;常量后面添加f/F，类型就变为float类型
        double d = 3.1554949491961;

        // 科学计数法：比如1.2E3，12e2
        double d2 = 1.2e3;// 1.2*10^3
        System.out.println(d2);

        // 一般使用double存储数据，精度比float要高
        System.out.println(f);
        System.out.println(d);

        // 使用浮点型存储数据，可能会发生精度损失
        float f1 = 3;
        float f2 = 2.9f;
        System.out.println(f1 - f2); // 0.099999905

        System.out.println("============================================================================================");

        // 布尔表示状态是否成立，值只能是true（真）或false（假）
        boolean b1 = true;
        b1 = false;
    }
}
