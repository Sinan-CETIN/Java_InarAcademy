package Chapters.chapter_11.exercise_11.exercise11_13;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter ten integers : ");
        for (int i = 0; i < 10; i++) {
            int number = input.nextInt();
            list.add(number);
        }
        System.out.println(list);
        removeDuplicate(list);
        System.out.println(list);
    }
    public static void removeDuplicate(ArrayList<Integer> list){
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j))){
                    list.remove(list.get(j));
                    j--;
                }
            }
        }
        list = temp;
    }
}
