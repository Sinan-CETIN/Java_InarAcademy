package Chapters.chapter_12.listing_12;

import java.io.*;
import java.util.*;

public class Listing12_15_02 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\sinan\\OneDrive\\Desktop\\PrintWriterDec/scores1.txt");

        try (Scanner input = new Scanner(file);) {
            while (input.hasNext()) {
                String name = input.next();
                String mi = input.next();
                String lastName = input.next();
                int score = input.nextInt();
                System.out.println(
                        name + " " + mi + " " + lastName + " " + score);
            }
        }
    }
}
