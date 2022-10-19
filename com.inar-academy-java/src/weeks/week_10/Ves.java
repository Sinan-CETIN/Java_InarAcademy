package weeks.week_10;

import java.util.Scanner;


public class Ves {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter number of rows and columns: ");
        int row = input.nextInt();
        int col = input.nextInt();
        int[][] array = new int[row][col];

        fillArray(array);

        System.out.println("\nbefore the shuffle the list is\n ");

        print(array);

        shuffle(array);

        System.out.println("\nafter shuffle the array is\n");

        print(array);

    }

    private static void fillArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 90 + 10);
            }
        }
    }

    private static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void shuffle(int[][] m) {
        int temp;

        for (int i = 0; i < m.length; i++) {

            int random = (int) (Math.random() * m.length);

            temp = m[i][0];
            m[i][0] = m[random][0];
            m[random][0] = temp;

        }
    }
}