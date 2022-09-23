package Chapters.chapter_06.Exercise_06;


import java.util.Scanner;

public class Exercise06_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side1: ");

        double side1 = input.nextDouble();
        System.out.print("Enter side2: ");

        double side2 = input.nextDouble();
        System.out.print("Enter side3: ");

        double side3 = input.nextDouble();

        if (isValid(side1, side2, side3))
            System.out.println("The area for the triange is " + area(side1, side2, side3));
        else
            System.out.println("Invalid side inputs!");
    }

    public static boolean isValid(double side1, double side2, double side3) {
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2)
            return false;
        return true;
    }

    public static double area(double side1, double side2, double side3) {
        if (!isValid(side1, side2, side3))
            return -1;

        double s = (side1 + side2 + side3) / 2;

        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }
}
