package Chapters.chapter_06.Exercise_06;

import java.util.*;

public class Exercise06_24 {
    public static void main(String[] args) {
        printDate();
    }

    public static void printDate() {
        long totalMillis = System.currentTimeMillis();
        long totalSeconds = totalMillis / 1000;
        long totalHour = getTotalHour(totalSeconds);
        long totalMinutes = getTotalMinutes(totalSeconds);
        System.out.println(getCurrentMonth(totalSeconds) + "//" + getCurrentDay(totalSeconds) + " " + (totalHour % 24) + ":" + (totalMinutes % 60) +
                ":" + (totalSeconds % 60) + " " + getCurrentYear((int)totalSeconds));
    }

    public static long getTotalYear(long time) {
        int year = 1970;
        long day = getTotalDays(time);
        while (day > 365) {
            if (isLeapYear(year)) {
                year++;
                day -= 366;
            } else {
                year++;
                day -= 365;
            }
        }
        return year;
    }

    public static long getTotalDays(long time) {
        return getTotalHour(time) / 24;
    }

    public static long getTotalHour(long time) {
        return getTotalMinutes(time) / 60;
    }


    public static long getTotalMinutes(long time) {
        return time / 60;
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static String getCurrentMonth(long time) {
        int month = currentMonth(time);

        String s1 = "";
        switch (month) {
            case 1:
                s1 = "January";
                break;
            case 2:
                s1 = "February";
                break;
            case 3:
                s1 = "March";
                break;
            case 4:
                s1 = "April";
                break;
            case 5:
                s1 = "May";
                break;
            case 6:
                s1 = "June";
                break;
            case 7:
                s1 = "July";
                break;
            case 8:
                s1 = "August";
                break;
            case 9:
                s1 = "September";
                break;
            case 10:
                s1 = "October";
                break;
            case 11:
                s1 = "November";
                break;
            case 12:
                s1 = "December";
                break;
        }
        return s1;
    }

    public static int getCurrentDay(long time) {
        int i = 1970;
        int currentYear = i + (int)getTotalYear(time);
        long currentDay = getTotalDays(time);
        while (i <= currentYear) {
            if (isLeapYear(i))
                currentDay -= 366;
            else
                currentDay -= 365;
            i++;
        }
        int month = 0;
        while (currentDay > 31) {
            if (month == 1 || month == 3 || month == 5 ||
                    month == 7 || month == 8 || month == 10 ||
                    month == 12) {
                currentDay -= 31;
                month++;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                currentDay -= 30;
                month++;
            } else {
                if (isLeapYear(currentYear)) {
                    currentDay -= 29;
                    month++;
                } else {
                    currentDay -= 28;
                    month++;
                }
            }
        }
        return (int) currentDay;
    }

    public static int currentMonth(long time) {
        int i = 1970;
        long currentYear = i + getTotalYear(time);
        long currentDay = getTotalDays(time);
        while (i <= currentYear) {
            if (isLeapYear(i))
                currentDay -= 366;
            else
                currentDay -= 365;
            i++;
        }
        int month = 0;
        while (currentDay > 31) {
            if (month == 1 || month == 3 || month == 5 ||
                    month == 7 || month == 8 || month == 10 ||
                    month == 12) {
                currentDay -= 31;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                currentDay -= 30;

            } else {
                if (isLeapYear((int) currentYear)) {
                    currentDay -= 29;

                } else {
                    currentDay -= 28;

                }
            }
            month++;
        }
        return (int) month;
    }

    public static int getCurrentYear(int time) {
        return 1970 + (int)getTotalYear(time);
    }
}
