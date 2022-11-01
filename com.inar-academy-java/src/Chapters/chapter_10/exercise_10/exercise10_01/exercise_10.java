package Chapters.chapter_10.exercise_10.exercise10_01;

public class exercise_10 {
    public static void main(String[] args) {
        Time time1 = new Time();
        time1.display();

        Time time2 = new Time(10, 59 , 54);
        time2.display();

        time2.setTime(555550000L);
        time2.display();

        Time time3 = new Time(555550000L);
        time3.display();
    }
}
