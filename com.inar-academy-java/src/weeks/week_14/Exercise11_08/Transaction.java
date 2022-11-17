package weeks.week_14.Exercise11_08;

import java.util.Date;

public class Transaction {
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance) {
        date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = calculate(type, amount, balance);
    }

    private static String calculate(char type, double amount, double balance) {
        String result = "";
        result = (type == 'W' ? "Withdraw\n": "Deposit\n");
        result += "------------------------------\n";
        result += "The amount --> " + amount;
        result += "\nThe balance --> " + balance;
        return result;
    }
    public String getDescription() {
        return this.description;
    }
}
