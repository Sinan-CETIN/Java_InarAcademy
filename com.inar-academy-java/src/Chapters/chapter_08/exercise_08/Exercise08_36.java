package Chapters.chapter_08.exercise_08;

import java.util.Scanner;

public class Exercise08_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number n --> ");
        int row = input.nextInt();
        System.out.println("Enter " + row + " of letters separated by spaces :");
        char[][] letters = createArray(row);

        display(letters);

        if (isLatinSquare(letters)) {
            System.out.println("The input array is a Latin square");
        } else {
            System.out.println("The input array is not a square number");
        }
    }

    public static char[][] createArray(int size) {
        Scanner input = new Scanner(System.in);
        char[][] result = new char[size][size];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = input.next().charAt(0);
                if(result[i][j] < 'A' || result[i][j] > (size - 1 + 'A')) {
                    System.out.println("Wrong input: the letters must be " +
                            "from 'A' to " + (char)('A' + result.length -1));
                    System.exit(1);
                }
            }
        }
        return result;
    }

    public static void display(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isLatinSquare(char[][] array) {
        if (!checkRow(array)) {
            return false;
        }
        if (!checkColumn(array)) {
            return false;
        }

        return true;
    }

    public static boolean checkRow(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            boolean[] row = new boolean[array.length];
            for (int j = 0; j < array[i].length; j++) {
                if (row[array[i][j] - 'A']) {
                    return false;
                } else {
                    row[array[i][j] - 'A'] = true;
                }
            }
        }
        return true;
    }

    public static boolean checkColumn(char[][] array) {
        for (int i = 0; i < array[0].length; i++) {
            boolean[] column = new boolean[array[0].length];
            for (int j = 0; j < array.length; j++) {
                if (column[array[j][i] - 'A']) {
                    return false;
                } else {
                    column[array[j][i] - 'A'] = true;
                }
            }
        }
        return true;
    }
}

