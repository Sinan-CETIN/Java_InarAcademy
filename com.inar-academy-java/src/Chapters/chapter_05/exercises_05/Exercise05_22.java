import java.util.Scanner;

public class Exercise05_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan amount:");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years:");
        int year = input.nextInt();
        System.out.print("Annual Interest Rate:");
        double annualInterest = input.nextDouble();

        double monthlyInterestRate = annualInterest / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, year * 12));
        double totalPayment = monthlyPayment * year * 12;

        System.out.printf("Monthly Payment: %.2f\n",monthlyPayment);
        System.out.printf("Total Payment: %.2f\n\n" ,totalPayment);
        System.out.printf("%-15s%-15s%-15s%-15s", "Payment#", "Interest", "Principal", "Balance");
        System.out.println();
        for(int i = 1; i <= 12; i++){
            double interest = monthlyInterestRate * loanAmount;
            double principal = monthlyPayment - interest;
            loanAmount -=  principal;

            System.out.printf("%-15d%-15.2f%-15.2f%-15.2f", i, interest, principal, loanAmount);
            System.out.println();
        }

    }
}
