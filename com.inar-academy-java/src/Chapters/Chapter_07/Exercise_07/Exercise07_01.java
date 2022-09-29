package Chapters.Chapter_07.Exercise_07;

import java.util.Scanner;

public class Exercise07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int numberOfStudents = input.nextInt();

        int[] score = getScore(numberOfStudents);
        printScores(score);
    }

    public static int[] getScore(int numberOfStudetns) {
        Scanner input = new Scanner(System.in);
        int[] score = new int[numberOfStudetns];
        System.out.print("Enter " + numberOfStudetns + " scores : ");
        for (int i = 0; i < score.length; i++) {
            score[i] = input.nextInt();
        }
        return score;
    }

    public static void printScores(int[] scores) {
        int bestScore = getBestScore(scores);

        for (int i = 0; i < scores.length; i++) {
            if (bestScore - scores[i] <= 10) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is A");
            }else if (bestScore - scores[i] <= 20) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is B");
            }else if (bestScore - scores[i] <= 30) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is C");
            } else if (bestScore - scores[i] <= 40) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is D");
            } else {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is F");
            }
        }
    }

    public static int getBestScore(int[] array) {
        int best = array[0];
        for (int i = 1; i < array.length; i++) {
            if (best < array[i]) {
                best = array[i];
            }
        }
        return best;
    }
}
