package cn.ltpcloud.basic.day005;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/04/9:41
 * @Description:
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        int[] arr = {2, 9, 24, 6, 3, 4, 7, 14,};

        int index = getIndex(arr, 6);
        System.out.println(index);

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index2 = binary(arr2, 5);
        System.out.println(index2);
    }

    // 二分查找
    // 数组不能有重复，且需要排序
    public static int binary(int[] arr, int n) {
        int min = 0;
        int max = arr.length - 1;
        int mid;
        do{
            mid = (min + max) / 2;
            if (n > arr[mid]) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
            // 如果不存在n，则max会小于min下标
            if (max<min){
                return -1;
            }
            // 重新计算中间下标
        }while(n != arr[mid]);
        return mid;
    }




    // 查找arr中value第一次出现的下标
    private static int getIndex(int[] arr, int i) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == i) {
                return j;
            }
        }
        return -1;
    }
}
