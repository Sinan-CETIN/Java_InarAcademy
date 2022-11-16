package Chapters.chapter_12.exercise_12.exercise12_18;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Exercise12_18 {
    public static void main(String[] args) throws IOException {
       /*if (args.length != 1) {
            System.out.println("Usage: Exercise12_18 srcRootDirectroy");
            System.exit(1);
        }*/

        File directory = new File("C:\\Users\\sinan\\OneDrive\\Desktop\\srcDirectory");
        if (!directory.exists() || !directory.isDirectory()) {
            if (!directory.exists()) {
                System.out.println(directory.getName() + " is not exists!");
                System.exit(2);
            }
            if (!directory.isDirectory()) {
                System.out.println(directory.getName() + " is not a directory!");
                System.exit(2);
            }
        }

        ArrayList<File> directories = new ArrayList<>();
        directories.add(directory);
        while (!directories.isEmpty()) {
            File file = directories.remove(0);
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (int i = 0; i < files.length; i++) {
                    if (files[i].isDirectory()) {
                        directories.add(files[i]);
                    }
                    if (files[i].isFile()) {
                        writePackageNameOnFirstLine(files[i]);
                    }
                }

            }
        }
    }

    public static void writePackageNameOnFirstLine(File file) throws IOException {
        Scanner input = new Scanner(file);
        String firstLine = file.getParent() + "\\" + file.getName();
        String total = "";
        while (input.hasNext()) {
            total += "\n" + input.nextLine();
        }
        input.close();
        PrintWriter output = new PrintWriter(file);
        output.println(firstLine);
        output.println(total);
        output.close();
    }
}
