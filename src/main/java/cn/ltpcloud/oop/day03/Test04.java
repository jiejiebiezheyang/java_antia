package cn.ltpcloud.oop.day03;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/08/08/17:45
 * @Description:
 */

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account() {
    }
    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterest() {
        return annualInterestRate / 12;
    }

    public void withdraw(double d) {
        if (balance < d) {
            System.out.println("余额不足!\n您的账户余额为：" + balance + "\n");
        } else {
            balance -= d;
            System.out.println("您的账户余额为：" + balance + "\n月利率为：" + getMonthlyInterest() + "\n");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("您的账户余额为：" + balance + "\n月利率为：" + getMonthlyInterest() + "\n");
    }
}

class CheckAccount extends Account {
    private double overdraft;

    public CheckAccount() {
    }

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);

        } else {
            if ((amount - getBalance()) <= getOverdraft()) {
                setOverdraft(getOverdraft() - (amount - getBalance()));
                setBalance(0);
            } else {
                System.out.println("超出可透支限额！\n");
            }
        }
        System.out.println("您的账户余额：" + getBalance() + "\n您的可透支额：" + getOverdraft() + "\n");
    }

}


public class Test04 {
    public static void main(String[] args) {
        /*Account user1 = new Account(1222, 20000, 0.045);
        user1.withdraw(30000);
        user1.withdraw(2500);
        user1.deposit(3000);*/

        CheckAccount user2 = new CheckAccount(1122, 20000, 0.045, 5000);
        user2.withdraw(5000);
        user2.withdraw(18000);
        user2.withdraw(3000);
    }
}
