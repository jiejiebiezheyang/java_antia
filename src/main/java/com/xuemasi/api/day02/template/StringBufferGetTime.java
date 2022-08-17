package com.xuemasi.api.day02.template;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/17/15:32
 * @Description:
 */
public class StringBufferGetTime extends GetTime {

    @Override
    public void code() {
        StringBuffer s = new StringBuffer("hello");
        for (int i = 0; i < 10000000; i++) {
            s.append("world");
        }
    }
}
