package com.xuemasi.collection.day03;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/24/17:17
 * @Description:
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2, 5, 4);

        // 反转
        Collections.reverse(list); // [4, 5, 2, 1, 3]

        // 随机置换
        Collections.shuffle(list);

        // 自然排序
        Collections.sort(list);

        // 比较器排序
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        Collections.sort(list, (a, b) -> b - a);

        // 交换元素
        Collections.swap(list, 0, list.size() - 1);

        // 二分法查找
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list, 3));

        // 获取集合最大值
        System.out.println(Collections.max(list)); // 5
        // "最大值"
        System.out.println(Collections.max(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        }));

        // 获取元素出现的次数
        List<Character> asList = Arrays.asList('a', 'b', 'a', 'a', 'c');
        System.out.println(Collections.frequency(list, 'a'));

        // 集合替换
        boolean b = Collections.replaceAll(asList, 'a', 'A'); // 全部进行替换
        System.out.println(b);
        System.out.println(asList);

        // 集合的复制(dest集合大小需要大于等于src集合大小)
        List<String> src = Arrays.asList("hello", "world", "javSE");
        List<String> dest = new ArrayList<>();
        dest.add("");
        dest.add("");
        dest.add(""); // 不能少
        Collections.copy(dest, src);
        System.out.println(dest);

        System.out.println(list);

    }
}
