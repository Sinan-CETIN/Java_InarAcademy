package Chapters.chapter_06.Exercise_06;

import java.util.Scanner;

public class Exercise06_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Prompt the user to enter year and month
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the month: ");
        int month = input.nextInt();

        //print calender
        printMonth(year, month);
    }

    public static void printMonth(int year, int month) {
        printMonthTitle(year, month);

        printMonthBody(year, month);
    }

    public static void printMonthTitle(int year, int month) {
        System.out.println("            " + getMonthName(month) + " " + year);
        System.out.println("------------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
    }

    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
        }
        return monthName;
    }

    public static void printMonthBody(int year, int month) {
        //get start day of the week for the first date in the month
        int startDay = getStartDay(year, month, 1);

        //get number of days in the month
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        //pad space before the first day of the month
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }
        for (int i = 1; i <= numberOfDaysInMonth; i++) {
            if ((i + startDay) % 7 == 0)
                System.out.println(i);
            else
                System.out.printf("%-4d", i);
        }
        System.out.println();
    }

    public static int getStartDay(int year, int m, int q) {
        if (m == 1 || m ==2) {
            m += 12;
            year--;
        }
        int j = year / 100;
        int k = year  % 100;
        int h = (q + (26 * (m + 1) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;
        return (h + 6) % 7;

    }
    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||
                month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2) return (isLeapYear(year)) ? 29 : 28;
        return 0;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
