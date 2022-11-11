package Chapters.chapter_11.exercise_11.exercise11_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of account : ");
        int numberOfAccount = input.nextInt();
        Account[] accounts = createAccounts(numberOfAccount, input);
        accounts[0].withdraw(89);
        accounts[0].withdraw(64);
        accounts[0].deposit(300);
        accounts[1].withdraw(100);
        accounts[1].withdraw(150);
        accounts[1].deposit(200);
        displayTranscription(accounts[0]);
        displayTranscription(accounts[1]);
    }


    public static Account[] createAccounts(int number, Scanner input) {
        Account[] result = new Account[number];
        for (int i = 0; i < result.length; i++) {
            System.out.print("Enter name for account : ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Enter id : ");
            int id = input.nextInt();
            System.out.print("Enter balance :");
            double balance = input.nextDouble();
            System.out.print("Enter Annual Interest Rate : ");
            double annualInterestRate = input.nextDouble();
            result[i] = new Account(name, id, balance, annualInterestRate);
        }
        return result;
    }

    public static void displayTranscription(Account account) {
        ArrayList<Transaction> list = account.getTransactions();
        System.out.println("XXXXXXXXXXXXXXXXXX\nXXXXXXXXXXXXXXXXXX\n");
        System.out.println("Account's Owner name : " + account.getName());
        System.out.println("Account id : " + account.getId());

        for (int i = 0; i < list.size(); i++) {
            System.out.println("==========================");
            System.out.println(list.get(i).getDescripton() + "\n==========================");
        }
        System.out.println("XXXXXXXXXXXXXXXXXX\nXXXXXXXXXXXXXXXXXX\n");
    }
}

