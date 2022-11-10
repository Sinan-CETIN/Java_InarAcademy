package Chapters.chapter_11.exercise_11.exercise11_07;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise11_07 {
    public static void main(String[] args) {
        Integer[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        ArrayList<Integer> listOfInteger = new ArrayList<>(Arrays.asList(list));
        shuffle(listOfInteger);
        display(listOfInteger);
    }

    public static void shuffle(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            int randomIndex = (int)(Math.random() * list.size());
            Integer temp = list.get(i);
            list.set(i, list.get(randomIndex));
            list.set(randomIndex, temp);

        }
    }

    public static void display(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            System.out.println("NULL");
        }
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() -1){
            System.out.println(list.get(i) + "}");}
            else {
                System.out.print(list.get(i) + ", ");
            }
        } 
    }
}
