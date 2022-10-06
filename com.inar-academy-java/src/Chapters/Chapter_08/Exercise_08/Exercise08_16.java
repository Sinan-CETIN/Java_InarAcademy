package Chapters.Chapter_08.Exercise_08;

import java.util.Scanner;

public class Exercise08_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // i ll sort points at first x coordinates then y coordinates
        System.out.print("Enter number of points : ");
        int numberOfPoints = input.nextInt();
        int[][] points = createRandomPoints(numberOfPoints);
        sort(points);
        display(points);
    }

    public static int[][] createRandomPoints(int number) {
        int[][] points = new int[number][2];
        for (int i = 0; i < points.length; i++) {
            points[i][0] = (int) (Math.random() * 10);
            points[i][1] = (int) (Math.random() * 10);
        }
        return points;
    }

    public static void sort(int[][] points) {
        for (int i = 0; i < points.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < points.length; j++) {

                if (points[minIndex][0] > points[j][0]) {
                    minIndex = j;
                } else if (points[minIndex][0] == points[j][0] && points[minIndex][1] > points[j][1]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int[] temp = points[minIndex];
                points[minIndex] = points[i];
                points[i] = temp;
            }
        }
    }


    public static void display(int[][] points) {
        int count = 0;
        System.out.print("{");
        for (int i = 0; i < points.length; i++) {
            if (i == points.length - 1)
                System.out.print("{" + points[i][0] + ", " + points[i][1] + "}");
            else
                System.out.print("{" + points[i][0] + ", " + points[i][1] + "} , ");

            if ((i + 1) % 6 == 0)
                if (i == points.length - 1) {
                    System.out.println("}");
                    count++;
                } else {
                    System.out.println();
                }
        }

        if (count == 0)
            System.out.println("}");

    }
}
