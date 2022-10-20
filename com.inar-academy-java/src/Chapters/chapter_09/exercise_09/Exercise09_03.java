package Chapters.chapter_09.exercise_09;

import java.util.Date;

public class Exercise09_03 {
    public static void main(String[] args) {
        long startTime = 10000;
        long finisTime = 100000000000L;
        while(startTime <= finisTime) {
            Date date = new Date(startTime);
            System.out.println(date.toString());
            startTime *= 10;
        }
    }
}
