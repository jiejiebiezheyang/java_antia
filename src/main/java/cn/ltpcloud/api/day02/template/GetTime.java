package cn.ltpcloud.api.day02.template;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/17/15:26
 * @Description:
 */

/*
 * 在软件开发中实现一个算法时，整体步骤很固定、通用，这些步骤已经在父类中写好了。但是某些部分易变，易变
 * 部分可以抽象出来，供不同子类实现。这就是一种模板模式。
 * */
public abstract class GetTime {
    // 查看操作的运行时间
    public void getTime() {
        long t1 = System.currentTimeMillis();
        String s = "hello";
        code();
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
    }

    public abstract void code();

}
