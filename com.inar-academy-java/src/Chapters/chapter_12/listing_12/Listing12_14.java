package Chapters.chapter_12.listing_12;

import java.io.File;
import java.io.IOException;

public class Listing12_14 {
    public static void main(String[] args) throws IOException {
        java.io.File file = new File("C:\\Users\\sinan\\OneDrive\\Desktop\\PrintWriterDec/scores2.txt");
        if (file.exists()) {
            System.out.println("File already exists.");
            System.exit(1);
        }

        try(java.io.PrintWriter output = new java.io.PrintWriter(file);) {
            output.print("Sinan Cetin");
            output.println(" --> 45");
            output.print("Kemal KEKE");
            output.println(" --> 90");
        }
    }
}
