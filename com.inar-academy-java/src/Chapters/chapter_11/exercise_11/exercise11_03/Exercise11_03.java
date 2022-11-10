package Chapters.chapter_11.exercise_11.exercise11_03;

import Chapters.chapter_09.exercise_09.Account;

public class Exercise11_03 {
    public static void main(String[] args) {
        CheckingAccount account1 = new CheckingAccount(1, 5000, 5);
        SavingsAccount account2 = new SavingsAccount(2, 5000, 5);
        account2.withdraw(5001);
        display(account2);
        account2.withdraw(5000);
        display(account2);
        account1.withdraw(8001);
        display(account1);
        account1.withdraw(7500);
        account1.withdraw(8001);
    }

    public static void display(Account account) {
        System.out.println(account.toString() + "\n-------------------");
    }
}
