package Chapters.chapter_12.exercise_12.exercise12_24;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise12_24 {
    public static final int NUMBER_OF_LINES = 1000;
    public static final String[] ranks = {"Assistant Professor", "Associate Professor", "Full Professor"};

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the path you want to write on it: ");
        String path = new Scanner(System.in).nextLine();
        File file = new File(path);

        if (file.exists()) {
            System.out.println("The file you choose is already exists!");
            System.exit(1);
        }

        writeOnFile(file);
    }

    public static void writeOnFile(File file) throws IOException {
        try (PrintWriter output = new PrintWriter(file)) {
            output.printf("%-15s | %-15s | %-20s | %-10s\n", "FirstName", "LastName", "Rank", "Salary");
            output.println("------------------------------------------------------------------");
            for (int i = 0; i < NUMBER_OF_LINES; i++) {
                String firstName = "FirstName" + i;
                String lastName = "LastName" + i;
                String rank = getRank();
                double salary = getSalary(rank);
                output.printf("%-15s | %-15s | %-20s | %-10.2f\n", firstName, lastName, rank, salary);
            }
        }
    }

    public static String getRank() {
        return ranks[(int) (Math.random() * 3)];
    }

    public static double getSalary(String rank) {
        if (rank.equals(ranks[0])) {
            return (Math.random() * 30_000) + 50_000;
        } else if (rank.equals(ranks[1])) {
            return (Math.random() * 50_000) + 60_000;
        } else {
            return (Math.random() * 55_000) + 75_000;
        }
    }
}
