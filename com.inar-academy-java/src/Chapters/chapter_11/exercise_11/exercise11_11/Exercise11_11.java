package Chapters.chapter_11.exercise_11.exercise11_11;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise11_11 {
    public static final int DEFAULT_LIST_SIZE = 20;

    public static void main(String[] args) {
        Integer[] integerList = createRandomIntegerList();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(integerList));
        System.out.println("Before Sorting --> " + list);
        sort(list);
        System.out.println("After Sorting --> " + list);
    }

    public static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            Integer min = list.get(i);
            int index = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (min.compareTo(list.get(j)) == 1) {
                    min = list.get(j);
                    index = j;
                }
            }
            if (index != i) {
                Integer temp = list.get(i);
                list.set(i, min);
                list.set(index, temp);
            }
        }
    }
    public static Integer[] createRandomIntegerList() {
        return createRandomIntegerList(DEFAULT_LIST_SIZE);
    }
    public static Integer[] createRandomIntegerList(int number) {
        Integer[] result = new Integer[number];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int)(Math.random() * 100);
        }
        return result;
    }
}
