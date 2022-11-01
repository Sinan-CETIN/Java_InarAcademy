package Chapters.chapter_10.exercise_10.exercise10_01;

public class Time {
    private int hour;
    private int minute;
    private int second;
    private long totalMillis;


    public Time() {
        this(System.currentTimeMillis());
    }

    public Time(int hour, int minute, int second) {
        this((hour * 60 * 60 * 1000) + (minute * 60 * 1000) + (second * 1000));
    }

    public Time(long totalMillis) {
        this.totalMillis = totalMillis;
        this.hour = getCurrentHour();
        this.minute = getCurrentMinute();
        this.second = getCurrentSecond();
    }


    private int getTotalSecond() {
        return (int) this.totalMillis / 1000;
    }
    private int getCurrentMinute() {
        return getTotalMinute() % 60;
    }

    private int getCurrentHour() {
        return getTotalHour() % 24;
    }

    private int getCurrentSecond() {
        return getTotalSecond() % 60;
    }

    private int getTotalMinute() {
        return getTotalSecond() / 60;
    }

    private int getTotalHour() {
        return getTotalMinute() / 60;
    }

    public long getTotalMillis() {
        return totalMillis;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setTime(long totalMillis) {
        this.totalMillis = totalMillis;
        this.second = getCurrentSecond();
        this.minute = getCurrentMinute();
        this.hour = getCurrentHour();
    }

    public void display() {
        System.out.println(getHour() + ":" + getMinute() + ":" + getSecond());
    }
}


