package Chapters.chapter_12.exercise_12.exercise12_23;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Exercise12_23 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the url: ");
        String urlString = new Scanner(System.in).nextLine();
        URL url = new URL(urlString);

        int[] array = getSumAndAverage(url); //index0 --> sum || index1 --> average
        System.out.println("Average --> " + array[1] + "|| sum --> " + array[0]);

    }

    public static int[] getSumAndAverage(URL url) throws IOException {
        Scanner input = new Scanner(url.openStream());
        int numberOfElements = 0;
        int sum = 0;
        while (input.hasNext()) {
            sum += input.nextDouble();
            numberOfElements++;
        }
        return new int[]{sum, (sum / numberOfElements)} ;
    }
}
