package com.xuemasi.movieBuy;

import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/22/14:44
 * @Description:
 */
public class Customer extends User{
    // 购买的所有电影票
    private List<String> list = new ArrayList<>();

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }


    public Customer() {}

    public Customer(List<String> list) {
        this.list = list;
    }

    public Customer(String loginName, String loginPassword, String realName, double balance, String tel, char gender) {
        super(loginName, loginPassword, realName, balance, tel, gender);
    }

    public Customer(String loginName, String loginPassword, String realName, double balance, String tel, char gender, List<String> list) {
        super(loginName, loginPassword, realName, balance, tel, gender);
        this.list = list;
    }
}
