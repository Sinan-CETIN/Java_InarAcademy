package Chapters.chapter_12.exercise_12.exercise12_14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise12_14 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the file's path --> ");
        String path = new Scanner(System.in).nextLine();
        File file = new File(path);

        if (!file.exists()) {
            System.out.println(file.getName() + " does not exists!!!");
            System.exit(1);
        }
        Scanner input = new Scanner(file);
        int sum = sum(input);
        System.out.println("Sum of elements --> " + sum);
    }


    public static int sum(Scanner input) {
        int result = 0;
        while(input.hasNext()) {
            result += input.nextInt();
        }
        return result;
    }
}
