package com.xuemasi.basic.day005;

import static com.xuemasi.basic.day005.ArrayDemo03.show;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/04/17:05
 * @Description:
 */
public class Test05 {
    /*
     * 打印输出杨辉三角形
     * 1
     * 1    1
     * 1    2    1
     * 1    3    3    1
     *
     * */
    public static void main(String[] args) {

        yh(13);

    }

    public static void yh(int lines) {
        int[][] arr = new int[lines][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 1;
                if (j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 1;
                    continue;
                }
                arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
            }
        }
        show(arr);
    }
}
