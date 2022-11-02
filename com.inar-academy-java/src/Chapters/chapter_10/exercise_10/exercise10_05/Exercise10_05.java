package Chapters.chapter_10.exercise_10.exercise10_05;

import Chapters.chapter_10.listing_10.StackOfInteger;

import java.util.Scanner;

public class Exercise10_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a positive number : ");
            number = input.nextInt();
        } while (number < 0);

        StackOfInteger factors = findFactors(number);


        displayFactors(factors);
    }

    private static StackOfInteger findFactors(int number) {
        StackOfInteger factors = new StackOfInteger();
        int divisor = 2;
        while (number != 1) {
            if (number % divisor == 0) {
                factors.push(divisor);
                number /= divisor;
            } else {
                divisor++;
            }
        }
        return factors;
    }

    public static void displayFactors(StackOfInteger factors) {
        while (!factors.empty()) {
            if (factors.getSize() == 1) {
                System.out.print(factors.pop());
            } else {
                System.out.print(factors.pop() + " - ");
            }
        }
    }
}
