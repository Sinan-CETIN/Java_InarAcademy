package Chapters.chapter_11.exercise_11.exercise11_14;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_14 {
    public static int numberOfList = 0;
    public static final int DEFAULT_CAPACITY = 5;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = createList(input);
        ArrayList<Integer> list2 = createList(input);
        ArrayList<Integer> list3 = union(list1, list2);
        System.out.print("list1 --> ");
        display(list1);
        System.out.print("list2 --> ");
        display(list2);
        System.out.print("The Combined List --> ");
        display(list3);
    }

    private static ArrayList<Integer> createList(Scanner input) {
        return createList(DEFAULT_CAPACITY, input);
    }
    private static ArrayList<Integer> createList(int size, Scanner input) {
        numberOfList++;
        ArrayList<Integer> result = new ArrayList<>();
        System.out.print("Enter " + size + " number for the list "+ numberOfList + " --> ");

        for (int i = 0; i < size; i++) {
            int number = input.nextInt();
            result.add(number);
        }
        return result;
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>();
       /*
        for (int i = 0; i < list1.size(); i++) {

            result.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            result.add(list2.get(i));
        }
        */
        result.addAll(list1);
        result.addAll(list2);
        return result;
    }

    public static void display(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
