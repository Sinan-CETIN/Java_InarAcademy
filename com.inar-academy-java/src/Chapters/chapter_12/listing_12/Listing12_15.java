package Chapters.chapter_12.listing_12;

import java.io.*;
import java.util.Scanner;
public class Listing12_15 {
    public static void main(String[] args) throws Exception{
        //Create a File instance
        File file = new File("C:\\Users\\sinan\\OneDrive\\Desktop\\PrintWriterDec/scores1.txt");


        //Create a Scanner for the file
        Scanner input = new Scanner(file);
        // Read data from a file
        while (input.hasNext()) {
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(
                    firstName + " " + mi + " " + lastName + " " + score);
        }
        input.close();
    }
}
