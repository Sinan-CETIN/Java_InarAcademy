package Chapters.Chapter_07.Checkpoint_06;

public class Checkpoint07_01 {
    public static void main(String[] args) {
        //7.1
        System.out.println("arrayRefVar[] arrayName  // that is for declaring an array.");
        System.out.println(("arrayRefVar[] arrayName = new arrayRefVar[length];"));

        //7.2
        System.out.println("\nUnlike declarations for primitive data type variables, the declaration of an array variable does\n" +
                "not allocate any space in memory for the array. It creates only a storage location for the reference\n" +
                "to an array.The memory is allocated when an array is created.");

        //7.3

        int x = 30;
        int[] numbers = new int[x];
        x = 60;
        System.out.println("\nx is " + x);
        System.out.println("The size of numbers is " + numbers.length);

        //7.4
        System.out.println("\n■ Every element in an array has the same type. (True)\n" +
                "■ The array size is fixed after an array reference variable is declared. (False)\n" +
                "■ The array size is fixed after it is created. (True)\n" +
                "■ The elements in an array must be a primitive data type. (False)");

        //7.5
        System.out.println("\nint i = new int(30);  invalid\n" +
                "double d[] = new double[30];   valid\n" +
                "char[] r = new char(1..30);    invalid\n" +
                "int i[] = (3, 4, 3, 2);    invalid\n" +
                "float f[] = {2.3, 4.5, 6.6};   valid\n" +
                "char[] c = new char(); invalid");

        //7.6
        System.out.println("\nHow do you access elements in an array? wiht its index." );

        //7.7
        System.out.println("\nWhat is the array index type? int\n" +
                " What is the lowest index? 0 " +
                "What is the representation of the third element in an array named a? a[2]");
        //7.8

        System.out.println("Write statements to do the following:\n" +
                "a. Create an array to hold 10 double values.\n" +
                "b. Assign the value 5.5 to the last element in the array.\n" +
                "c. Display the sum of the first two elements.\n" +
                "d. Write a loop that computes the sum of all elements in the array.\n" +
                "e. Write a loop that finds the minimum element in the array.\n" +
                "f. Randomly generate an index and display the element of this index in the array.\n" +
                "g. Use an array initializer to create another array with the initial values 3.5, 5.5,");

        double[] array = new double[10];
        System.out.println(array[0] + " " + array[1]);
        for (int i = 0; i < array.length - 1; i++) {
            array[i] =Math.random() * 100;
        }
        array[9] = 5.5;


        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum of array is " + sum);

        double min = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.2f  ", array[i]);
        }
        System.out.println("Min element in the array is " + array[minIndex] + " and index is " + minIndex);
        System.out.println(array[(int)(Math.random() * array.length)]);

        double[] array1 = {3.5, 5.5};
        System.out.println(array1[0] + " and " + array1[1]);

        //7.9
        System.out.println("\nA runtime exception ArrayIndexOutOfBounds occurs.");

        //7.10
        System.out.println("1 public class Test {\n" +
                "2 public static void main(String[] args) {\n" +
                "3 double[//here must be nothing] r; should create array here to use later. = new double[length]\n" +
                "4\n" +
                "5 for (int i = 0; i < r.length(); i++);\n" +
                "6 r(i) = Math.random * 100;  //must be like follow r[1i] = Math.random();\n" +
                "7 }\n" +
                "8 }");

    }
}
