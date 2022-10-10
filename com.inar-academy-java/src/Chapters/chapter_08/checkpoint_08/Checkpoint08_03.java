
package Chapters.chapter_08.checkpoint_08;

public class Checkpoint08_03 {
    public static void main(String[] args) {
        System.out.println("8.8 ---->");
        int[][][] array = createArray(4, 6, 5);
        display(array);

        System.out.println("\n8.9 ---->");
        int [][][] x = new int[12][5][2]; // in book assignment have mistyping
        System.out.println(x.length);
        System.out.println(x[2].length);
        System.out.println(x[0][0].length);
        System.out.println("Number of elements in x array is ---> " + (x.length * x[0].length * x[0][0].length));

        System.out.println("\n8.10 ---->");
        int[][][] array1= {{{1, 2}, {3, 4}}, {{5, 6},{7, 8}}};
        System.out.println(array1[0][0][0]);
        System.out.println(array1[1][1][1]);

    }
    
    public static int[][][] createArray(int i1, int j1, int k2) {
        int[][][] result = new int[i1][j1][k2];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                for (int k = 0; k < result[i][j].length; k++) {
                    result[i][j][k] = (int)(Math.random() * 120);
                }
            }
        }
        return result;
    }

    public static void display(int[][][] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("{");
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.printf("%3d ", array[i][j][k]);
                }
                System.out.print("} ");
            }
            if (i == array.length -1)
            System.out.println("}}");
            else
                System.out.println("}");
        }
        System.out.println();
    }
}
