package Chapters.Chapter_08.Exercise_08;

import java.util.Scanner;

public class Exercise08_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 511 : ");
        int number = input.nextInt();

        char[][] headAndTail = createHeadAndTail(number);
        display (headAndTail);
    }



    public static char[][] createHeadAndTail(int number) {
        char[][] headAndTail = new char[3][3];
        String binary = geBinaryValue(number) + "";

        if (binary.length() != 9) {
            while (binary.length() != 9) {
                binary = '0' + binary;
            }
        }
        for (int i = 0; i < binary.length(); i++) {
            int count = Integer.parseInt(binary.charAt(i) + "");
            if (count == 0)
                headAndTail[i / 3][i % 3] = 'H';
            else
                headAndTail[i / 3][i % 3] = 'T';
        }

        return headAndTail;
    }

    public static String geBinaryValue(int number) {
        String result = "";
        while (number > 0) {
            int count = number % 2;
            number /= 2;
            result += count;
        }
        return result;
    }

    public static void display(char[][] headAndTail) {
        for (int i = 0; i < headAndTail.length; i++) {
            for (int j = 0; j < headAndTail[i].length; j++) {
                System.out.print(headAndTail[i][j] + " ");
            }
            System.out.println();
        }
    }
}
