package Chapters.chapter_12.exercise_12.exercise12_26;

import java.io.File;
import java.util.Scanner;

public class Exercise12_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the path in which you want to create a directory --> ");
        String path =  input.nextLine();
        File file = new File(path);
        if(file.exists()) {
            System.out.println("Directory already exists");
        } else {
            if (file.mkdirs()) {
                System.out.println("Directory created successfully");
            } else {
                System.out.println("We face a problem while creating directory!Please try again!!");
            }
        }
    }
}
