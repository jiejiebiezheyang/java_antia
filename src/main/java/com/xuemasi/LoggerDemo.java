package com.xuemasi;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/15/17:15
 * @Description:
 */
public class LoggerDemo {
    public static void main(String[] args) {
        // 获取日志对象
        Logger logger = LoggerFactory.getLogger(LoggerDemo.class);
        while (true) {
            // 记录日志
            logger.debug("debug");
            logger.info("info");
            logger.warn("warn");
            logger.error("error");
        }

    }
}
