package cn.ltpcloud.io.day03;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/29/16:46
 * @Description:
 */
/*
 * properties
 * */
public class StreamDemo06 {
    // 特有方法
    @Test
    public void demo1() {
        Properties prop = new Properties();
        // 设置属性
        prop.setProperty("name", "zs");
        prop.setProperty("age", "11");
        prop.setProperty("tel", "18888888888");

        // 获取属性值
        System.out.println(prop.getProperty("name"));
        // 获取所有属性名
        Set<String> names = prop.stringPropertyNames();
        for (String name : names) {
            System.out.println(name + "----" + prop.getProperty(name));
        }

        Enumeration<?> enumeration = prop.propertyNames();
        while (enumeration.hasMoreElements()) {
            String name = (String) enumeration.nextElement();
            String value = prop.getProperty(name);
            System.out.println(name + "===" + value);
        }

        System.out.println(prop);
    }

    // 加载和存储方法
    @Test
    public void demo2() throws Exception {
        Properties prop = new Properties();
        // 加载配置文件数据
        prop.load(new FileInputStream("D:\\JavaProject\\java_antia\\src\\main\\java\\cn\\ltpcloud\\io\\day03\\student.properties"));
        // 获取属性
        String name = prop.getProperty("name");
        String age = prop.getProperty("age");
        String address = prop.getProperty("address");
        System.out.println(name + "=" + age + "=" + address);

        // 修改属性
        prop.setProperty("name", "李四");
        // 将属性集中的数据存储到文件中
        prop.store(new FileOutputStream("D:\\JavaProject\\java_antia\\src\\main\\java\\cn\\ltpcloud\\io\\day03\\student.properties"), "haha");
    }

    @Test
    public void demo3() throws Exception {
        Properties prop = new Properties();
        // 获取类加载器
        ClassLoader classLoader = StreamDemo06.class.getClassLoader();
        // 获取资源的流
        // 注意：getResourceAsStream需要的资源必须放在类路径下
        // 当前src作为类路径
        InputStream is = classLoader.getResourceAsStream("student.properties");
        // 加载配置文件数据
        prop.load(is);
        System.out.println(prop);
    }
}
