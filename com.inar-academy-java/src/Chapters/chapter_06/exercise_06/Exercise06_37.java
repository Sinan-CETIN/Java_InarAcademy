package Chapters.chapter_06.exercise_06;

import java.util.Scanner;

public class Exercise06_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        System.out.print("Enter the width : ");
        int width = input.nextInt();
        String format = format(number, width);
        System.out.println(format);
    }

    public static String format(int number, int width) {
        String result = number + "";
        if (result.length() > width)
            return result;

        while (result.length() < width) {
            result = '0' + result;
        }
        return result;
    }
}
