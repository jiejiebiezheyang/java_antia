package com.xuemasi.basic.day002;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/01/11:24
 * @Description: 逻辑运算符
 */
public class Demo003 {
    public static void main(String[] args) {

        // &与
        System.out.println(10 > 5 & 10 == 10);
        System.out.println(10 < 5 & 10 == 10);

        // |或
        System.out.println(10 > 5 | 10 > 10);
        System.out.println(10 < 5 | 10 > 10);

        //&&双与（如果前面条件不成立，后面的操作不会执行）
        System.out.println(10 > 5 && 10 == 10);
        System.out.println(10 < 5 && 10 == 10);

        // ||双或（如果前面条件成立，后面的操作不会执行）
        System.out.println(10 > 5 || 10 > 10);
        System.out.println(10 < 5 || 10 > 10);

        // !非
        System.out.println(!true);
        System.out.println(!(10!=10)); // true

        // 异或（相同为false，相异为true）
        System.out.println(true^true);  // false
        System.out.println(true^false); // true
        System.out.println(false^true); // true
        System.out.println(false^false); // false

    }
}
