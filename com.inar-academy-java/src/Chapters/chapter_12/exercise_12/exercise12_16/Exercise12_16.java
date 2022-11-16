package Chapters.chapter_12.exercise_12.exercise12_16;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
(Replace text) Listing 12.16, ReplaceText.java, gives a program that replaces
text in a source file and saves the change into a new file. Revise the program to
save the change into the original file. For example, invoking
java Exercise12_16 file oldString newString
 */
public class Exercise12_16 {
    public static void main(String[] args) throws IOException {
        if (args.length != 3) {
            System.out.println("Usage: Exercise12_16 file oldString newString");
            System.exit(1);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("The file you point is not exists!!");
            System.exit(2);
        }

        Scanner input = new Scanner(file);
        System.out.println("Enter the path for revised data --> ");
        String path = new Scanner(System.in).nextLine();
        File revisedFile = new File(path);
        PrintWriter output = new PrintWriter(revisedFile);

        while(input.hasNext()) {
            String s1 = input.nextLine();
            s1 = s1.replace(args[1], args[2]);
            output.println(s1);
        }
        output.close();
    }
}
