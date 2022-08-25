package cn.ltpcloud.exception;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/15/16:47
 * @Description:
 */
/*
 * 自定义类
 * 继承RuntimeException
 * */
class IllegalScore extends RuntimeException {
    // 通过异常信息构建异常对象
    public IllegalScore(String message) {
        super(message);
    }
}

class Teacher {
    public void check(int score) {
        if(score>=0&&score<=100){
            System.out.println(score);
        }else {
            throw new IllegalScore("非法成绩");
        }
    }

}

public class ExceptionDemo04 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.check(1000);
    }
}
