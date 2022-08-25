package cn.ltpcloud.api.day02.template;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/17/15:36
 * @Description:
 */
public class GetTimeDemo {
    @Test
    public void test1(){
        GetTime gt = new StringGetTime();
        gt.getTime();
    }
    @Test
    public void test2(){
        GetTime gt = new StringBufferGetTime();
        gt.getTime();
    }
    @Test
    public void test3(){
        GetTime gt = new StringBuilderGetTime();
        gt.getTime();
    }
}
