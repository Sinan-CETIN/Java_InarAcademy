import java.util.Scanner;
public class Exercise06_06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of line in pattern: ");
        int line = input.nextInt();
        pattern(line);
    }

    public static void pattern(int line){
        for(int i = 1; i <= line; i++){
            //space
            for(int j = line - i ; j > 0; j--){
                System.out.print("  ");
            }
            //numbers
            for(int j = i; j > 0; j--){
                System.out.print(" " + j);
            }
            System.out.println();

        }
    }
}
