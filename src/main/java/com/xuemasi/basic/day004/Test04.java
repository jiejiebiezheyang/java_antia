package com.xuemasi.basic.day004;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/03/10:14
 * @Description:
 */
public class Test04 {
    /*
     *
     *   Ean-13码规则：第十位数字是前十二位数字经过计算得到的校验码。
     *   例如：690123456789
     *   计算其校验码的过程为：
     *   ① 前十二位的奇数位和6+0+2+4+6+8=26
     *   ② 前十二位的偶数位和9+1+3+5+7+9=34
     *   ③ 将奇数和与偶数和的3倍相加26+34*3=128
     *   ④ 取结果的个位数：128的个位数为8
     *   ⑤ 用10减去这个个位数10-8=2
     *   所以校验码为2
     *   注：如果取结果的个位数为0，那么校验码不是为10（10-0=10，而是0
     *   实现上述代码的功能，计算验证码，输入12位条码，返回带验证码的条码。
     *   例：输入：692223361219输出：6922233612192    *
     * */
    public static void main(String[] args) {
        long n = 690123456789L;
        long num = n;
        //奇数位和 偶数位和
        int oddSum = 0;
        int evenSum = 0;

        //获取每位上的数
        int last = 0;
        int i = 0;//控制奇偶位
        while (n != 0) {
            last = (int) (n % 10);
            n /= 10;//n：当前循环的商，下次循环的被除数
            if (i % 2 == 0) {
                evenSum += last;
            } else {
                oddSum += last;
            }
            i++;
        }
        //奇数和与偶数和的3倍相加
        int sum = oddSum + 3 * evenSum;
        //取结果的个位数
        int ge = sum % 10;
        //用10减去这个个位数得到校验码（如果个位数是0，校验码也为0）
        int code = ge == 0 ? 0 : 10 - ge;
        long result = num * 10 + code;
        System.out.println(result);
    }
}
