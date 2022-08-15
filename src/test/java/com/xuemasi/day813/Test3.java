package java.com.xuemasi.day813;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/13/14:59
 * @Description:
 */

/*
 * 构造方法的重载
 * 定义一个名为Vehicles 交通工具 的基类
 *      该类中应包含String类型的成员属性brand 商标 和color 颜色 还应包含成员方法run 行驶 在控制台显示“我已经开动了”
 *      和showInfo 显示信息 在控制台显示商标和颜色 并编构造方法初始化其成员属性。
 * 编写Car 小汽车 类继承于Vehicles类 增加int型成员属性seats 座位 还应增加成员方法showCar 在控制台显示小汽车的信息 并编写构造方法
 * 编写Truck 卡车 类继承于Vehicles类 增加float型成员属性load 载重 还应增加成员方法showTruck 在控制台显示卡车的信息 并编写构造方法
 * 在main方法中测试以上各类。
 * */
class Vehicles {
    String brand;
    String color;

    public Vehicles(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void run() {
        System.out.println("我已经开动了");
    }

    public void showInfo() {
        System.out.println("车辆{" + "品牌=" + brand + ", 颜色=" + color + "}");
    }
}


class Car2 extends Vehicles {
    int seat;

    public Car2(String brand, String color, int seat) {
        super(brand, color);
        this.seat = seat;
    }

    public void showCar() {
        System.out.println("小汽车{" + "座位=" + seat + ", 品牌=" + brand + ", 颜色=" + color + "}");
    }
}


class Truck extends Vehicles {
    float load;

    public Truck(String brand, String color, float load) {
        super(brand, color);
        this.load = load;
    }

    public void showTruck() {
        System.out.println("卡车{" + "载重=" + load + ", 品牌=" + brand + ", 颜色=" + color + "}");
    }
}

public class Test3 {
    public static void main(String[] args) {
        Car2 car = new Car2("奔驰", "红", 5);
        car.run();
        car.showInfo();
        car.showCar();

        System.out.println();

        Truck truck = new Truck("三一", "白", 25f);
        truck.run();
        truck.showInfo();
        truck.showTruck();
    }
}
