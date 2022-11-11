package Chapters.chapter_11.exercise_11.exercise11_12;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise11_12 {
   /* public static void main(String[] args) {
        Double[] doubleList = createDoubleList();
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(doubleList));

    }*/
    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
