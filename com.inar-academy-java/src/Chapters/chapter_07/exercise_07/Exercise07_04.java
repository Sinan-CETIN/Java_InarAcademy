package Chapters.chapter_07.exercise_07;

import java.util.Scanner;

public class Exercise07_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] scores = new int[100];
        int score = 101;
        int numberOfStudents = 0;

        while (score >= 0 && numberOfStudents < 100) {
            System.out.print("Enter score : ");
            score = input.nextInt();
            if(score < 0) break;
            if(score > 100) continue;
            scores[numberOfStudents++] = score;
        }

        int average = getAverage(scores,numberOfStudents);
        int aboveAverage = getAboveAverage(scores, average, numberOfStudents);
        int belowAverage = numberOfStudents - aboveAverage;

        System.out.println("Average is : " + average +
            "\n   Number of students attend the exam : "+ numberOfStudents +
                "\n   Number of student above average score : " + aboveAverage +
                "\n   Number of student below average score : " + belowAverage);
        
    }
    
    public static int getAverage(int[] scores, int numberOfStudents) {
        int sum = 0;
        for (int i = 0; i <scores.length; i++) {
            sum += scores[i];
        }
        return sum / numberOfStudents;
    }
    
    public static int getAboveAverage(int[] scores, int average , int numberOfStudents) {
        int count = 0;
        for(int i = 0; i < numberOfStudents; i++) {
            if (scores[i] >= average) {
                count++;
            }
        }
        return count;
    }
}
