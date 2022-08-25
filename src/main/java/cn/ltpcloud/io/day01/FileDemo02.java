package cn.ltpcloud.io.day01;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Instant;
import java.time.ZoneId;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/25/14:45
 * @Description:
 */
public class FileDemo02 {
    // 常见方法
    @Test
    public void demo1() throws IOException {
        File folder = new File("demo");
        // 创建单级目录
        folder.mkdir();
        File folders = new File("test/java");
        // 创建多级目录
        folders.mkdirs();
        // 创建文件
        File file = new File("demo/1.txt");
        file.createNewFile();

        // 删除文件
        file.delete();
        // 删除空目录
        folder.delete();
        // 删除非空目录(不能删除)
        File folder2 = new File("test");
        folder2.delete();
    }

    // 判断和获取
    @Test
    public void demo2() throws IOException {
        File file = new File("file/1.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        System.out.println("是否文件:" + file.isFile());
        System.out.println("是否目录:" + file.isDirectory());

        System.out.println("是否可读:" + file.canRead());
        System.out.println("是否可写:" + file.canRead());
        System.out.println("是否隐藏:" + file.isHidden());

        // 获取
        System.out.println("绝对路径:" + file.getAbsolutePath());
        System.out.println("构造路径:" + file.getPath());
        System.out.println("父目录的String:" + file.getParent());
        System.out.println("父目录的File:" + file.getParentFile());
        System.out.println("文件名:" + file.getName());
        System.out.println("字节数:" + file.length());
        // 最后一次修改时间毫秒值
        long lastTime = file.lastModified();
        Instant instant = Instant.ofEpochMilli(lastTime);
    }

    @Test
    public void demo3() {
        /*File src = new File("file/1.txt");
        File dest = new File("file/1c.txt");
        src.renameTo(dest);*/

        // 如果是同路径,只有重命名效果，如果是不同路径，效果为（重命名+剪切）
        File src = new File("test\\1.txt");
        File dest = new File("D:\\1c.txt");
        boolean b = src.renameTo(dest);
        System.out.println(b);
    }
}
