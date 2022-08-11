package com.xuemasi.basic.day002;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/01/9:24
 * @Description: 算数运算符
 */

public class Demo001 {
    public static void main(String[] args) {
        /*
         *  /(整除)、%(取模)、++(自增+1)、--(自减-1)
         *
         * */
        int a = 5;
        int b = 2;
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println(5 % 2); // 取模如果涉及到负数，结果的符号和被除数有关，被除数为负数，结果为负
        System.out.println(-5 % 2); // -1
        System.out.println(5 % -2); // 1
        System.out.println(-5 % -2); //-1

        int x = 3510;
        x = x / 1000 * 3000;
        System.out.println(x); //3000

        // 如果被除数和除数中含有小数，这个时候/就是数学中的除法
        System.out.println(5.0 / 2); //2.5

        System.out.println(5 / 2.0); //2.5
        System.out.println(5.0 / 2.0); //2.5

        //如果数学中结果是一个无限小数，那么/最终的结果为double类型最大精度的小数值
        System.out.println(10.0 / 3); //3.3333333333333335

        // 开发中%的用处
        System.out.println(0 % 3); // 0
        System.out.println(1 % 3); // 1
        System.out.println(2 % 3); // 2
        System.out.println(3 % 3); // 0
        System.out.println(4 % 3); // 1
        System.out.println(5 % 3); // 2
        System.out.println(6 % 3); // 0
        System.out.println(7 % 3); // 1
        System.out.println(8 % 3); // 2
        System.out.println(9 % 3); // 0
        // ……

        System.out.println("------------------------------------------------");
        /*
         * ++可以定义在变量的前面，也可以在变量的后面
         * 1）如果单独使用，前后无所谓
         * 2）如果参与了其他操作
         *       放前：先执行++，后执行其他操作
         *       放后：先执行其他操作，在++
         * */
        int i = 10;
        ++i; // i = i + 1;
        i++;
        System.out.println("i=" + i);

        // 2
        // 放前
        int j = 10;
        int k = ++j + 2;
        System.out.println("j=" + j + ",k=" + k); // j=11,k=13


        // 放后
        j = 10;
        k = j++ + 2;
        System.out.println("j=" + j + ",k=" + k); // j=11,k=12

        //
        int m = 10;
        System.out.println(m++); // 10
        System.out.println(++m); // 12

        //
        int n = 10;
        // = 是最终操作,当执行=后,不能执行其他任意操作
        // 下面的代码,先执行 = ,后执行++。违背了上面的规定，所以只执行了=操作
        n = n++;
        System.out.println(n);

        n = 10;
        n = ++n;
        System.out.println(n);

        //
        int t = 5;
        int u = t++ + --t - t-- + t++ - --t - ++t + t-- - ++t;
        System.out.println(t);
        System.out.println(u);
    }
}
