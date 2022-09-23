package Chapters.chapter_06.Exercise_06;

import java.util.Scanner;

public class Exercise06_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter milliseconds : ");
        long milliseconds = input.nextLong();
        System.out.println(convertMilliseconds(milliseconds));
    }

    public static String convertMilliseconds(long time) {
        long totalSeconds = time / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHour = totalMinutes / 24;


        return totalHour + ":" + currentMinute + ":" + currentSecond;
    }
}
