package Chapters.chapter_08.exercise_08;

import java.util.Scanner;

public class Exercise08_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of employee : ");
        int numberOfEmployee = input.nextInt();
        ;
        int[][] employeesWeeklyWorkHours = createTable(numberOfEmployee);
        displayEachEmployeesTotalWorkHourInAweek(employeesWeeklyWorkHours);
    }

    public static int[][] createTable(int numberOfEmployee) {
        Scanner input = new Scanner(System.in);
        int[][] result = new int[numberOfEmployee][7];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = input.nextInt();
                ;
            }
        }
        return result;
    }

    public static void displayEachEmployeesTotalWorkHourInAweek(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            int total = 0;
            for (int j = 0; j < table[i].length; j++) {
                total += table[i][j];
            }
            System.out.println("Employee " + (i + 1) + "'s total work hour in a week is --> " + total);
        }
    }
}
