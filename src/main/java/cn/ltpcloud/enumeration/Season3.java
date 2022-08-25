package cn.ltpcloud.enumeration;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/25/14:10
 * @Description:
 */
public enum Season3 implements Inter {
    SPRING("春天", "春暖花开") {
        @Override
        public void show() {
            System.out.println("spring……");
        }
    },
    SUMMER("夏天", "夏日炎炎") {
        @Override
        public void show() {
            System.out.println("summer……");
        }
    },
    AUTUMN("秋天", "秋风瑟瑟") {
        @Override
        public void show() {
            System.out.println("autumn……");
        }
    },
    WINTER("冬天", "银装素裹") {
        @Override
        public void show() {
            System.out.println("winter……");
        }
    },
    ;
    private final String NAME; // 季节名称
    private final String DESC; // 描述

    private Season3(String NAME, String DESC) {
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

    @Override
    public void show() {
        System.out.println(this);
    }
}
