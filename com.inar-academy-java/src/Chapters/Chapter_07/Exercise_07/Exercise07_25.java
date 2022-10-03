package Chapters.Chapter_07.Exercise_07;

import java.util.Scanner;

public class Exercise07_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a, b and c for \"ax^2 + bx = c\"");
        double[] eqn = new double[3];
        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextDouble();
        }

        if (solveDiscriminant(eqn) > 1) {
            System.out.println("The equation has 2 roots");
            System.out.println("Root 1 is " + getRoot1(eqn) + " Root 2 is " + getRoot2(eqn));
        } else if (solveDiscriminant(eqn) == 0 ) {
            System.out.println("The equation has 1 root\n" +
                    "Root is " + getRoot1(eqn));
        } else {
            System.out.println("The equation has no real root");
        }
    }

    public static double solveDiscriminant(double[] eqn) {
       // Math.pow(b , 2) - (4 * a * c );
        return Math.pow(eqn[1], 2) - (4 * eqn[0] * eqn[2]);
    }

    public static double getRoot1(double[] eqn) {
        //double root1 =(-b + Math.sqrt(discriminant)) / (2 * a);
        return (-eqn[1] + Math.sqrt(solveDiscriminant(eqn)))/ (2 * eqn[0]);
    }

    public static double getRoot2(double[] eqn) {
        //double root2 =(-b - Math.sqrt(discriminant)) / ( 2* a);
        return (-eqn[1] -  Math.sqrt(solveDiscriminant(eqn))) / (2 * eqn[0]);
    }
}
