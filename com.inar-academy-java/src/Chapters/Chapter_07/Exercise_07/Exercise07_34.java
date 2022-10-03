package Chapters.Chapter_07.Exercise_07;

import java.util.Scanner;

public class Exercise07_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s1 = input.nextLine();
        s1 = sort(s1);

        display(s1);
    }

    public static String sort(String s) {
        String result = "";

        int[] valuesOfCharactersInString = new int[s.length()];
        for(int i = 0; i < valuesOfCharactersInString.length; i++) {
            valuesOfCharactersInString[i] = (int)(s.charAt(i));
        }

        sort(valuesOfCharactersInString);

        for (int i = 0; i < valuesOfCharactersInString.length; i++) {
            result += (char)(valuesOfCharactersInString[i]) + "";
        }
        System.out.println(result);
        return result;
    }

    public static void sort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int min = list[i];
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if(min > list[j]) {
                    min = list[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
        }
    }

    public static void display(String s){
        System.out.println("Sorted String is ---> " + s);}
}
