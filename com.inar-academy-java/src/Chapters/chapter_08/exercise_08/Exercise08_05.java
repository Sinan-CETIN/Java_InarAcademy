package Chapters.chapter_08.exercise_08;


import java.util.Scanner;

public class Exercise08_05 {
    public static void main(String[] args) {
        final int ROW = 3;
        final int COLUMN = 3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix1 : ");
        double[][] matrix1 = createMatrix(ROW, COLUMN);
        System.out.print("Enter matrix2 : ");
        double[][] matrix2 = createMatrix(ROW, COLUMN);

        double[][] matrix3 = addMatrix(matrix1, matrix2);
        displayAddMatrix(matrix1, matrix2, matrix3);
    }

    public static double[][] createMatrix(int row, int column) {
        Scanner input = new Scanner(System.in);
        double[][] result = new double[row][column];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = input.nextDouble();
            }
        }
        return result;
    }

    public static double[][] addMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static void displayAddMatrix(double[][] matrix1, double[][] matrix2, double[][] matrix3) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.printf("%5.1f", matrix1[i][j]);
            }
            if (i == matrix1.length / 2) {
                System.out.print("   + ");
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

/*
1.0 2.0 3.0
4.0 5.0 6.0
7.0 8.0 9.0

 */
/*
0.0 2.0 4.0
1.0 4.5 2.2
1.1 4.3 5.2
*/



