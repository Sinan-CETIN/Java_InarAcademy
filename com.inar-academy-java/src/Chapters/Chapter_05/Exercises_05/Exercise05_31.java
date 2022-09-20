import java.util.Scanner;

public class Exercise05_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount:");
        double amount = input.nextDouble();
        System.out.print(" Enter annual percentage yield: ");
        double annualPercentaheYield = input.nextDouble();
        System.out.print("Enter maturity period (number of months): ");
        int month = input.nextInt();
        System.out.printf("%-10s%-10s","Month", "CD value");
        System.out.println();

        for(int i = 1; i <= month; i++){
            amount =amount + amount * annualPercentaheYield / 1200;
            System.out.printf("%-10d%-10.2f", i, amount);
            System.out.println();
        }
    }
}
