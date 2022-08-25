package cn.ltpcloud.basic.day004;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/03/10:14
 * @Description:
 */
public class Test03 {
    public static void main(String[] args) {
        for (int i = 100; i <= 200; i++) {
            //判断当前i是否为质数（是否能被除了1和本身之外的其它数整数）
            //1)假设当前i是质数
            boolean flag = true;

            //2)找不满足的条件
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            //3)判断
            if (flag) {
                System.out.println(i);
            }
        }
    }
}
