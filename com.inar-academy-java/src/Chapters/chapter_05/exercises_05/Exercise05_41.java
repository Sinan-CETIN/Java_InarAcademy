import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise05_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number (input end if it is 0):");
        int number = input.nextInt();
        int max = -1;
        int count = 0;
        do{
            if(number == max)
                count++;

            if(number > max){
                max = number;
                count = 1;
            }
            System.out.print("Enter number (input end if it is 0):");
            number = input.nextInt();
        }while(number != 0);
        System.out.println();
        System.out.println("The largest number is " + max);
        System.out.println("The occurence of the largest number is " + count);
    }
}
