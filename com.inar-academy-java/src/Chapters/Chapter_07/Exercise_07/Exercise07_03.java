package Chapters.Chapter_07.Exercise_07;

import java.util.Scanner;

public class Exercise07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers between 0 and 100 input ends if you enter 0 : ");
        int num = input.nextInt();
        int[] countNum = new int[100];
        while (num != 0) {
            num = input.nextInt();
            if (num == 0) {
                break;
            }
            countNum[num - 1]++;
        }
        printCount(countNum);
    }

    public static void printCount(int[] countNum) {
        for (int i = 0; i < countNum.length; i++) {
            if (countNum[i] != 0) {
                System.out.println((i + 1) + " occurs " + countNum[i] + " times");
            }
        }
    }
}
