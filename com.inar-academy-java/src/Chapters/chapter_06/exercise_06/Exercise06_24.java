package Chapters.chapter_06.exercise_06;

public class Exercise06_24 {


    public static void main(String[] args) {
        printCalender();
    }

    public static void printCalender() {
        long time = System.currentTimeMillis();
        int currentSeconds = (int) getCurrentSeconds(time);
        int currentMinutes = (int) getCurrentMinutes(time);
        int currentHour = (int) getCurrentHour(time);

        System.out.println(getYear(time) + "/" + getCurrentDayAndMonth(time) + "       " + currentHour + ":" + ((currentMinutes < 10) ? "0" + currentMinutes : currentMinutes) + ":" + currentSeconds);
    }

    public static long getTotalSeconds(long time) {
        return time / 1000;
    }

    public static long getCurrentSeconds(long time) {
        return getTotalSeconds(time) % 60;
    }

    public static long getTotalMinutes(long time) {
        return getTotalSeconds(time) / 60;
    }

    public static long getCurrentMinutes(long time) {
        return getTotalMinutes(time) % 60;
    }
    public static long getTotalHour(long time) {
        return getTotalMinutes(time) / 60;
    }

    public static long getCurrentHour(long time) {
        return getTotalHour(time) % 24 + 3;
    }

    public static int getTotalDay(long time) {
        return (int) getTotalHour(time) / 24;
    }

    public static int getYear(long time) {
        int totalDay = getTotalDay(time);
        int year = 1970;
        while (totalDay > 365) {
            if (isLeapYear(year)) {
                totalDay -= 366;
                year++;
            } else {
                totalDay -= 365;
                year++;
            }
        }
        return year;
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static String getCurrentDayAndMonth(long time) {
        int totalDay = getTotalDay(time);
        int year = getYear(time);
        int sum = 0;
        for (int i = 1970; i < year; i++) {
            if (isLeapYear(i)) {
                sum += 366;
            } else {
                sum += 365;
            }
        }
        int dayInTheYear = totalDay - sum;
        String monthAndDay = getMonth(dayInTheYear, year);
        return monthAndDay;
    }

    public static String getMonth(int day, int year) {
        day++;
        int month = 0;
        int monthNumber = 1;
        for (int i = 1; i < 13 && day > month; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                month = 31;
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                month = 30;
            } else {
                if (isLeapYear(year)) {
                    month = 29;
                } else {
                    month = 28;
                }
            }
            if (day > month) {
                day -= month;
                monthNumber++;
            }
        }
        return monthNumber + "/" + day;
    }
}