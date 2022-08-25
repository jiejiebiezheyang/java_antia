package cn.ltpcloud.oop.day06;

import com.alibaba.druid.support.json.JSONUtils;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/12/11:09
 * @Description:
 */

/*
 * 设计公司类（Lenovo）,有一个接口类Works,里面有接口work()
 * 下面有2个部门（开发部和销售部）,使用内部类分别实现开发部和销售部的工作。
 * */
class Lenovo {


    class Development implements Works {

        @Override
        public void work() {
            System.out.println("开发");
        }
    }

    class Sales implements Works {
        @Override
        public void work() {
            System.out.println("销售");
        }
    }

    public void work(Object obj) {
        if (obj instanceof Development) {
            Development development = new Development();
            development.work();
        } else if (obj instanceof Sales) {
            Sales sales = new Sales();
            sales.work();
        }
    }
}

interface Works {
    void work();
}

public class Test02 {
    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo();
        lenovo.work(lenovo.new Development());
        lenovo.work(lenovo.new Sales());
    }
}
