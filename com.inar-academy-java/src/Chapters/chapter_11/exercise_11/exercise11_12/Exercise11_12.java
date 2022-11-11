package Chapters.chapter_11.exercise_11.exercise11_12;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise11_12 {

    public static final int DEFAULT_SIZE = 10;

    public static void main(String[] args) {
        Double[] doubleList = createDoubleList();
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(doubleList));
        System.out.print(list);
        System.out.println(" Sum --> " + sum(list));

    }

    public static Double[] createDoubleList() {
        return createDoubleList(DEFAULT_SIZE);
    }

    public static Double[] createDoubleList(int number) {
        Double[] result = new Double[number];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int)((Math.random() * 100) * 100) / 100.0;
        }
        return result;
    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

}
