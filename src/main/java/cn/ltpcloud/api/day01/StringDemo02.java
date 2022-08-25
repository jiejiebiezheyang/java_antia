package cn.ltpcloud.api.day01;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/16/14:17
 * @Description:
 */
public class StringDemo02 {
    // 判断功能
    @Test
    public void demo1() {
        String s1 = "hello";
        // 判断是否相等
        System.out.println(s1.equals("world")); // f
        // 忽略大小写判断
        System.out.println(s1.equalsIgnoreCase("Hello")); // t
        // 是否包含指定字符串
        System.out.println(s1.contains("ll")); // t
        System.out.println(s1.contains("llw")); // f
        // 判断是否以指定字符串开头
        System.out.println(s1.startsWith("he")); // t
        // 判断是否以指定位置的字符串开头
        System.out.println(s1.startsWith("he", 2)); // f
        // 判断是否以指定字符串结尾
        System.out.println(s1.endsWith("haha"));// f
        // 是否为空
        System.out.println(s1.isEmpty()); // f
    }

    // 获取功能
    @Test
    public void demo2() {
        String s = "HelloWorld";
        System.out.println("length=" + s.length()); // 10
        // 获取指定索引位置的元素
        System.out.println(s.charAt(0)); // 'H'
        System.out.println(s.charAt(s.length() - 1)); // 'd'
        // 获取第一次索引值(没有返回-1)
        System.out.println(s.indexOf('l')); //2
        System.out.println(s.indexOf('l', 5)); // 8
        //
        System.out.println(s.indexOf("lo")); // 3
        System.out.println(s.indexOf("lo", 5)); // -1
        // 获取最后一次索引值
        System.out.println(s.lastIndexOf('l')); // 8
        System.out.println(s.lastIndexOf('l', 5)); // 3
        /*
         * 截取（会产生一个新的字符串不会对原有字符串进行修改）
         * tips:String类中对字符串中的所有修改操作，都不会对原有字符串惊醒修改
         *      只会生成一个新的字符串
         * */
        System.out.println(s.substring(5)); // 从5索引一直截取到末尾 World
        System.out.println(s.substring(3, 6)); // 截取3到5索引范围内的元素，不包括6
    }

    // 转化功能
    @Test
    public void demo3() {
        String s = "abcde";
        // 转成字节数组
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));
        // 转成字符数组
        char[] chars = s.toCharArray();
        System.out.println(Arrays.toString(chars));
        // 其他类型转成String
        String s1 = String.valueOf(chars);
        System.out.println(s1);
        String s2 = String.valueOf(chars, 0, 3);
        System.out.println(s2);
        String s3 = String.valueOf(100);
        System.out.println(s3);

        // 转大小写
        System.out.println("Hello".toUpperCase());
        System.out.println("Hello".toLowerCase());

        // 连接
        System.out.println("Hello".concat("world"));
        // 去除两端空格
        System.out.println(" ad min ".trim());  // ad min
    }

    // 比较和替换功能
    @Test
    public void demo4() {
        String s = "bbadba";
        // 替换字符
        System.out.println(s.replace('a', '$'));
        // 替换字符串
        System.out.println(s.replace("ba", "100"));

        // 字典比较
        String str1 = "dbc";
        String str2 = "ddc";
        String str3 = "dbcdb";
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
    }
}
