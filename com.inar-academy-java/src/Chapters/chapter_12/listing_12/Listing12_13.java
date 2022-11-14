package Chapters.chapter_12.listing_12;


import java.io.IOException;
import java.io.PrintWriter;

public class Listing12_13 {
    public static void main(String[] args) throws IOException {
        java.io.File file = new java.io.File("C:\\Users\\sinan\\OneDrive\\Desktop\\PrintWriterDec/scores1.txt");
        System.out.println(file.getAbsolutePath());
        if(file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        java.io.PrintWriter output = new java.io.PrintWriter(file);
        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);
        System.out.println(file.getAbsolutePath());
        //Close output
        output.close();
    }
}
