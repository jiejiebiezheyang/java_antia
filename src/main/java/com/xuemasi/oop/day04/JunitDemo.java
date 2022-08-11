package com.xuemasi.oop.day04;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/10/10:14
 * @Description:
 */
public class JunitDemo {
    @Before //
    public void init(){
        System.out.println("初始化资源，每次执行@Test方法之前都会先执行@Before");
    }

    @After
    public void destroy(){
        System.out.println("释放资源，每次执行@Test方法之后都会先执行@After");
    }

    @Test
    public void demo1(){
        System.out.println("hello");
    }
}
