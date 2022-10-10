import java.util.Scanner;

public class Exercise05_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int line = input.nextInt();
        for(int i = 1 ; i <= line; i++){
            //blank spaces
            for(int j = line; j >= i; j--)
                System.out.print("  ");
            // first triangle
            for(int k = i ; k >= 1; k--)
                System.out.print(k + " ");
            //second triangle
            for(int j = 2; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
