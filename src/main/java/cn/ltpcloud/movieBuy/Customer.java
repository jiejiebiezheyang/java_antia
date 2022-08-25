package cn.ltpcloud.movieBuy;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/22/14:44
 * @Description:
 */
public class Customer extends User {
    //购买的所有电影票
    //key：电影名称 value：是否被评分过
    private Map<String,Boolean> buyMovies = new HashMap<>();

    public Customer() {
    }
    public Customer(String loginName, String loginPassword, String realName, double balance, String tel, char gender) {
        super(loginName, loginPassword, realName, balance, tel, gender);
    }

    public Map<String, Boolean> getBuyMovies() {
        return buyMovies;
    }

    public void setBuyMovies(Map<String, Boolean> buyMovies) {
        this.buyMovies = buyMovies;
    }
}
