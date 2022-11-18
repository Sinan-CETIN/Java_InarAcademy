package Chapters.chapter_12.exercise_12.exercise12_29;

import java.io.File;
import java.util.Scanner;

public class Exercise12_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the directory's path --> ");
        String path = input.nextLine();
        File file = new File(path);
        if (!file.isDirectory()) {
            System.out.println(file.getName() + " is not a directory!!");
            System.exit(1);
        }
        fixTheFileName(file);
    }

    public static void fixTheFileName(File file) {
        File[] files = file.listFiles();

        for (int i = 0; i < files.length; i++) {
            if (!files[i].isFile()) {
                continue;
            }
            String name = files[i].getName();
            name = name.substring(0, name.length() - 4);

            String[] split = name.split("_");

            if (split[1].length() == 1) {
                split[1] = '0' + split[1];
            }

            String newName = split[0] + "_" + split[1];
            File fileName = new File(files[i].getParent() + "\\" + newName + ".txt");
            files[i].renameTo(fileName);
        }
    }
}
