package cn.ltpcloud.io.day03;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/29/9:40
 * @Description:
 */
public class StreamDemo01 {
    public static void main(String[] args) throws Exception {
        // demo1();
        // demo2();
        // demo3();
        demo4();
    }

    // 改变标准的输入输出
    private static void demo4() throws Exception {
        // 改变标准输入流读的位置
        System.setIn(new FileInputStream("C:\\Users\\0816\\Desktop\\demo\\4.txt"));
        // 改变标准输出流的位置
        System.setOut(new PrintStream("C:\\Users\\0816\\Desktop\\demo\\4a.txt"));

        // 获取”标准“输入流
        InputStream is = System.in;
        PrintStream ps = System.out;

        // 读出
        byte[] buf = new byte[5];
        int len;
        while ((len = is.read(buf)) != -1) {
            ps.write(buf, 0, len);
        }
        ps.close();
        is.close();
    }

    // 封装标准输入输出流
    private static void demo3() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个数据");
        String s = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(s);
    }

    //标准输出流
    private static void demo2() {
        PrintStream ps = System.out;
        // 写出数据
        ps.write(97);
        ps.write('\n');
        // 打印输出
        ps.print(97);
    }

    // 标准输入流
    private static void demo1() throws IOException {
        InputStream in = System.in; // 字节流
        System.out.println("请输入一个字节");
        int by = in.read();
        System.out.println((char) by);
        System.out.println("请输入一个字节数组");
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        System.out.println(new String(buf, 0, len));
    }
}
