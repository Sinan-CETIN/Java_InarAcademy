package Chapters.chapter_07.exercise_07;

import java.util.Scanner;

public class Exercise07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers : ");
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        System.out.println("Full list:");
        Exercise07_12.disPlayArray(list);
        int[] nonDuplicateList = eliminateDuplicates(list);
        System.out.println("Nonduplicate list:");
        Exercise07_12.disPlayArray(nonDuplicateList);
    }

    public static int[] eliminateDuplicates(int[] list){
        int[] nonDuplicateList = new int[list.length];
        int count = 0;
        for(int i = 0; i < list.length; i++) {
            if (!isInclude(list[i], nonDuplicateList)) {
                nonDuplicateList[count++] =list[i];
            }
        }

        int[] temp = new int[count];
        System.arraycopy(nonDuplicateList, 0 ,temp,0,count);
        nonDuplicateList = temp;
        return nonDuplicateList;
    }

    public static boolean isInclude(int key, int[] list) {
        for (int i = 0 ; i < list.length; i++) {
            if ( key == list[i]) {
                return true;
            }
        }
        return false;
    }
}
