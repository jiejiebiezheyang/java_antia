package cn.ltpcloud.day813;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/13/14:42
 * @Description:
 */

/*
 * 抽象类、继承、接口综合 设计一个系统 XXX门的实现过程
 * 流程
 * 设计一张抽象的门Door 那么对于这张门来说 就应该拥有所有门的共性 开门openDoor()和关门closeDoor()
 * 然后对门进行另外的功能设计,防盗–theftProof()、防水–waterproof()、防弹–bulletproof()、防火、防锈……
 * 要求 利用继承、抽象类、接口的知识设计该门
 * */
abstract class Door {
    double height;
    double width;

    public Door(double height, double width) {
        this.height = height;
        this.width = width;
    }

    // 开门
    abstract void openDoor();

    // 关门
    abstract void closeDoor();
}

interface powerfulDoor {
    void theftProof();

    void waterproof();

    void bulletproof();

}

class Adoor extends Door implements powerfulDoor {

    public Adoor(double height, double width) {
        super(height, width);
    }

    @Override
    void openDoor() {
        System.out.println("开门");
    }

    @Override
    void closeDoor() {
        System.out.println("关门");
    }

    @Override
    public void theftProof() {
        System.out.println("防盗");
    }

    @Override
    public void waterproof() {
        System.out.println("防水");
    }

    @Override
    public void bulletproof() {
        System.out.println("防弹");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Adoor door = new Adoor(2, 1);
        door.openDoor();
        door.closeDoor();
        door.bulletproof();
        door.theftProof();
        door.waterproof();
    }
}
