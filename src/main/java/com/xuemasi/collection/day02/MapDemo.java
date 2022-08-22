package com.xuemasi.collection.day02;

import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/22/17:34
 * @Description:
 */
public class MapDemo {
    @Test
    public void demo1() {
        Map<String, Double> map = new HashMap<>();
        // 添加元素
        map.put("zs", 97.0);
        map.put("ls", 55.0);
        map.put("ww", 68.0);
        map.put("zl", 79.0);
        // key键不能重复，新的值对旧的值进行覆盖
        map.put("zs", 21.0);


        // 清空
        // map.clear();
        // 通过指定键删除对应的元素
        // map.remove("zs");

        // 是否为空
        System.out.println(map.isEmpty());
        // 是否包含指定键
        System.out.println(map.containsKey("zs"));
        // 是否包含指定的值
        System.out.println(map.containsValue(100.0));

        // 通过key获取value
        System.out.println(map.get("zs"));
        // 获取所有值的集合
        Collection<Double> values = map.values();

        // 遍历
        for (double maps : values) {
            System.out.println(maps);
        }
        // 获取元素个数
        System.out.println(map.size());

        System.out.println(map);

    }

    // 遍历方式一：entrySet()

    // 遍历方式二：keySet() get()
}
