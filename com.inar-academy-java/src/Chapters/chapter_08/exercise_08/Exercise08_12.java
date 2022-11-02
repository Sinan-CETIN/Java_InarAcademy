package Chapters.chapter_08.exercise_08;

import java.util.Scanner;

public class Exercise08_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly
                // -or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950}};// Head of household


        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        System.out.println("(0-single filer, 1-married jointly or qualifying widow(er),\n" +
                "2-married separately, 3-head of household)");
        System.out.print("Enter the filling status : ");
        int status = input.nextInt();
        System.out.print("Enter the taxable income : ");
        double taxableIncome = input.nextDouble();

        double tax = calculateTax(brackets, rates, status, taxableIncome);
        System.out.println("Tax is --> " + tax);
    }


    private static double calculateTax(int[][] brackets, double[] rates, int status, double taxableIncome) {
        if (taxableIncome < brackets[status][0]) {
            return 0;
        }
        double tax = 0;

        for (int i = brackets[status].length - 1; i >= 0; i--) {
            if (taxableIncome > brackets[status][i]) {
                tax += (taxableIncome - brackets[status][i]) * rates[i + 1];
                taxableIncome = brackets[status][i];
            }
        }
        tax += brackets[status][0] * rates[0];
        return tax;
    }

}
