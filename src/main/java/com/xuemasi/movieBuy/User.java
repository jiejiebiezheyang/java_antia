package com.xuemasi.movieBuy;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/22/14:38
 * @Description:
 */
public class User {
    private String LoginName; // 登录名
    private String LoginPassword; // 登录密码
    private String realName; // 真实姓名
    private double balance; // 余额
    private String tel; // 电话号码
    private char gender; // 性别

    public User() {
    }

    public User(String loginName, String loginPassword, String realName, double balance, String tel, char gender) {
        LoginName = loginName;
        LoginPassword = loginPassword;
        this.realName = realName;
        this.balance = balance;
        this.tel = tel;
        this.gender = gender;
    }

    public String getLoginName() {
        return LoginName;
    }

    public void setLoginName(String loginName) {
        LoginName = loginName;
    }

    public String getLoginPassword() {
        return LoginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        LoginPassword = loginPassword;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "LoginName='" + LoginName + '\'' +
                ", LoginPassword='" + LoginPassword + '\'' +
                ", realName='" + realName + '\'' +
                ", balance=" + balance +
                ", tel='" + tel + '\'' +
                ", gender=" + gender +
                '}';
    }
}
