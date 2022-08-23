package com.xuemasi.movieBuy;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/22/15:57
 * @Description:
 */
public class Movie {
    private String movieName;
    private String actor;
    private Double time;
    private Double score;
    private Double price;
    private Integer number;
    private Date startTime;

    public Movie() {
    }

    public Movie(String movieName, String actor, Double time, Double price, Integer number, Date startTime) {
        this.movieName = movieName;
        this.actor = actor;
        this.time = time;
        this.price = price;
        this.number = number;
        this.startTime = startTime;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    //获取评分
    public Double getScore() {
        //获取当前电影的所有评分
        List<Double> scores = MainApp.allScores.get(movieName);
        if(scores==null){//该电影还没有评分
            return 0.0;
        }
        //求平均分
        double sumScore = 0;
        for (Double score : scores) {
            sumScore += score;
        }
        return sumScore/scores.size();
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}
