package Chapters.chapter_08.exercise_08;

import java.util.Scanner;

public class Exercise08_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix size : ");
        int size = input.nextInt();

        double[][] matrix = createMatrix(size, input);
        double[][] sortedColumnMatrix = sortColumn(matrix);

        System.out.println("Matrix ----> ");
        display(matrix);
        System.out.println("-----------\nSorted Row Matrix  -----> ");
        display(sortedColumnMatrix);
    }

    private static double[][] createMatrix(int size, Scanner input) {
        double[][] result = new double[size][size];
        System.out.println("Enter values --> ");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = input.nextDouble();
            }
        }
        return result;
    }


    public static void display(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] sortColumn(double[][] matrix) {
        double[][] result = copy(matrix);
        copySortColumn(result);
        return result;
    }

    public static double[][] copy(double[][] matrix) {
        double[][] result = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = matrix[i][j];
            }
        }
        return result;
    }

    public static void copySortColumn(double[][] matrix) {

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                for (int k = j + 1; k <matrix.length ; k++) {
                    if(matrix[j][i] > matrix[k][i]){
                        double temp = matrix[j][i];
                        matrix[j][i] = matrix[k][i];
                        matrix[k][i] = temp;
                    }
                }
            }
        }
    }
}
