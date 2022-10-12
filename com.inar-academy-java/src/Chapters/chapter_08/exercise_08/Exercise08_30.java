package Chapters.chapter_08.exercise_08;

import java.util.Scanner;

public class Exercise08_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a00, a01, a10, a11 --> ");
        double[][] a = new double[2][2];
        a[0][0] = input.nextDouble();
        a[0][1] = input.nextDouble();
        a[1][0] = input.nextDouble();
        a[1][1] = input.nextDouble();

        System.out.print("Enter b0 and b1 --> ");
        double[] b = new double[2];
        b[0] = input.nextDouble();
        b[1] = input.nextDouble();
        double[] xAndY = linearEquation(a, b);
        if (xAndY == null) {
            System.out.println("The equation has no solution");
        } else {
            System.out.println("X --> " + xAndY[0] + " and b --> " + xAndY[1]);
        }
    }

    public static double[] linearEquation(double[][] a, double[] b) {
        //a00a11 - a01a10
        double divisor = a[0][0] * a[1][1] - a[0][1] * a[1][0];
        if (divisor == 0) {
            return null;
        }
        //b0a11 - b1a01
        //---------
        //a00a11 - a01a10
        double x = (b[0] * a[1][1] - b[1] * a[0][1]) / divisor;

        /*b1a00 - b0a10
        *-----------
        a00a11 - a01a10*/
        double y = (b[1] * a[0][0] - b[0] * a[1][0]) / divisor;

        double[] result = new double[2];
        result[0] = x;

        result[1] = y;
        return result;

    }
}
