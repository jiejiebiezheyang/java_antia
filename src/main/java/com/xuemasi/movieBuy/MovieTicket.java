package com.xuemasi.movieBuy;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/22/15:57
 * @Description:
 */
public class MovieTicket {
    private String movieName; // 片名
    private String starring; // 主演
    private String duration; // 时长
    private double price; // 票价
    private int count; // 票数
    private String dateTime;// 放映时间

    public MovieTicket() {
    }

    public MovieTicket(String movieName, String starring, String duration, double price, int count, String dateTime) {
        this.movieName = movieName;
        this.starring = starring;
        this.duration = duration;
        this.price = price;
        this.count = count;
        this.dateTime = dateTime;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getStarring() {
        return starring;
    }

    public void setStarring(String starring) {
        this.starring = starring;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return movieName+"\t"+starring+"\t"+duration+"\t\t评分"+"\t\t"+price+"\t\t"+count+"\t\t"+dateTime;
    }
}
