package cn.ltpcloud.api.day03;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/18/10:12
 * @Description:
 */
public class CharacterDemo {
    public static void main(String[] args) {
        Character ch = 'a';
        System.out.println("是否小写" + Character.isLowerCase('a'));
        System.out.println("是否大写" + Character.isUpperCase('a'));
        System.out.println("是否数字" + Character.isDigit('1'));
        System.out.println("是否字母" + Character.isLetter('a'));// 传统字母
        System.out.println("转大写" + Character.toUpperCase('a'));
        System.out.println("转小写" + Character.toLowerCase('A'));
    }
}
