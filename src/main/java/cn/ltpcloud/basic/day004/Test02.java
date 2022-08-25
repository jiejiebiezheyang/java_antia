package cn.ltpcloud.basic.day004;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/03/10:14
 * @Description:
 */
public class Test02 {
    /*
     * 山上一口缸可以装50升水，现在15升水。老和尚叫小和尚下山挑水，每次可以挑5升。
     * 问：小和尚要挑几次水才可以把水缸挑满？通过编程解决这个问题。
     * */
    public static void main(String[] args) {
        int count = 0;
        int sum = 15;

        while (sum < 50) {
            sum += 5;
            count++;
        }

        System.out.println(count);

    }
}
