package cn.ltpcloud.basic.day005;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/04/11:56
 * @Description:
 */
public class Test03 {
    /*
     * 任意一个人输入年龄，就可以判断出他是哪个年龄段的人？
     * 0-9   儿童
     * 10-19 少年
     * 20-29 青少年
     * 30-39 青年
     * 40-49 壮年
     * 50-59 中年
     * 60-69 中老年
     * 70-79 老年
     * 80-89 老老年
     * 90-99 老老老年
     */
    public static void main(String[] args) {
        String[] ageInfo = {"儿童", "少年", "青少年", "青年", "壮年","中年","中老年","老年","老老年","老老老年"};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄:");
        int age = sc.nextInt();
        System.out.println(ageInfo[age/10]);
    }
}
