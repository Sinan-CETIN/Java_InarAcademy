package Chapters.chapter_07.exercise_07;


import java.util.Scanner;

public class Exercise07_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of studets :");
        int numberOfStudents = input.nextInt();
        String[] names = new String[numberOfStudents];
        int[] scores = new int[numberOfStudents];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter student" + (i + 1) + " names :");
            input.nextLine();
            names[i] = input.nextLine();
            System.out.print("Enter student" + (i + 1) + " score :");
            scores[i] = input.nextInt();
        }

        sort(names,scores);
        displaySortedScoresAndNames(names,scores);
    }

    public static void sort(String[] names, int[] scores) {

        for (int i = 0; i < scores.length - 1; i++) {
            int max = scores[i];
            int maxIndex = i;
            for (int j = i + 1; j < scores.length ; j++) {
                if(max < scores[j]) {
                    max = scores[j];
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int temp = scores[i];
                scores[i] = scores[maxIndex];
                scores[maxIndex] = temp;
                String temp1 = names[i];
                names[i] = names[maxIndex];
                names[maxIndex] = temp1;
            }

        }
    }

    public static void displaySortedScoresAndNames(String[] names, int[] scores) {
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-20s:%-3d\n",names[i] , scores[i]);;

        }
    }
}
