package cn.ltpcloud.basic.day002;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/01/14:15
 * @Description:
 */
public class IfDemo001 {
    public static void main(String[] args) {
        // 格式一
        int age = 10;
        if (age >= 18) {
            System.out.println("可以上网吧");
        }
        System.out.println("----------------------------------------");

        // 格式二
        if (age >= 23) {
            System.out.println("晚婚");
        } else {
            System.out.println("早婚");
        }
        System.out.println("----------------------------------------");

        // 格式三
        // 方法1
        if (age >= 0 && age <= 3) {
            System.out.println("在家玩");
        } else if (age >= 4 && age <= 6) {
            System.out.println("上幼儿园");
        } else if (age >= 7 && age <= 22) {
            System.out.println("上学");
        } else if (age >= 23 && age <= 65) {
            System.out.println("上班");
        } else if (age >= 66 && age <= 120) {
            System.out.println("养老");
        } else {
            System.out.println("翘辫子了");
        }

        // 方法2:if语句可以嵌套
        // 判断年龄的合法性
        if (age < 0 || age > 120) {
            System.out.println("翘辫子了");
        } else {
            if (age <= 3) {
                System.out.println("在家玩");
            } else if (age <= 6) {
                System.out.println("上幼儿园");
            } else if (age <= 22) {
                System.out.println("上学");
            } else if (age <= 65) {
                System.out.println("上班");
            } else {
                System.out.println("养老");
            }
        }
    }
}