package com.xuemasi.basic.day005;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/04/14:18
 * @Description:
 */
public class Test04 {
    /*
     * 练习：
     * 1、从键盘输入本组学员的成绩，放到数组中
     * 2、用for循环显示所学员的成绩
     * 3、排序：从低到高
     * 4、查找是否正好60分的，如果返回位置
     * 5、复制成绩最低三名构成新数组
     * 6、用工具类打印成绩最低三名成绩
     **/
    public static void main(String[] args) {
        int[] scores = getAllScores(5);
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);
        int index = Arrays.binarySearch(scores, 60);
        if(index>=0&&index<scores.length) {
            System.out.println("60分的位置为："+index);
        }else {
            System.out.println("没有60分的成绩");
        }
        int[] low_scores = Arrays.copyOf(scores, 3);
        System.out.println(Arrays.toString(low_scores));
    }

    private static int[] getAllScores(int length) {
        int[] scores = new int[length];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<scores.length;i++) {
            System.out.println("请输入第"+(i+1)+"学生的成绩");
            scores[i] = sc.nextInt();
        }
        return scores;
    }
}
