package Chapters.chapter_12.exercise_12.exercise12_25;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Exercise12_25 {

    public static final String[] ranks = {"Assistant Professor", "Associate Professor", "Full Professor"};

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1 for url and 2 for local file --> ");
        int option = input.nextInt();
        showAverageSalaries(option);
    }

    public static void showAverageSalaries(int option) throws IOException {
        Scanner input = new Scanner(System.in);
        if (option == 1) {
            System.out.print("Enter the URL --> ");
            String urlString = input.nextLine();
            URL url = new URL(urlString);
            input = new Scanner(url.openStream());
        } else if (option == 2) {
            System.out.print("Enter the local file path --> ");
            String path = input.nextLine();
            File file = new File(path);
            input = new Scanner(file);
        } else {
            System.out.println("Enter 1 or 2 !!");
            System.exit(1);
        }
        int numberOfAssociate = 0;
        int numberOfAssistant = 0;
        int numberOfFull = 0;
        double sumAssociate = 0;
        double sumAssistant = 0;
        double sumFull = 0;
        while (input.hasNext()) {
            String s = input.nextLine();
            String[] split = s.split("\\s*\\|\\s*");
            if (split.length < 4) continue;
            if (split[2].equals(ranks[0])) {
                sumAssistant += Double.parseDouble(split[3]);
                numberOfAssistant++;
            } else if (split[2].equals(ranks[1])) {
                sumAssociate += Double.parseDouble(split[3]);
                numberOfAssociate++;
            } else if (split[2].equals(ranks[2])) {
                sumFull += Double.parseDouble(split[3]);
                numberOfFull++;
            } else {
                continue;
            }
        }
        System.out.printf("The average salary for assistant professors --> %.2f\n", (sumAssistant / numberOfAssistant));
        System.out.printf("The average salary for associate professors --> %.2f\n", (sumAssociate / numberOfAssociate));
        System.out.printf("The average salary for full professors --> %.2f\n", (sumFull / numberOfFull));
    }
}
