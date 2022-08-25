package cn.ltpcloud.basic.day002;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/01/14:40
 * @Description: if语句
 */
public class IfDemo002 {
    /*
     * if语句中如果只有1个结构或1行时，这时候{}可以省略
     * */
    public static void main(String[] args) {
        // 1)
        if (10 < 5)
            System.out.println("10 < 5");
        else
            System.out.println("10 >= 5");


        // 2) 删除{}后，if语句格式可能会发生变化
        // 格式由编译器决定 （以内在的if为主，能够凑成if...else尽量凑成）
        int a = 3;
        if (a > 3)
            if (a < 5)
                System.out.println("A");
            else
                System.out.println("B");
    }
}

