package Chapters.chapter_12.exercise_12.exercise12_22;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_22 {
    public static void main(String[] args) throws IOException {
       if (args.length != 3) {
            System.out.println("Usage: java Exercise12_22 dir oldString newString");
            System.exit(1);
        }
        File directory = new File(args[0]);

        if (!directory.exists()) {
            System.out.println("Directory is not exists");
            System.exit(2);
        }
        if (!directory.isDirectory()) {
            System.out.println(args[0] + " is not a directory");
            System.exit(3);
        }
        ArrayList<File> directories = new ArrayList<>();
        directories.add(directory);
        while (!directories.isEmpty()) {
            File fileFromList = directories.remove(0);
            if (fileFromList.isDirectory()) {
                File[] files = fileFromList.listFiles();
                for (int i = 0; i < files.length; i++) {
                    if (files[i].isDirectory()) {
                        directories.add(files[i]);
                    } else {
                        changeOldStringWithNew(files[i], args[1], args[2]);
                    }
                }
            }
        }
    }

    public static void changeOldStringWithNew(File file, String oldString, String newString) throws IOException {
        Scanner input = new Scanner(file);
        String total = "";
        while (input.hasNext()) {
            String s = input.nextLine();
            s = s.replaceAll(oldString, newString);
            total += s + "\n";
        }
        input.close();
        PrintWriter output = new PrintWriter(file);
        output.println(total);
        output.close();
    }
}
