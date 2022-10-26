package Chapters.chapter_08.exercise_08;

import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.util.Scanner;

public class Exercise08_34 {
    public static void main(String[] args) {
        final int NUMBER_OF_POINTS = 6;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + NUMBER_OF_POINTS + " points --> ");

        double[][] points = createPoints(NUMBER_OF_POINTS, input);
        double[] rightMostLowestPoint = getRightMostLowestPoint(points);

        System.out.println("The rightmost lowest point is (" + rightMostLowestPoint[0] + ", " + rightMostLowestPoint[1] +")");
    }

    public static double[][] createPoints(int numberOfPoints, Scanner input) {
        double[][] result = new double[numberOfPoints][2];
        for (int i = 0; i < numberOfPoints; i++) {
            result[i][0] = input.nextDouble();
            result[i][1] = input.nextDouble();
        }
        return result;
    }

    public static double[] getRightMostLowestPoint(double[][] points) {
        double[] result = new double[2];
        result[0] = points[0][0];
        result[1] = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if(result[1] > points[i][1] || (result[1] == points[i][1] && result[0] < points[i][0])) {
                result[0] = points[i][0];
                result[1] = points[i][1];
            }
        }
        return result;
    }
}
