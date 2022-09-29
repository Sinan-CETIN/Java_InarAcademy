
package Chapters.Chapter_07.Exercise_07;

import java.util.Scanner;

public class Exercise07_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers : ");
        double[] list = new double[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }

        int indexOfSmallestElement = indexOfSmallestElement(list);
        System.out.println("The minimum number is " + list[indexOfSmallestElement] + " and index is : " + indexOfSmallestElement) ;
    }

    public static int indexOfSmallestElement(double[] list) {
        double min = list[0];
        int index = 0;
        for (int i = 1; i < list.length; i++) {
            if(min > list[i]) {
                min = list[i];
                index = i;
            }
        }
        return index;

    }
}
