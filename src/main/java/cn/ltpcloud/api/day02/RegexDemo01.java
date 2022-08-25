package cn.ltpcloud.api.day02;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/17/11:37
 * @Description:
 */
public class RegexDemo01 {
    /*
     * 校验qq
     * 长度5-10
     * 都是数字
     * 不能以0开头
     * */
    public static void main(String[] args) {
        String qq = "1964234252";
        System.out.println(checkQQ(qq));
        System.out.println(checkQQ2(qq));
    }

    public static boolean checkQQ2(String qq) {
        String regex = "[1-9]\\d{4,9}";
        return qq.matches(regex);
    }

    public static boolean checkQQ(String qq) {
        char[] c = qq.toCharArray();
        if (c[0] == '0') {
            System.out.println("开头不能为零");
            return false;
        }
        for (int temp : c) {
            if (temp < '0' || temp > '9') {
                System.out.println("必须都为数字");
                return false;
            }
        }
        if (qq.length() < 5 || qq.length() > 10) {
            System.out.println("长度在5~10");
            return false;
        }
        return true;
    }
}
