package Chapters.Chapter_07.Checkpoint_07;

public class Checkpoint07_03 {
    public static void main(String[] args) {

        //7.13
        int[] source = {3, 4, 5};
        int[] target = new int[3];
        System.arraycopy(source, 0, target, 0, source.length);
        for (int i = 0; i < target.length; i++) {
            System.out.print(target[i] + " ");
        }

        //7.14
        System.out.println("\nSize cannot be changed in the array after created.\nIf u assign a new array to variableArray it created totally different array");


        printArray(target);

        int x = 1; // x represents an int value
        int[] y = new int[10]; // y represents an array of int values
        m(x, y); // Invoke m with arguments x and y
        System.out.println("\nx is " + x);
        System.out.println("y[0] is " + y[0]);
    }
    public static void m(int number, int[] numbers) {
        number = 1001; // Assign a new value to number
        numbers[0] = 5555; // Assign a new value to numbers[0]
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if((i + 1) %  10 == 0) {
                System.out.println();
            }
        }
    }
}
