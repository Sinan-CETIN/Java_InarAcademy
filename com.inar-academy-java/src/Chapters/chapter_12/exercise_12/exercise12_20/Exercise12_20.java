package Chapters.chapter_12.exercise_12.exercise12_20;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_20 {
    public static void main(String[] args) throws IOException {
        /*if (args.length != 1) {
            System.out.println("Usage: Exercise12_20 srcDirectroy");
            System.exit(1);
        }*/

        File file = new File("c:\\Users\\sinan\\OneDrive\\Desktop\\srcDirectory");
        if (!file.exists() || !file.isDirectory()) {
            if (!file.exists()) {
                System.out.println("File does not exists!!");
                System.exit(2);
            }
            if (!file.isDirectory()) {
                System.out.println("File is not a directory!!");
                System.exit(3);
            }
        }
        ArrayList<File> directories = new ArrayList<>();
        directories.add(file);
        while (!directories.isEmpty()) {
            File file1 = directories.remove(0);
            File[] files = file1.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    directories.add(files[i]);
                }
                if (files[i].isFile()) {
                    removePackageName(files[i]);
                }
            }
        }
    }

    public static void removePackageName(File file) throws IOException {
        Scanner input = new Scanner(file);
        String packageName = file.getParent() + "\\" + file.getName();
        String total = "";
        while (input.hasNext()) {
            String s = input.nextLine();
            if (s.equals(packageName)) {
                continue;
            }
            total += "\n" + s;
        }
        input.close();
        PrintWriter output = new PrintWriter(file);
        output.println(total);
        output.close();
    }
}
