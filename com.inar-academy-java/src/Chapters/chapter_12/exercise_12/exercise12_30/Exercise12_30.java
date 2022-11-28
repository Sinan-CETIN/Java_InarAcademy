package Chapters.chapter_12.exercise_12.exercise12_30;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise12_30 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a path for the file --> ");
        String path = input.nextLine();
        File file = new File(path);
        int[] countOfLetter = countNumberOfLetterInTheFile(file);
        showCountOfLetter(countOfLetter);
    }

    public static int[] countNumberOfLetterInTheFile(File file) throws  IOException{
        Scanner input = new Scanner(file);
        int[] result = new int['Z' - 'A' + 1];
        while (input.hasNext()) {
            String s = input.nextLine();
            for (int i = 0; i < s.length(); i++) {
                if(Character.isLetter(s.charAt(i))) {
                   result[Character.toUpperCase(s.charAt(i)) - 'A']++;
                }
            }
        }
        return result;
    }

    public static void showCountOfLetter(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Number of " + (char)(i + 'A') + "'s ---> " + array[i]);
        }
    }
}
