package com.xuemasi.movieBuy;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/22/14:38
 * @Description:
 */
public class User {
    private String loginName;//用户名
    private String loginPassword;//密码
    private String realName;//真实姓名
    private double balance;//余额
    private String tel;//电话号码
    private char gender;//性别

    public User() {
    }

    public User(String loginName, String loginPassword, String realName, double balance, String tel, char gender) {
        this.loginName = loginName;
        this.loginPassword = loginPassword;
        this.realName = realName;
        this.balance = balance;
        this.tel = tel;
        this.gender = gender;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
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
                "loginName='" + loginName + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                ", realName='" + realName + '\'' +
                ", balance=" + balance +
                ", tel='" + tel + '\'' +
                ", gender=" + gender +
                '}';
    }
}
