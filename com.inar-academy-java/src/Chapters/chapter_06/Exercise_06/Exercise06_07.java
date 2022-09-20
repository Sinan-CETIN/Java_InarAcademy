import java.util.Scanner;

public class Exercise06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount:");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage:");
        double interestRate = input.nextDouble();
        double monthlyInterestRate = interestRate / 1200;
        System.out.print("Enter number of years:");
        int year = input.nextInt();

        System.out.printf("%-8s%-15s", "Years", "Future Value\n");
        for(int i = 1; i <= year ; i++){
            System.out.printf("%-8d%15.2f", i, futureInvestmentValue(investmentAmount,monthlyInterestRate, i));
            System.out.println(
            );
        }

    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        double futureInvestmentValue = investmentAmount * Math.pow((1 + (monthlyInterestRate)), (years * 12));
        return futureInvestmentValue;
    }
}
