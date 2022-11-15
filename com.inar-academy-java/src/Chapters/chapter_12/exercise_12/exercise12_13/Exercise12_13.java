package Chapters.chapter_12.exercise_12.exercise12_13;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise12_13 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file path --> ");
        String path = input.nextLine();

        File file = new File(path);
        input = new Scanner(file);
        int numberOfWords = 0;
        int numberOfCharacters = 0;
        int numberOfLine = 0;
        while (input.hasNext()) {
            String s1 = input.nextLine();
            numberOfLine++;

            String[] split = s1.split("\\s");
            if (split.length == 1 && split[0].equals("")) continue;
            numberOfWords += split.length;

            for (int i = 0; i < split.length; i++) {
                numberOfCharacters += split[i].length();
            }
        }
        System.out.println("Number of Lines --> " + numberOfLine +
                "\nNumber of words --> " + numberOfWords +
                "\nNumber of characters --> " + numberOfCharacters);
    }
}
