package com.xuemasi.collection.day03;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/24/14:36
 * @Description:
 */
/*
 * 生成10个随机数，值在100到200之间；
 * 将这十个数存入HashSet集合中（有可能集合的长度小于10）。
 * 将这个HashSet集合转换成ArrayList集合
 * 重新为ArrayList集合排序，按照从小到大的顺序；
 * 使用foreach遍历集合；
 * */
public class Test01 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; hashSet.size() <= 10; i++) {
            hashSet.add(getNumber());
        }

        // 转ArrayList0
        ArrayList<Integer> list = new ArrayList<>(hashSet);
        // 排序
        Collections.sort(list);
        // 遍历
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    public static int getNumber() {
        Random rd = new Random();
        // 不包含101
        return rd.nextInt(101) + 100;
    }
}

