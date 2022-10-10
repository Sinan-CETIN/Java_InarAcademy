package Chapters.chapter_07.exercise_07;

import java.util.Scanner;

public class Exercise07_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten number :");
        double[] list = new double[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }
        double smallestElement = min(list);
        System.out.println("The minimum number is : " + smallestElement);
    }

    public static double min(double[] list) {
        double min = list[0];
        int index = 0;
        for (int i = 1; i < list.length; i++) {
            if(min > list[i]) {
                min = list[i];
                index = i;
            }
        }
        return list[index];
    }
}
