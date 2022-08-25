package cn.ltpcloud.basic.day004;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/03/16:32
 * @Description: 数组反转
 */
public class Test08 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reArr2(arr);
        System.out.println(Arrays.toString(arr));
    }

    // 反转
    public static void reArr(int[] arr) {
        int temp;
        /*
         * i:前面需要交换的元素的下标
         * i=1  arr.length-1-i 后面需要交换的元素的下标
         * i=2  arr.length-1-2 后面需要交换的元素的下标
         * */
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void reArr2(int[] arr) {
        int temp;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
