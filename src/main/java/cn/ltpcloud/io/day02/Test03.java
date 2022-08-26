package cn.ltpcloud.io.day02;


import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/26/14:13
 * @Description:
 */
public class Test03 {
    public static void main(String[] args) throws Exception {
        File srcFolder = new File("C:\\Users\\0816\\Desktop\\demo");
        File destFolder = new File("C:\\Users\\0816\\Desktop\\1");
        copyFolder(srcFolder,destFolder);
    }

    //复制目录
    private static void copyFolder(File srcFolder, File destFolder) throws Exception {
        //判断目的端目录是否存在
        if(!destFolder.exists()){
            destFolder.mkdir();
        }
        //获取源端目录下所有的文件和文件夹
        File[] files = srcFolder.listFiles();
        for (File srcFile : files) {
            //文件/目录名
            String fileName = srcFile.getName();
            //创建目的端文件/目录
            File destFile = new File(destFolder,fileName);
            if(srcFile.isFile()){
                copyFile(srcFile,destFile); //复制文件
            }else{
                copyFolder(srcFile,destFile); //复制目录
            }
        }
    }

    //复制文件
    private static void copyFile(File src, File dest) throws Exception{
        //创建缓冲流
        BufferedInputStream bis =
                new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos =
                new BufferedOutputStream(new FileOutputStream(dest));
        //读写
        byte[] buf = new byte[1024];
        int len = 0;
        while((len=bis.read(buf))!=-1){
            bos.write(buf,0,len);
            bos.flush();
        }
        //释放资源
        bos.close();
        bis.close();
    }
}

