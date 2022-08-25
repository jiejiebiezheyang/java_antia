package cn.ltpcloud.basic.day003;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/02/11:34
 * @Description: 死循环
 */
public class LoopDemo004 {
    /*
     * 死循环：没有限制，循环操作会一直执行
     *
     * */
    public static void main(String[] args) {
        // while
        /*while (true) {
            System.out.println("Hello World");
        }*/

        //for
        /*for (;;) { // 没有定义条件，默认为true
            System.out.println("hello");
        }*/
        /*for (int i = 0; true ; i++) {

        }*/

        // 伪死循环：当i = Intger.MAX_VALUE的在执行i++，i = Intger.MIN_VALUE
        // 条件不满足,循环结束
        for (int i = 0; i >= 0; i++) {
            System.out.println(i);
        }

    }
}
