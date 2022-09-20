import  java.util.Scanner;

public class Exercise05_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount:");
        int loan = input.nextInt();
        System.out.print("Enter of Year:");
        int year = input.nextInt() ;
        System.out.printf("%-20s%-20s%-20s", "InterestRare","Monthly Payment", "Total Payment");

        double annualInterest = 5.0;

        System.out.println();

        for(double i = 5.000; i <= 8.000; i += 0.125){
            double monthlyInterest = annualInterest / 1200;
            double monthlyPayment = loan * monthlyInterest / (1 - 1 / Math.pow(1 + monthlyInterest, year * 12));
            double totalPayment = monthlyPayment * year * 12;
            System.out.printf("%-20.3f%-20.2f%-20.2f",annualInterest, monthlyPayment, totalPayment);
            annualInterest += 0.125;
            System.out.println(
            );
        }



    }
}
