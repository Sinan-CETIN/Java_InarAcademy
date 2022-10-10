package Chapters.chapter_07.checkpoint_07;

public class Checkpoint07_04 {
    public static void main(String[] args) {
        //7.16
        System.out.println("True or false? When an array is passed to a method, a new array is created and passed\n" +
                "to the method. False");

        //7.17
        System.out.println("\nA)");
        int number = 0;
        int[] numbers = new int[1];
        m(number, numbers);
        System.out.println("number is " + number
                + " and numbers[0] is " + numbers[0]);

        System.out.println("\n\nB)");
        int[] list = {1, 2, 3, 4, 5};
        reverse(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");


    }
    public static void m(int x, int[] y) {
        x = 3;
        y[0] = 3;
    }

    public static void reverse(int[] list) {
        int[] newList = new int[list.length];
        for (int i = 0; i < list.length; i++)
            newList[i] = list[list.length - 1 - i];
        list = newList;
    }
}
