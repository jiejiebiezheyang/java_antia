package cn.ltpcloud.basic.day003;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/02/11:56
 * @Description: 打印1-100之间非13的倍数，使用continue语句
 */
public class Test04 {
    public static void main(String[] args) {
        for (int i = 1; i <=100 ; i++) {
            if (i%13==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
