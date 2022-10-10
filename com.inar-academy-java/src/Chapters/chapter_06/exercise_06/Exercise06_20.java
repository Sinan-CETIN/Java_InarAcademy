package Chapters.chapter_06.exercise_06;

import java.util.Scanner;

public class Exercise06_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = input.nextLine();
        int count = countLetters(s1);
        System.out.println(s1 + " has " + count + ((count > 1) ? " letters." : " a letter."));
    }

    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)))
                count++;
        }
        return count;
    }
}
