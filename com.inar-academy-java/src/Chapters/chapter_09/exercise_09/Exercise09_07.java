package Chapters.chapter_09.exercise_09;

public class Exercise09_07 {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Balance --> " + account.getBalance() +
                "\nMonthlyInterest --> " + account.getMonthlyInterest() +
                "\nDateCreated --> " + account.getDateCreated().toString());

    }
}
