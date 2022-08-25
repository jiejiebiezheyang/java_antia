package cn.ltpcloud.collection.day03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/25/9:51
 * @Description:
 */
/*
 * 统计字符串中每个字符出现的次数
 * 比如，现由一个字符串"abcdabddbacda" ,输出a{d},b{3},c{2},d{4}
 * */
public class Test03 {
    public static void main(String[] args) {
        String src = "abcdabuyivycvvvuyempshsoinsofiohgsrtoinhsiofhsirhonddbacda";
        getTimes(src);
    }

    private static void getTimes(String src) {
        Map<Character, Integer> nums = new HashMap<>();

        // 遍历字符串
        for (char aChar : src.toCharArray()) {
            if (nums == null || nums.size() == 0) {
                nums.put(aChar, 1);
            } else {
                if (nums.containsKey(aChar)) {
                    nums.put(aChar, nums.get(aChar) + 1);
                } else {
                    nums.put(aChar, 1);
                }
            }
        }
        // 遍历nums
        Set<Character> numsKeys = nums.keySet();
        int i = 0;
        for (Character key : numsKeys) {
            i++;
            System.out.print(key + "{" + nums.get(key) + (i == nums.size() ? "}" : "},"));
        }
    }
}
