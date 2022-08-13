package com.xuemasi.oop.day05;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/11/11:49
 * @Description:
 */
interface Inter1 {
}

// 单继承
interface Inter2 extends Inter1 {
}

// 多继承
interface Inter3 extends Inter1, Inter2 {
}

// 多级继承
interface Inter4 extends Inter2 {
}

// 单实现
class Api1 implements Inter1 {
}

// 多实现
class Api2 implements Inter1, Inter2 {
}

public class InterfaceDemo02 {
}
