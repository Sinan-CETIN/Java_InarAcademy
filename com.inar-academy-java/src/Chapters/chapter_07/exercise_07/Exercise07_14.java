package Chapters.chapter_07.exercise_07;

import java.util.Scanner;

public class Exercise07_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five integers : ");
        int num1 =input.nextInt();
        int num2 =input.nextInt();
        int num3 =input.nextInt();
        int num4 =input.nextInt();
        int num5 =input.nextInt();
        int gcd = gcd(num1, num2, num3, num4, num5);
        System.out.println("Greatest commmon divisor is : " + gcd);

    }

    public static int gcd(int... numbers) {
        int gcd = 1;
        int possibleGcd = 2;
        int min = getMin(numbers);
        while (possibleGcd <= min) {
            if (divisible(possibleGcd, numbers)) {
                gcd = possibleGcd;
            }
            possibleGcd++;
        }
        return gcd;
    }

    public static int getMin(int... numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static boolean divisible(int divisor,int...numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divisor != 0) {
                return false;
            }
        }
        return true;
    }
}