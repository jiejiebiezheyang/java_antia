package cn.ltpcloud.api.day01;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/16/9:45
 * @Description:
 */
public class ObjectDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("张三", 11);
        Student s2 = new Student("李四", 12);
        Student s3 = new Student("李四", 12);
        // getClass(): 获取当前类的运行时类（实际上是.class 文件）
        Class class1 = s1.getClass();
        Class class2 = s2.getClass();
        System.out.println(class1);
        System.out.println(class2);
        System.out.println(class1 == class2);

        /*
         * hashcode(): 对象的哈希码值，默认和地址值想换
         * 但是，一般我们用它来获取对象的特征值（包含所有属性信息）
         * 对于子类而言Object中的hashcode()方法，不适用，所以子类需要重写
         *
         * 用来粗略的判断两个对象是否相等
         * 1）两个对象相等，则这两个对象的hashcode值相等；
         *    反之两个对象不相等，两个对象的hashcode值不一定不等（由于算设计的问题，可能相等）
         * 2）2的对象的hashcode相等，不能判断这两个对象一定相等，
         *    2的对象的hashcode不相等，则这两个对象一定不相等，
         *
         * 总结：hashcode只能判断两个对象不相等
         * */
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        /*
         * equals(Object obj):比较对象是否相同,默认比较的是地址值
         * 对于子类而言Object中的equals(Object obj)方法，不适用，所以子类需要重写
         * */
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        /*
         * toString()
         * */
        System.out.println(s1.toString());
        /*
         * Object clone():返回一个对象的副本，需要注意，被克隆对象对应的类
         * 需要实现Cloneable接口，且该类需要重写clone()
         * */
        Student s4 = (Student) s1.clone();
        System.out.println(s4);
        System.out.println(s4 == s1);
    }
    /*
     * 1） 先通过hashcode进行粗略判断
     *     如果两个对象的hashcode不等，则这两个对象一定不等
     *     如果两个hashcode相等，这时候通过equals进行判断
     * 2） 如果两个对象的equals相等，则这两个对象一定相等
     *     如果两个对象的equals吧不相等，则这两个对象一定不相等
     * */
}