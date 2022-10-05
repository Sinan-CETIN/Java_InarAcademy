package Chapters.Chapter_08.Exercise_08;

import jdk.nashorn.api.scripting.ScriptObjectMirror;

import java.util.Scanner;

public class Exercise08_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row");
        double[][] matrix = new double[3][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        for (int j = 0; j < matrix[0].length; j++) {
            double sum = sumColumn(matrix, j);
            System.out.println("Sum of the elements at column " + (j + 1) + "--> " + sum);
        }
    }

    public static double sumColumn(double[][] matrix, int columnIndex) {
        double sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            sum += matrix[row][columnIndex];
        }
        return sum;
    }
}
