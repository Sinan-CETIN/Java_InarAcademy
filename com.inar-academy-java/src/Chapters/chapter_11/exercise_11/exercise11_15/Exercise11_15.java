package Chapters.chapter_11.exercise_11.exercise11_15;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_15 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of the points:");
        int numberOfPoints = input.nextInt();

        ArrayList<Double> listX = new ArrayList<>();
        ArrayList<Double> listY = new ArrayList<>();

        getXandY(listX, listY, numberOfPoints);

        double area = calculateArea(listX, listY);
        System.out.println("The total area is " + area);
    }

    public static void getXandY(ArrayList<Double> listX, ArrayList<Double> listY, int numberOfPoints) {
        System.out.print("Enter the coordinates of the points:");
        for (int i = 0; i < numberOfPoints; i++) {
            double x = input.nextDouble();
            double y = input.nextDouble();
            listX.add(x);
            listY.add(y);
        }
        listX.add(listX.get(0));
        listY.add(listY.get(0));
    }

    public static double calculateArea(ArrayList<Double> listX, ArrayList<Double> listY) {
        if (listX.size() != listY.size()) {
            throw new RuntimeException("Invalid list size");
        }
        double area1 = 0;
        double area2 = 0;

        for (int i = 0; i < listX.size(); i++) {

            if (i == listX.size() - 1) {
                area1 += listX.get(i) * listY.get(0);
                area2 += listY.get(i) * listX.get(0);
            } else {
                area1 += listX.get(i) * listY.get(i + 1);
                area2 += listY.get(i) * listX.get(i + 1);
            }
        }

        double area = (area1 - area2) / 2;
        return Math.abs(area);
    }
}
