package com.xuemasi.movieBuy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/22/14:14
 * @Description:
 */
public class MainApp {
    private static Scanner sc = new Scanner(System.in);
    private static Logger logger = LoggerFactory.getLogger(MainApp.class);
    /*    private static List<Customer> customers= new ArrayList<>();
        private static List<Business> businesses= new ArrayList<>();*/
    private static List<User> users = new ArrayList<>(); // 存储注册的用户和商户
    private static List<MovieTicket> movieTickets = new ArrayList<>(); // 电影票信息

    // 模拟注册数据
    static {
        users.add(new Customer("ls", "ls", "李四", 9999, "19642342521", '男'));
        users.add(new Business("zs", "zs", "张三", 123, "17602599352", '男', "昊然影城", "吴中区"));
    }

    public static void main(String[] args) {
        // 显示首页
        showMain();
    }

    // 首页
    private static void showMain() {
        while (true) {
            logger.info("访问昊然影院首页");
            System.out.println("===============昊然影院===============");
            System.out.println("1.登录");
            System.out.println("2.用户注册");
            System.out.println("3.商家注册");
            System.out.println("请选择");

            String input = sc.next();
            switch (input) {
                case "1":
                    login();
                    break;
                case "2":
                    userRegister();
                    break;
                case "3":
                    businessRegister();
                    break;
                default:
                    logger.warn("首页录入的命令非法!只能是1、2、3");
                    break;
            }
            System.out.println(users);
        }
    }

    // 登录界面
    private static void login() {
        // 判断是否存在用户
        if (users.size() == 0) {
            System.out.println("请先注册!");
        } else {
            while (true) {
                System.out.println("===============登录===============");
                System.out.println("请输入登录登录名称:");
                String name = sc.next();
                System.out.println("请输入登录登录密码:");
                String pwd = sc.next();
                // 判断用户名密码是否正确
                // 通过登录名查询用户
                User user = findUser(name);
                // 判断查询到的用户
                if (user == null) {
                    System.out.println("登录名称错误，请确认");
                } else {
                    // 判断密码
                    if (user.getLoginPassword().equals(pwd)) {
                        // 登录成功
                        logger.info(user.getRealName() + "登录了系统");
                        if (user instanceof Customer) {
                            // 展示客户登录成功的界面
                            customerMain(user);
                            break;
                        } else if (user instanceof Business) {
                            // 展示商家登录成功页面
                            businessMain(user);
                            break;
                        }
                    } else {
                        System.out.println("密码有误，请确认");
                    }
                }
            }
        }
    }

    // 商家登录成功界面
    private static void businessMain(User user) {
        System.out.println("===============昊然影院商家界面===============");
        System.out.println(user.getRealName() + (user.getGender() == '男' ? "先生" : "女士") + "欢迎您进入系统");
        businessMain:
        while (true) {
            System.out.println("1.展示详情");
            System.out.println("2.上架电影");
            System.out.println("3.下架电影");
            System.out.println("4.修改电影");
            System.out.println("5.退出");
            System.out.println("请输入你要操作的命令");
            switch (sc.next()) {
                case "1":
                    // 商家详情界面
                    System.out.println("===============商家详情界面===============");
                    logger.info(user.getRealName() + "商家，正在查看自己的详情~~~");
                    System.out.println(((Business) user).getShopName() + "\t电话：" + user.getTel() + "\t地址：" + ((Business) user).getShopAddress() + "\t余额：" + user.getBalance());
                    if (movieTickets.size() == 0) {
                        System.out.println("您的店铺当前无片在放映~~~");
                    } else {
                        System.out.println("片名\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数量\t\t放映时间");
                        for (int i = 0; i < movieTickets.size(); i++) {
                            System.out.println(movieTickets.get(i));
                        }
                    }
                    break;
                case "2":
                    // 上架电影
                    System.out.println("===============上架电影===============");
                    System.out.println("请您输入新片名：");
                    String movieName = sc.next();
                    System.out.println("请您输入主演：");
                    String starring = sc.next();
                    System.out.println("请您输入时长：");
                    String duration = sc.next();
                    System.out.println("请您输入票价：");
                    double price = sc.nextDouble();
                    System.out.println("请您输入票数：");
                    int count = sc.nextInt();
                    System.out.println("请您输入影片放映时间：");
                    String dateTime = sc.next();
                    MovieTicket movieTicket = new MovieTicket(movieName, starring, duration, price, count, dateTime);
                    movieTickets.add(movieTicket);
                    System.out.println("您已经成功上架了：《" + movieName + "》");
                    break;
                case "3":
                    // 下架电影
                    System.out.println("===============下架电影===============");
                    System.out.println("请您输入需要下架的电影名称:");
                    String mN = sc.next();
                    MovieTicket mT = findMovie(mN);
                    if (mT == null) {
                        System.out.println("您的店铺没有上架该影片！");
                    } else {
                        System.out.println("请问继续下架吗?y/n");
                        String isRemove = sc.next();
                        if (isRemove.equals("y")) {
                            for (int i = 0; i < movieTickets.size(); i++) {
                                if (movieTickets.get(i).getMovieName().equals(mN)) {
                                    movieTickets.remove(i);
                                    System.out.println("您当前店铺已成功下架影片:《" + mN + "》");
                                    break;
                                }
                            }
                        } else if (isRemove.equals("n") || isRemove.equals("N")) {
                            System.out.println("取消下架!");
                        } else {
                            System.out.println("输入有误");
                        }
                    }
                    break;
                case "4":
                case "5":
                    System.out.println(user.getRealName() + "下次再来啊");
                    break businessMain;
                default:
                    System.out.println("命令有误!只能1、2、3、4、5");
            }
        }
    }

    // 客户登录成功界面
    private static void customerMain(User user) {
        System.out.println("===============昊然影院客户界面===============");
        System.out.println(user.getRealName() + (user.getGender() == '男' ? "先生" : "女士"));
        customerMain:
        while (true) {
            System.out.println("请您选择要操作的功能");
            System.out.println("1.展示全部影片信息功能");
            System.out.println("2.根据电影名称查询电影信息");
            System.out.println("3.评分功能");
            System.out.println("3.购票功能");
            System.out.println("5.退出系统");
            switch (sc.next()) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break customerMain;
                default:
                    System.out.println("命令有误!只能是1、2、3、4、5");
                    break;
            }
        }
    }

    // 通过片名查询电影信息
    private static MovieTicket findMovie(String mN) {
        for (int i = 0; i < movieTickets.size(); i++) {
            if (movieTickets.get(i).getMovieName().equals(mN)) {
                return movieTickets.get(i);
            }
        }
        return null;
    }

    // 通过用户名查询用户
    private static User findUser(String name) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getLoginName().equals(name)) {
                return users.get(i);
            }
        }
        return null;
    }

    // 商家注册
    private static void businessRegister() {
        System.out.println("===============商家注册===============");
        System.out.println("商家登录名:");
        String loginName = sc.next();
        System.out.println("商家密码:");
        String loginPassword = sc.next();
        System.out.println("商家真实姓名:");
        String realName = sc.next();
        System.out.println("商家余额余额:");
        Double balance = sc.nextDouble();
        System.out.println("商家电话:");
        String tel = sc.next();
        System.out.println("商家性别:");
        char gender = sc.next().charAt(0);
        System.out.println("请输入店铺名");
        String shopName = sc.next();
        System.out.println("请输入店铺地址");
        String shopAddress = sc.next();

        // 封装business
        Business business = new Business(loginName, loginPassword, realName, balance, tel, gender, shopName, shopAddress);
        users.add(business);
    }

    // 用户注册
    private static void userRegister() {
        System.out.println("===============用户注册===============");
        System.out.println("请输入登录名:");
        String loginName = sc.next();
        System.out.println("请输入密码:");
        String loginPassword = sc.next();
        System.out.println("请输入真实姓名:");
        String realName = sc.next();
        System.out.println("请输入余额:");
        Double balance = sc.nextDouble();
        System.out.println("请输入电话:");
        String tel = sc.next();
        System.out.println("请输入性别:");
        char gender = sc.next().charAt(0);

        // 封装Customer
        Customer customer = new Customer();
        customer.setLoginName(loginName);
        customer.setLoginPassword(loginPassword);
        customer.setRealName(realName);
        customer.setBalance(balance);
        customer.setTel(tel);
        customer.setGender(gender);

        // 注册客户（添加客户到集合里）
        users.add(customer);
    }
}
