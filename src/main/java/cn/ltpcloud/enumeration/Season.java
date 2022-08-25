package cn.ltpcloud.enumeration;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/25/11:37
 * @Description:
 */
/*
 * 手动实现枚举类
 * */
public class Season {
    // 对象固定（属性不能变）
    // 3) final 属性
    private final String NAME; // 季节名称
    private final String DESC; // 描述

    // 对象个数有限(构造器私有)
    private Season(String NAME, String DESC) {
        this.NAME = NAME;
        this.DESC = DESC;
    }

    // 对象固定（引用不能变）
    // 2) 当前类提供需要的所有对象
    public static final Season SPRING = new Season("春天", "春暖花开");
    public static final Season SUMMER = new Season("夏天", "夏日炎炎");
    public static final Season AUTUMN = new Season("秋天", "秋风瑟瑟");
    public static final Season WINTER = new Season("冬天", "银装素裹");

    @Override
    public String toString() {
        return "Season{" +
                "NAME='" + NAME + '\'' +
                ", DESC='" + DESC + '\'' +
                '}';
    }
}
