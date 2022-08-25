package cn.ltpcloud.enumeration;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/25/11:56
 * @Description:
 */

/*
 * 使用enum定义枚举类
 * */
public enum Season2 {
    // enum定义的枚举对象一定要放在类里面的最前面，且enum对枚举对象定义做了简化
    SPRING("春天", "春暖花开"),
    SUMMER("夏天", "夏日炎炎"),
    AUTUMN("秋天", "秋风瑟瑟"),
    WINTER("冬天", "银装素裹"),
    ;
    private final String NAME; // 季节名称
    private final String DESC; // 描述

    private Season2(String NAME, String DESC) {
        this.NAME = NAME;
        this.DESC = DESC;
    }

    @Override
    public String toString() {
        return "Season{" +
                "NAME='" + NAME + '\'' +
                ", DESC='" + DESC + '\'' +
                '}';
    }
}
