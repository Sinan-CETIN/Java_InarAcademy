package Chapters.chapter_10.exercise_10.exercise10_15;

import Chapters.chapter_10.exercise_10.exercise10_13.MyRectangle2D;

import java.util.Scanner;


public class Exercise10_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points --> ");
        int numberOfPoints = input.nextInt();
        double[][] points = createPoints(numberOfPoints, input);

        MyRectangle2D rectangle2D = getRectangle(points);
        System.out.println("The bounding " + rectangle2D.toString());
    }

    public static double[][] createPoints(int numberOfPoints, Scanner input) {
        double[][] result = new double[numberOfPoints][2];
        System.out.println("Enter points --> ");
        for (int i = 0; i < result.length; i++) {
            result[i][0] = input.nextDouble();
            result[i][1] = input.nextDouble();
        }
        return result;
    }

    public static MyRectangle2D getRectangle(double[][] points) {
        double[] boundingPoints = getBoundingPoints(points);// index 0 -> maxX | index 1 -> minX | index 2 -> maxY |index 3 -> minY

        double centerX = (boundingPoints[0] + boundingPoints[1]) / 2;
        double centerY = (boundingPoints[2] + boundingPoints[3]) / 2;
        double width = (boundingPoints[0] - boundingPoints[1]);
        double height = (boundingPoints[2] - boundingPoints[3]);

        return new MyRectangle2D(centerX, centerY, width, height);
    }

    private static double[] getBoundingPoints(double[][] points) {
        double[] result = {Double.MIN_VALUE, Double.MAX_VALUE, Double.MIN_VALUE, Double.MAX_VALUE};

        for (int i = 0; i < points.length; i++) {
            if (result[0] < points[i][0]) {
                result[0] = points[i][0];
            }

            if (result[1] > points[i][0]) {
                result[1] = points[i][0];
            }

            if (result[2] < points[i][1]) {
                result[2] = points[i][1];
            }

            if (result[3] > points[i][1]) {
                result[3] = points[i][1];
            }
        }
        return result;
    }
}
