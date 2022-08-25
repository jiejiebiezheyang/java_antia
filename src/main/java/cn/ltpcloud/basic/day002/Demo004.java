package cn.ltpcloud.basic.day002;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/01/11:44
 * @Description: 赋值运算符
 */
public class Demo004 {
    public static void main(String[] args) {
        // 将10赋值给一个int变量a
        int a = 10;

        a += 2; // a = a+2 = 12
        a -= 3; // 9
        a *= 4; // 36
        a /= 2; // 18
        a %= 3; // 0
        System.out.println(a);

        short s = 5;
        s+=2; // 复合赋值运算符隐含了类型转换
        System.out.println(s);
        s=5;
        s = (short) (s+2);
        System.out.println(s);
    }
}
