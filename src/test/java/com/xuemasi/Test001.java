package java.com.xuemasi;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/09/9:49
 * @Description:
 */
public class Test001 {
    public static void main(String[] args) {
        char[] a = {'s', 'y', 'j', 'd'};

        selectionSort(a);
        System.out.println(Arrays.toString(a));
        Bubble(a);
        System.out.println(Arrays.toString(a));
    }

    // 选择排序，由小到大
    public static void selectionSort(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // 冒泡排序，由大到小
    public static void Bubble(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j+1] > arr[j]) {
                    char temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
