package Chapters.chapter_12.exercise_12.exercise12_12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise12_12 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the path --> ");
        String path = new Scanner(System.in).nextLine();
        File file = new File(path);

        if (!file.exists()) {
            System.out.println("The file you point doesn't exist!!");
            System.exit(1);
        }

        endOfLineBraceStyle(file);
    }

    public static void endOfLineBraceStyle(File file) throws IOException {
        String total = "";
        try (Scanner input = new Scanner(file);) {
            while (input.hasNext()) {
                total += input.nextLine() + "\n";
            }
        }

        total = total.replaceAll("\n\\s*\\{", " {");

        try (PrintWriter output = new PrintWriter(file);) {
            output.print(total);
        }
    }
}
