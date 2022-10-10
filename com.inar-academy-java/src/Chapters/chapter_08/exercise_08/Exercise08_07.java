package Chapters.chapter_08.exercise_08;

import java.util.Scanner;

public class Exercise08_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = getPoints();
        double shortestDistance = findShortestDistance(points);

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points, i, j);
                if (distance == shortestDistance) {
                    System.out.println("Shortest distance is --> " + shortestDistance +
                            "\nBetween (" + points[i][0] + ", " + points[i][1] + ", " + points[i][2] + ") and (" + points[j][0] +
                            ", " + points[j][1] + ", " + points[j][2] + ")");
                    System.out.println();
                }
            }
        }
    }

    public static double findShortestDistance(double[][] points) {
        int p1 = 0;
        int p2 = 1;
        double shortestDistance = distance(points, p1, p2);
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points, i, j);
                if (distance < shortestDistance) {
                    shortestDistance = distance;
                }
            }
        }
        return shortestDistance;
    }

    private static double[][] getPoints() {
        return new double[][]{{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
                {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
                {5.5, 4, -0.5}};
    }

    public static double distance(double[][] points, int p1, int p2) {
        double distance = Math.sqrt(Math.pow(points[p1][0] - points[p2][0], 2) +
                Math.pow(points[p1][1] - points[p2][1], 2) +
                Math.pow(points[p1][2] - points[p2][2], 2));
        return distance;
    }
}
