package Chapters.chapter_12.exercise_12.exercise12_28;

import java.io.File;
import java.util.Scanner;

public class Exercise12_28 {
    public static void main(String[] args) {
        if (args.length != 2 && args.length != 1) {
            System.out.println("Usage: java Exercise12_27 *");
            System.exit(1);
        }
        if (args[1] != "*") return;

        File file = new File(new Scanner(System.in).nextLine());
        renameFiles(file);
    }

    public static void renameFiles(File file) {
        if (!file.isDirectory()) {
            System.out.println(file.getName() + " is not a directory!");
            System.exit(2);
        }
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            String name = files[i].getName();
            name = name.substring(0, name.length() - 4);

            String[] split = name.split("_");

            if (!Character.isDigit(split[0].charAt(split[0].length() - 2))) {
                split[0] = split[0].substring(0, split[0].length() - 1) + "0" + split[0].charAt(split[0].length() - 1);
            }

            String newName = split[0] + "_" + split[1];
            File fileName = new File(files[i].getParent() + "\\"  + newName + ".txt");
            files[i].renameTo(fileName);
        }
    }
}