package Chapters.chapter_07.exercise_07;

import java.util.Scanner;

public class Exercise07_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int numberOfBalls = input.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int numberOfSlots = input.nextInt();

        String[] drops = new String[numberOfBalls];
        for (int i = 0; i < numberOfBalls; i++) {
            drops[i] = dropBall(numberOfSlots);
        }
        printBallDirection(drops);

        int[] numberOfBallsInSlots = getNumberOfBallInSlots(drops, numberOfSlots);

        printSlots(numberOfBallsInSlots);
    }

    public static String dropBall(int numberOfSlots) {
        String result = "";
        for (int i = 0; i < numberOfSlots - 1; i++) {
            int rightOrLeft = (int) (Math.random() * 2);// 0 indicates right 1 indicates left
            if (rightOrLeft == 0) {
                result += "R";
            } else {
                result += "L";
            }
        }
        return result;
    }

    public static void printBallDirection(String[] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.println("Ball " + (i + 1) + "---> " + s[i]);
        }
    }

    public static int[] getNumberOfBallInSlots(String[] drops, int numberOfSlots) {
        int[] slots = new int[numberOfSlots];
        for (int i = 0; i < drops.length; i++) {
            int count = 0;
            for (int j = 0; j < drops[i].length(); j++) {
                if (drops[i].charAt(j) == 'R') {
                    count++;
                }
            }
            slots[count]++;
        }
        return slots;
    }

    public static void printSlots(int[] numberOfBallInSlot) {
        int max = getMax(numberOfBallInSlot);

        for (int i = max; i > 0; i--) {
            for (int j = 0; j < numberOfBallInSlot.length; j++) {
                if (numberOfBallInSlot[j] >= i) {
                    System.out.print("0 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < numberOfBallInSlot.length; i++) {
            System.out.print("--");
        }

        System.out.println();

        for (int i = 0; i < numberOfBallInSlot.length; i++) {
            System.out.print((i + 1) + " ");
        }
    }

    public static int getMax(int[] list) {
        int max = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] > max)
                max = list[i];
        }
        return max;
    }
}
