package cn.ltpcloud.basic.day004;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/03/14:54
 * @Description: 数组常见异常
 */
public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] arr = {8, 8, 6};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        // Index 3 out of bounds for length 3
        // ArrayIndexOutOfBoundsException（数组下标越界异常）
        // System.out.println(arr[3]);

        System.out.println(arr);
        // 表示空值,什么都不存在
        arr = null;
        System.out.println(arr); // null
        // NullPointerException（空指针异常）
        System.out.println(arr[0]);

    }
}
