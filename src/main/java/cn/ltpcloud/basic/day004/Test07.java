package cn.ltpcloud.basic.day004;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/03/15:13
 * @Description:
 */
public class Test07 {
    /*
     * 针对数值型数组”
     * 最大值，最小值，总和，平均数
     * */
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        arrMin(arr);
        arrMax(arr);

        System.out.println("和为："+arrSum(arr));
        arrAvg(arr);

    }

    //最小值
    public static void arrMin(int[] arr) {
        int a = arr[0];
        for (int i = 1; i < arr.length; i++) {
            a = Math.min(a, arr[i]);
        }
        System.out.println("数组最小值为：" + a);
    }

    //最大值
    public static void arrMax(int[] arr) {
        int a = arr[0];
        for (int i = 1; i < arr.length; i++) {
            a = Math.max(a, arr[i]);
        }
        System.out.println("数组的最大值为：" + a);
    }

    //总和
    public static int arrSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //平均数
    public static void arrAvg(int[] arr) {
        System.out.println("平均值："+arrSum(arr)*1.0/arr.length);
        /*
        * int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;*/
    }
}
