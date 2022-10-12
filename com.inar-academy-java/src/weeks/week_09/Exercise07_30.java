package weeks.week_09;

import java.util.Scanner;


public class Exercise07_30 {
    /*(Pattern recognition: consecutive four equal numbers) Write the following
method that tests whether the array has four consecutive numbers with the same
value.
public static boolean isConsecutiveFour(int[] values)
Write a test program that prompts the user to enter a series of integers and displays
if the series contains four consecutive numbers with the same value. Your
program should first prompt the user to enter the input size—i.e., the number of
values in the series. Here are sample runs:
  list 1 --> 1 2 1 2 3 3 3 4 5 6 8 6 4  5 5 5 5
  list 2 --> 1 2 3 4 5 6 7 8 9
  list 3 --> 1 1 1 2 3 2 2 1 2 2
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int numberOfValues = input.nextInt();

        int[] list = createArray(numberOfValues);

        if (isConsecutiveFour(list)) {
            System.out.println("The list has consecutive fours");
        } else {
            System.out.println("The list has no consecutive fours");
        }

    }

    public static int[] createArray(int size) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter values --> ");
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = input.nextInt();
        }
        return result;
    }

    public static boolean isConsecutiveFour(int[] array) {

        // 1 1 2 1 1
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] == array[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count == 4) {
                return true;
            }
        }
        return false;
    }
}
