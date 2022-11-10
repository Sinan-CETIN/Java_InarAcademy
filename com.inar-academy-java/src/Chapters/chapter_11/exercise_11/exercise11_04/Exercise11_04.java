package Chapters.chapter_11.exercise_11.exercise11_04;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise11_04 {
    public static void main(String[] args) {
        Integer[] list = {1,2,3,4,5,125,7,8,9,10};
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(list));
        ArrayList<Integer> list2 = null;
        ArrayList<Integer> list3 = new ArrayList<>();
        System.out.println(max(list1));
        System.out.println(max(list2));
        System.out.println(max(list3));
    }

    public static Integer max(ArrayList<Integer> list) {
        if(list == null || list.size() == 0) {
            return null;
        }
        Integer max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if(max.compareTo(list.get(i)) == -1) {
                max = list.get(i);
            }
        }

        return max;
    }
}
