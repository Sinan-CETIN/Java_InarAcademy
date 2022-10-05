package Chapters.Chapter_08.Exercise_08;

import java.util.Scanner;

public class Exercise08_06 {
    public static void main(String[] args) {
        System.out.println("Enter matrix1 : ");
        double[][] matrix1 = createArray();
        System.out.println("Enter matrix2 : ");
        double[][] matrix2 = createArray();
        double[][] matrix3 = multiplyMatrix(matrix1, matrix2);
        displayMultiplyMatrix(matrix1, matrix2, matrix3);
    }

    public static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] matrix3 = new double[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrix3;
    }

    public static double[][] createArray() {
        Scanner input = new Scanner(System.in);
        double[][] result = new double[3][3];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = input.nextDouble();
            }
        }
        return result;
    }

    public static void displayMultiplyMatrix(double[][] matrix1, double[][] matrix2, double[][] matrix3) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.printf("%5.1f", matrix1[i][j]);
            }
            if (i == matrix1.length / 2) {
                System.out.print("   * ");
            } else {
                System.out.print("     ");
            }
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.printf("%5.1f", matrix2[i][j]);
            }
            if (i == matrix1.length / 2) {
                System.out.print("   = ");
            } else {
                System.out.print("     ");
            }
            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.printf("%5.1f", matrix3[i][j]);
            }
            System.out.println();
        }
    }
}
