package Chapters.chapter_11.exercise_11.exercise11_17;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        int m = input.nextInt();
        ArrayList<Integer> list = getFactorOfM(m);
        int n = findSmallestN(list);
        System.out.println("The smallest number n for m * n to be a perfect square is " + n + " \nm * n is " + (m * n));
    }

    public static ArrayList<Integer> getFactorOfM(int number) {
        ArrayList<Integer> result = new ArrayList<>();
        int divisor = 2;
        while (number != 1) {

            if (number % divisor == 0) {
                result.add(divisor);
                number /= divisor;
            } else {
                divisor++;
            }
        }
        return result;
    }

    public static int findSmallestN(ArrayList<Integer> list) {
        ArrayList<Integer> oddNumberFactor = new ArrayList<>();
        ArrayList<Integer> checkedFactors = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            int count = 0;
            if (checkedFactors.contains(list.get(i))) continue;

            for (int j = i ; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }

            checkedFactors.add(list.get(i));

            if (count % 2 == 1) {
                oddNumberFactor.add(list.get(i));
            }
        }
      return multiplyAllNumberInArray(oddNumberFactor);
    }

    private static int multiplyAllNumberInArray(ArrayList<Integer> list) {
        int result = 1;
        for (int i = 0; i < list.size(); i++) {
            result *= list.get(i);
        }
        return result;
    }
}
