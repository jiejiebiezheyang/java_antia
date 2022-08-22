package com.xuemasi.movieBuy;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/22/14:47
 * @Description:
 */
public class Business extends User{
    private String shopName; // 店铺名称
    private String shopAddress; // 店铺地址

    public Business(){
    }

    public Business(String shopName, String shopAddress) {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
    }

    public Business(String loginName, String loginPassword, String realName, double balance, String tel, char gender, String shopName, String shopAddress) {
        super(loginName, loginPassword, realName, balance, tel, gender);
        this.shopName = shopName;
        this.shopAddress = shopAddress;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }
}
