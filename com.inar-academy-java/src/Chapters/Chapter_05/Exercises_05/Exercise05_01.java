import java.util.Scanner;

public class Exercise05_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countPositive = 0;
        int countNegative = 0;
        int total = 0;
        int average;
        System.out.print("Enter an integer, the input end if it is 0):");
        int number = input.nextInt();

        while (number != 0) {
            if (number > 0)
                countPositive++;
            else
                countNegative++;
            total += number;
            number = input.nextInt();
        }
        if (countPositive == 0 && countNegative ==0) {
            System.out.println("No numbers are entered except 0");
            System.exit(1);
        }

        System.out.println("The number of positives is " + countPositive);
        System.out.println("The number of negatives is " + countNegative);
        System.out.println("The total is " + total);
        System.out.println("The average is " + ((double)(total) / (countNegative + countPositive)));

    }}
