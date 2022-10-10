package Chapters.chapter_06.exercise_06;

import java.util.Scanner;

public class Exercise06_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.println("Year " + year + " has " + numberOfDaysInYear(year) + " days.");
    }

    public static int numberOfDaysInYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
