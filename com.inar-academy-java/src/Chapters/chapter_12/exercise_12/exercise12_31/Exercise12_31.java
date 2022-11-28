package Chapters.chapter_12.exercise_12.exercise12_31;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise12_31 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year --> ");
        int year = input.nextInt();
        String path = "C:\\Users\\sinan\\OneDrive\\Desktop\\babynameranking" + year + ".txt";
        File file = new File(path);
        System.out.println(file.exists());
        char gender = getGender();

        String name = getName();
        int rankOfName = findRankOfName(file, gender, name);
        if (rankOfName == -1) {
            System.out.println("The name " + name + " is not ranked in year " + year);
        } else {
            System.out.println(name + " is ranked #" + rankOfName + " in the year " + year);
        }
    }

    public static char getGender() {
        System.out.print("Enter the genter -- > (M for male F for female)");
        char ch = new Scanner(System.in).next().charAt(0);
        if (Character.toUpperCase(ch) != 'M' && Character.toUpperCase(ch) != 'F') {
            System.out.println(ch + " is a wrong input for gender");
            System.exit(1);
        }
        return Character.toUpperCase(ch);
    }

    public static String getName() {
        System.out.print("Enter a name --> ");
        return new Scanner(System.in).nextLine();
    }

    public static int findRankOfName(File file, char gender, String name) throws IOException {
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String s = input.nextLine();
            String[] split = s.split("  ");
            if (gender == 'M' && split[1].equals(name)) {
                return Integer.parseInt(split[0]);
            } else if (gender == 'F' && split[3].equals(name)) {
                return Integer.parseInt(split[0]);
            }
        }
        return -1; // The name is not in the list!
    }
}
