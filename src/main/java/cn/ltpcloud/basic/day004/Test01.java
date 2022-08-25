package cn.ltpcloud.basic.day004;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/03/9:38
 * @Description:
 */
public class Test01 {
    public static void main(String[] args) {
        double sum = 0;
        for (double i = 1; i > 0; i++) {
            sum += 1/i;
            System.out.println(sum);
            if (sum>10){
                System.out.println(i);
                break;
            }
        }

    }
}
