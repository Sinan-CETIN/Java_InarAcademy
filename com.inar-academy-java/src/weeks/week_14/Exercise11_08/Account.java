package weeks.week_14.Exercise11_08;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();


    private ArrayList<Transaction> list;

    public Account() {
        list = new ArrayList<Transaction>();
    }

    public Account(String name, int id, double balance, double annualInterestRate) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        list = new ArrayList<Transaction>();
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return getAnnualInterestRate() / 12;
    }

    public double getMonthlyInterest() {
        return getBalance() * getMonthlyInterestRate();
    }

    public void showTranscription() {
        for (int i = 0; i < this.list.size(); i++) {
            System.out.println("Name --> " + this.name);
            System.out.println("Account ID --> " + this.id);
            System.out.println(list.get(i).getDescription());
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        }
    }

    public void withdraw(double amount) {
        Transaction transaction = new Transaction('W', amount, (this.balance - amount));
        list.add(transaction);
        balance -= amount;
    }

    public void deposit(double amount) {
        Transaction transaction = new Transaction('D', amount, (this.balance + amount));
        list.add(transaction);
        balance += amount;
    }
}
