package cn.ltpcloud.oop.day06;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/12/14:12
 * @Description:
 */
// 查看不同人吃什么东西
interface Person{
    void eat();
}
class PersonTool{
    public static void show(Person p){
        p.eat();
    }
}
public class InnerDemo06 {
    public static void main(String[] args) {
        PersonTool.show(new Person() {
            @Override
            public void eat() {
                System.out.println("吃米饭");
            }
        });
    }
}
