package Chapters.chapter_12.exercise_12.exercise12_11;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise12_11 {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Usage: deleteString filename ");
            System.exit(1);
        }

        File file = new File(args[0]);
        System.out.println(file.exists());
        Scanner input = new Scanner(file);
        String result = "";
        while (input.hasNext()) {
            String s1 = input.nextLine();
            Scanner input1 = new Scanner(s1);
            while (input1.hasNext()) {
                String s2 = input1.next();
                if ("sinan".equals(s2)) continue;
                result += s2 + " ";
            }
            result += "\n";
        }

        PrintWriter output = new PrintWriter(file);
        output.println(result);
        output.close();
    }
}
