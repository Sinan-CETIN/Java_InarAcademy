package Chapters.chapter_07.exercise_07;

import java.util.Scanner;

public class Exercise07_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        String[] chineseZodiac = createChineseZodiac();
        System.out.println(chineseZodiac[year % 12]);
    }

    public static String[] createChineseZodiac() {
        String[] result = new String[12];
        result[0] = "Monkey";
        result[1] = "rooter";
        result[2] = "dog";
        result[3] = "pig";
        result[4] = "rat";
        result[5] = "ox";
        result[6] = "tiger";
        result[7] = "rabbit";
        result[8] = "dragon";
        result[9] = "snake";
        result[10] = "horse";
        result[11] = "sheep";

        return result;
    }
}