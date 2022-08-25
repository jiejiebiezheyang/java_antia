package cn.ltpcloud.basic.day005;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/04/11:03
 * @Description:
 */
public class Test02 {
    /*
     * 创建一个char类型的36个元素的数组，前26个元素放置'A'-'Z',   后10个元素放置'0'-'9'。
     * 使用 for循环访问所元素并打印出来。
     * 提示：char类型数据运算 'A'+1 -> 'B'，'0'+1 -> '1'
     * */
    public static void main(String[] args) throws Exception {
        char[] c = createChar();

        System.out.println(Arrays.toString(c));
    }

    public static char[] createChar() {
        char[] arr = new char[36];
        char c = 'A';
        for (int i = 0; i < arr.length; i++) {
            if (i == 26) {
                c = '0';
            }
            arr[i] = c;
            c++;
        }
        return arr;
    }


}
