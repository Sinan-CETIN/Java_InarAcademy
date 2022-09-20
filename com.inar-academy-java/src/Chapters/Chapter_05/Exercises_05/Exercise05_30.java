import java.util.Scanner;

public class Exercise05_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter saving amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter annual interest rate: ");
        double annualInterest = input.nextDouble();
        double monthlyInterest = annualInterest / (12 * 100);
        System.out.print("Enter maturity period (number of months): ");
        int month = input.nextInt();
        System.out.printf("%-10s%-10s","Month", "Account");
        double sum = amount;
        System.out.println();

        for(int i = 1; i <= month; i++){
            sum = amount  + (amount * monthlyInterest / 1200);
            System.out.printf("%-10d%-10.2f", i, sum);
            System.out.println();
        }
    }
}
