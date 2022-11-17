package weeks.week_14.Exercise11_08;


public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account("Sinan", 54, 1000, 5);
        account.deposit(500);
        account.withdraw(250);
        account.deposit(500);
        account.withdraw(250);
        account.deposit(500);
        account.withdraw(250);
        account.showTranscription();
        System.out.println("\n\n\n");
        Account account1 = new Account("Guven", 34, 5000, 5);
        account1.withdraw(4500);
        account1.withdraw(450);
        account1.deposit(8000);
        account1.showTranscription();
    }
}
