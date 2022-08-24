package com.xuemasi.collection.day04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/24/19:08
 * @Description:
 */
/*
 * 使用Map接口的实现类完成员工工资(姓名--工资)的摸拟
 *
 * 1)添加几条信息
 * 2)列出所有的员工姓名
 * 3列出所有员工姓名及其工资
 * 4)删除名叫“Tom”的员工信息
 * 5)输出Jack的工资，并将其工资加1000元(通过取值实现)
 * 6)将所有工资低于1000元的员工的工资上涨20%(通过取值实现)
 * */
public class Test01 {
    public static void main(String[] args) {
        Map<String, Double> staffs = new HashMap<>();
        staffs.put("Tom", 2000.0);
        staffs.put("Jack", 5000.0);
        staffs.put("Lisa", 3500.0);
        staffs.put("David", 4000.0);
        staffs.put("Naci", 900.0);
        Set<Map.Entry<String, Double>> entries = staffs.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            System.out.println(entry);
        }
        staffs.remove("Tom");
        staffs.put("Jack", staffs.get("Jack") + 1000);
        System.out.println(staffs.get("Jack"));

        Set<Map.Entry<String, Double>> entries2 = staffs.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue() < 1000) {
                staffs.put(entry.getKey(), entry.getValue() + entry.getValue() * 0.2);
            }
        }
        System.out.println(staffs);
    }
}
