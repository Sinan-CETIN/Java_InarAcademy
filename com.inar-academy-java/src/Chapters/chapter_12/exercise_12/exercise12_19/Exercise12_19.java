package Chapters.chapter_12.exercise_12.exercise12_19;

import java.io.File;
import java.util.Scanner;

public class Exercise12_19 {
    /*
    (Count words) Write a program that counts the number of words in President
Abraham Lincoln’s Gettysburg address from http://cs.armstrong.edu/liang/data/
Lincoln.txt.
     */
    public static void main(String[] args) {
        String urlString = "https://philpapers.org/rec/VYGTPO";

        try {
            java.net.URL url = new java.net.URL(urlString);
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                String s = input.nextLine();
                System.out.println(s);
                String[] split = s.split("\\s");
                if (split.length == 1 && split[0].equals("")) continue;
                count += split.length;
            }
            System.out.println("Number Of Words in the file is " + count);
        } catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (java.io.IOException ex) {
            System.out.println("I/O Errors: no such file");
        }
    }
}
