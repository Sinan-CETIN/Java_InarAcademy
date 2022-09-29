package Chapters.Chapter_07.Checkpoint_07;

public class Checkpoint07_08 {
    public static void main(String[] args) {
        //7.26
        System.out.println("to use Arrays.sort(parameter), arrayRefVar must be comparable.\nit doesn't create new array.");

        //7.27
        System.out.println("To use binarySort method in the Arrays class array must be increasing order.\n\n");


        //7.28
        int[] list1 = {2, 4, 7, 10};
        java.util.Arrays.fill(list1, 7);
        System.out.println(java.util.Arrays.toString(list1) + "\n");
        int[] list2 = {2, 4, 7, 10};
        System.out.println(java.util.Arrays.toString(list2));
        System.out.print(java.util.Arrays.equals(list1, list2));

        //7.29
        System.out.println("\n\nThis book declares the main method as\n" +
                "public static void main(String[] args)\n" +
                "Can it be replaced by one of the following lines?\n" +
                "public static void main(String args[]) Yes\n" +
                "public static void main(String[] x) Yes");

    }
}
