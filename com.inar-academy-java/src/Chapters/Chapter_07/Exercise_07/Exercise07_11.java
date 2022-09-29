package Chapters.Chapter_07.Exercise_07;

import java.util.Scanner;

public class Exercise07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many number you'll enter :");

        int n = input.nextInt();
        double[] list = new double[n];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }

        double mean = mean(list);
        double deviation = deviation(list);
    }

    public static double mean(double[] list) {

    }
}
