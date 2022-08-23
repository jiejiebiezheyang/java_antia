package com.xuemasi.movieBuy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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
    private static List<User> users = new ArrayList<>();//存储注册的用户和商户
    private static Map<Business,List<Movie>> allMovies =
            new HashMap<>();//所有商家的排片（key:商家 value:商家的排片）
    private static SimpleDateFormat sdf =
            new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private static User loginUser;//当前系统登录用户
    //所有电影的评分 key:电影名 value:电影的评分
    public static Map<String,List<Double>> allScores = new HashMap<>();

    //模拟注册数据
    static {
        Customer c1 = new Customer("zs","zs123",
                "张三",1000,"116",'男');
        Customer c2 = new Customer("xf","xf123",
                "小芳",1000,"117",'女');
        Business b1 = new Business("lw","lw123",
                "老王",1000,"118",'男',
                "巧克力国际影城","火星八号8B8楼");
        Business b2 = new Business("xl","xl123",
                "小丽",1000,"119",'女',
                "甜甜圈国际影城","火星6号2B6楼");
        users.add(c1);
        users.add(c2);

        users.add(b1);
        users.add(b2);
        allMovies.put(b1,null);
        allMovies.put(b2,null);
    }

    public static void main(String[] args) {
        //显示首页
        showMain();
    }

    private static void showMain() {
        while (true) {
            System.out.println("===================XXX电影首页=====================");
            System.out.println("1、登录");
            System.out.println("2、用户注册");
            System.out.println("3、商家注册");
            System.out.println("请选择");
            String input = sc.next();
            switch (input) {
                case "1":
                    login();

                    break;
                case "2":
                    //userRegist();
                    break;
                case "3":
                    //businessRegist();
                    break;
                default:
                    logger.warn("首页录入的命令非法！，只能是1,2,3");
                    break;
            }

            System.out.println("users="+users);
        }

    }

    //登录
    private static void login() {
        //判断是否存在用户
        if(users.size()==0){
            System.out.println("请先注册！");
        }else{
            while(true){
                System.out.println("===================登录界面==================");
                System.out.println("请您输入登录名称");
                String name = sc.next();
                System.out.println("请您输入登录密码");
                String password = sc.next();
                //判断输入的用户名和密码是否正确
                //1)通过登录名查询用户
                User user = findUser(name);
                //2)判断查询到的用户
                if(user==null){
                    System.out.println("登录名称错误，请确认!");
                }else{
                    //3）判断密码
                    if(password.equals(user.getLoginPassword())){
                        loginUser = user;//设置登录用户
                        //登录成功！
                        if(user instanceof Customer){
                            //展示客户登录成功的界面
                            showCustomerMain();
                        }else if(user instanceof Business){
                            //展示商家登录成功的界面
                            showBusinessMain();
                        }

                    }else{
                        System.out.println("输入的密码有误！");
                    }
                }
            }
        }
    }

    //商家登录成功的界面
    private static void showBusinessMain() {
        String realName = loginUser.getRealName();
        char gender = loginUser.getGender();
        logger.info(realName+"登录了系统~~~");
        while(true){
            System.out.println("=================XX电影商户界面===================");
            System.out.println(realName+ (gender=='男'?"先生":"女士"));
            System.out.println("请选择你要操作的功能：");
            System.out.println("1、展示详情");
            System.out.println("2、上架电影");
            System.out.println("3、下架电影");
            System.out.println("4、修改电影");
            System.out.println("5、退出");
            System.out.println("请输入你要操作的命令");
            String input = sc.next();
            switch(input){
                case "1":
                    showBusinessInfo();
                    break;
                case "2":
                    addMovie();
                    break;
                case "3":
                    removeMovie();
                    break;
                case "4":
                    changeMovie();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("输入的命令有误，请重新输入");
                    break;
            }

        }

    }

    //修改电影
    private static void changeMovie() {
        System.out.println("====================修改电影======================");
        //获取当前商户的所有排片
        Business b = (Business)loginUser;
        List<Movie> movies = allMovies.get(b);//片源
        //查看当前商户是否有排片
        if(movies==null||movies.size()==0){
            System.out.println("商家你还没有排片，请先去排片！");
            return;
        }

        while(true){
            System.out.println("请输入需要修改的电影名称");
            String movieName = sc.next();
            //获取指定电影名称的电影
            Movie movie = getMovie(movieName, movies);
            if(movie!=null){
                System.out.println("请输入修改后的电影名称");
                String newMovieName = sc.next();
                System.out.println("请输入需要修改的主演");
                String newActor = sc.next();
                System.out.println("请输入需要修改的时长");
                double newTime = sc.nextDouble();
                System.out.println("请输入需要修改的票价");
                double newPrice = sc.nextDouble();
                System.out.println("请输入需要修改的票数");
                int newNumber = sc.nextInt();

                Date newStartTime = null;
                while(true){
                    System.out.println("请输入需要修改的放映时间");
                    sc.nextLine();
                    String newStartTimeStr = sc.nextLine();
                    try {
                        newStartTime = sdf.parse(newStartTimeStr);
                        break;
                    } catch (ParseException e) {
                        System.out.println("输入的时间格式不正确！");
                    }
                }

                //修改电影
                movie.setMovieName(newMovieName);
                movie.setActor(newActor);
                movie.setTime(newTime);
                movie.setPrice(newPrice);
                movie.setNumber(newNumber);
                movie.setStartTime(newStartTime);
                System.out.println("恭喜你，你成功修改了该影片！");
                showBusinessInfo();
                return;
            }else{
                System.out.println("该电影不存在！");
            }

        }
    }

    //下架电影
    private static void removeMovie() {
        System.out.println("====================下架电影======================");
        //获取当前商户的所有排片
        Business b = (Business)loginUser;
        List<Movie> movies = allMovies.get(b);//片源
        //查看当前商户是否有排片
        if(movies==null||movies.size()==0){
            System.out.println("商家你还没有排片，请先去排片！");
            return;
        }
        //有排片，才下架
        while(true){
            System.out.println("请你输入需要下架的电影名称");
            String movieName = sc.next();
            //根据电影名称到片源中查询影片
            Movie movie = getMovie(movieName,movies);
            if(movie==null){
                System.out.println("你的店铺没有上架该影片！");
                System.out.println("请问继续下架吗?y/n");
                String input = sc.next();
                switch(input){
                    case "y":
                        break;
                    case "n":
                        return;
                }
            }else{
                movies.remove(movie);//下架电影
                System.out.println("你当前店铺已经成功下架了："+movieName);
                showBusinessInfo();
                return;
            }

        }

    }

    //通过指定电影名从片源中获取电影
    private static Movie getMovie(String movieName, List<Movie> movies) {
        for (Movie movie : movies) {
            if (movieName.equals(movie.getMovieName())){
                return movie;
            }
        }
        return null;
    }

    //上架电影
    private static void addMovie() {
        System.out.println("===================上架电影====================");
        System.out.println("请输入新片名");
        String movieName = sc.next();
        System.out.println("请输入主演");
        String actor = sc.next();
        System.out.println("请输入时长");
        double time = sc.nextDouble();
        System.out.println("请输入票价");
        double price = sc.nextDouble();
        System.out.println("请输入票数");
        int number = sc.nextInt();
        System.out.println("请输入影片放映时间（yyyy/MM/dd HH:mm:ss）");
        sc.nextLine();
        String startTimeStr = sc.nextLine();
        try {
            Date startTime = sdf.parse(startTimeStr);
            //封装Movie
            Movie movie = new Movie(movieName,actor,time,price
                    ,number,startTime);
            //将当前商户的排片加入到排片信息集合中
            Business b = (Business)loginUser;//当前商户
            List<Movie> movies = allMovies.get(b);//当前商户的所有排片
            if(movies==null){
                movies = new ArrayList<>();
            }
            movies.add(movie);
            allMovies.put(b,movies);
            System.out.println("您已经成功上架了：<<"+movieName+">>");

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    //商户查询自己的详情
    private static void showBusinessInfo() {
        System.out.println("=====================商家详情界面========================");
        logger.info(loginUser.getRealName()+"商家，真正查看自己的详情~~~");
        Business b = (Business)loginUser;
        System.out.println(b.getShopName()+"\t电话："+b.getTel()
                +"\t地址："+b.getShopAddress()+"\t余额："+b.getBalance());
        //获取商户的排片
        List<Movie> movies = allMovies.get(b);
        if(movies==null||movies.size()==0){
            System.out.println("你的店铺当前无片在放映！");
        }else{
            System.out.println("\t片名\t\t\t主演\t\t\t时长\t\t\t评分" +
                    "\t\t\t票价\t\t\t余票数量\t\t\t放映时间");
            for (Movie movie : movies) {
                System.out.println("\t"+movie.getMovieName()+
                        "\t"+movie.getActor()+"\t"+movie.getTime()+
                        "\t"+movie.getScore()+"\t"+movie.getPrice()+
                        "\t"+movie.getNumber()+"\t"+sdf.format(movie.getStartTime()));
            }
        }

    }

    //客户登录成功的界面
    private static void showCustomerMain() {
        char gender = loginUser.getGender();
        logger.info(loginUser.getRealName()+"登录了系统~~~");
        while(true){
            System.out.println("=================XX电影客户界面===================");
            System.out.println(loginUser.getRealName()+ (gender=='男'?"先生":"女士"));
            System.out.println("请选择你要操作的功能：");
            System.out.println("1、展示全部影片信息功能");
            System.out.println("2、根据电影名称查询电影信息：");
            System.out.println("3、评分功能：");
            System.out.println("4、购票功能：");
            System.out.println("5、退出系统：");
            System.out.println("请输入你要操作的命令");
            String input = sc.next();
            switch(input){
                case "1":
                    showAllMovies();
                    break;
                case "2":
                    showMovieInfo();
                    break;
                case "3":
                    movieScore();

                    break;
                case "4":
                    buyMovie();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("输入的命令有误，请重新输入");
                    break;
            }

        }



    }

    //电影评分
    private static void movieScore() {
        //获取当前客户购买的电影票
        Customer c = (Customer)loginUser;
        Map<String, Boolean> buyMovies = c.getBuyMovies();
        //判断
        if(buyMovies==null||buyMovies.size()==0){
            System.out.println("当前没有看过电影，不能评价！");
            return;
        }
        Set<Map.Entry<String, Boolean>> entries = buyMovies.entrySet();
        for (Map.Entry<String, Boolean> entry : entries) {
            String movieName = entry.getKey();
            Boolean flag = entry.getValue();
            if(flag){
                System.out.println(movieName+"已经评分过");
            }else{
                System.out.println("请您对："+movieName+"进行打分(0~10)");
                double score = sc.nextDouble();
                //获取当前电影的所有评分集合
                List<Double> scores = allScores.get(movieName);
                if(scores==null){//该电影第一次评分
                    scores = new ArrayList<>();
                    scores.add(score);
                    allScores.put(movieName,scores);
                }else{
                    scores.add(score);
                }
                //修改评价标签
                buyMovies.put(movieName,true);
            }
        }
    }

    //购票
    private static void buyMovie() {
        System.out.println("====================用户购票功能=====================");
        while(true){
            System.out.println("请输入需要店名");
            String shopName = sc.next();
            //查询商户
            Business b = getBusiness(shopName);
            if(b==null){
                System.out.println("店名有误！");
                continue;
            }

            //店铺存在
            //获取当前商户的片源
            List<Movie> movies = allMovies.get(b);
            if(movies==null||movies.size()==0){
                System.out.println("当前商户还没有上架电影");
                return;
            }

            //有片源
            System.out.println("请输入购买的电影名称");
            String movieName = sc.next();
            //查询电影
            Movie movie = getMovie(movieName,movies);
            if(movie==null){
                System.out.println("电影名有误！");
                continue;
            }

            //有电影
            while(true){
                System.out.println("请输入电影票数");
                int num = sc.nextInt();
                //判断电影票数是否充足
                if(num> movie.getNumber()){
                    System.out.println("票数不足，还剩下"+movie.getNumber()+"张票");
                    continue;
                }
                //判断客户钱够不够
                double balance = loginUser.getBalance();//客户钱
                double totalMoney = num*movie.getPrice();//票的总金额
                if(balance<totalMoney){
                    System.out.println("余额不足，不能购买"+num+"张票");
                    continue;
                }
                //可以购买
                //客户修改余额
                loginUser.setBalance(loginUser.getBalance()-totalMoney);
                //商户修改余额
                b.setBalance(b.getBalance()+totalMoney);
                //设置票数
                movie.setNumber(movie.getNumber()-num);
                System.out.println("您成功购买了"+movieName+num+"张票！总金额为："+totalMoney);
                System.out.println("您的余额为="+loginUser.getBalance());

                //将购买的电影票放入到购票集合中
                Customer c = (Customer)loginUser;
                Map<String, Boolean> buyMovies = c.getBuyMovies();
                buyMovies.put(movieName,false);

                return;
            }


        }
    }

    //通过商户店铺名称查询商户
    private static Business getBusiness(String shopName) {
        for (User user : users) {
            if(user instanceof Business){
                Business b = (Business) user;
                if(shopName.equals(b.getShopName())){
                    return b;
                }
            }
        }
        return null;
    }

    //显示电影信息
    private static void showMovieInfo() {
        System.out.println("==================电影信息展示界面=====================");
        //所有商家的排片
        Collection<List<Movie>> c = allMovies.values();
        //判断商家是否有排片
        if(!isAddMovie(c)){
            System.out.println("没有片源，请等待商家排片！");
            return;
        }

        System.out.println("请输入你需要查询的电影名称");
        String movieName = sc.next();

        for (List<Movie> movies : c) {
            Movie movie = getMovie(movieName, movies);
            if(movie!=null){
                System.out.println("\t片名\t\t主演\t\t时长\t\t评分" +
                        "\t\t票价\t\t余票数量\t\t放映时间");
                System.out.println("\t"+movie.getMovieName()+
                        "\t"+movie.getActor()+"\t"+movie.getTime()+
                        "\t"+movie.getScore()+"\t"+movie.getPrice()+
                        "\t"+movie.getNumber()+"\t"+sdf.format(movie.getStartTime()));
                return;
            }
            System.out.println("电影名称有误！");
        }

    }

    //所有商家都没有排片，返回false；否则返回 true
    private static boolean isAddMovie(Collection<List<Movie>> c) {
        boolean flag = false;
        for (List<Movie> movies : c) {
            if(movies!=null && movies.size()>0){
                flag = true;
                break;
            }
        }
        return flag;
    }

    //显示所有上架的电影
    private static void showAllMovies() {
        System.out.println("==================展示全部上架排片信息=====================");
        Set<Map.Entry<Business, List<Movie>>> entries = allMovies.entrySet();
        for (Map.Entry<Business, List<Movie>> entry : entries) {
            Business b = entry.getKey();
            List<Movie> list = entry.getValue();
            //输出商户信息
            System.out.println(b.getShopName()+"\t电话："+b.getTel()
                    +"\t地址："+b.getShopAddress());
            //输出商户的排片信息
            if(list==null||list.size()==0){
                System.out.println("商家还没有排片!");
            }else{
                System.out.println("\t片名\t\t\t主演\t\t\t时长\t\t\t评分" +
                        "\t\t\t票价\t\t\t余票数量\t\t\t放映时间");
                for (Movie movie : list) {
                    System.out.println("\t"+movie.getMovieName()+
                            "\t"+movie.getActor()+"\t"+movie.getTime()+
                            "\t"+movie.getScore()+"\t"+movie.getPrice()+
                            "\t"+movie.getNumber()+"\t"+sdf.format(movie.getStartTime()));
                }
            }
        }
    }

    //通过用户名获取用户
    private static User findUser(String name) {
        for(int i=0;i<users.size();i++){
            User u = users.get(i);
            if(u.getLoginName().equals(name)){
                return u;
            }
        }
        return null;
    }

    //商家注册
    private static void businessRegist() {
        System.out.println("=================商户注册界面====================");
        System.out.println("请输入登录名");
        String loginName = sc.next();
        System.out.println("请输入登录密码");
        String loginPassword = sc.next();
        System.out.println("请输入真实姓名");
        String realName = sc.next();
        System.out.println("请输入账户余额");
        double balance = sc.nextDouble();
        System.out.println("请输入电话号码");
        String tel = sc.next();
        System.out.println("请输入性别");
        char gender = sc.next().charAt(0);
        System.out.println("请输入店铺名");
        String shopName = sc.next();
        System.out.println("请输入店铺地址");
        String shopAddress = sc.next();
        //封装Business
        Business business = new Business(loginName,loginPassword,
                realName,balance,tel,gender,shopName,shopAddress);
        //注册商户
        users.add(business);
    }

    //用户注册
    private static void userRegist() {
        System.out.println("=================用户注册界面====================");
        System.out.println("请输入登录名");
        String loginName = sc.next();
        System.out.println("请输入登录密码");
        String loginPassword = sc.next();
        System.out.println("请输入真实姓名");
        String realName = sc.next();
        System.out.println("请输入账户余额");
        double balance = sc.nextDouble();
        System.out.println("请输入电话号码");
        String tel = sc.next();
        System.out.println("请输入性别");
        char gender = sc.next().charAt(0);
        //封装Customer
        Customer customer = new Customer();
        customer.setLoginName(loginName);
        customer.setLoginPassword(loginPassword);
        customer.setRealName(realName);
        customer.setBalance(balance);
        customer.setTel(tel);
        customer.setGender(gender);
        //注册客户
        users.add(customer);
    }
}
