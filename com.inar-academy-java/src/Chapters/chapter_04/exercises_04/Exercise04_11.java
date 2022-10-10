import java.util.Scanner;

public class Exercise04_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15):");
        int number = input.nextInt();
        if(number >= 0 && number <= 15) {
            if (number >= 0 && number < 10)
                System.out.println("The hex value is " + number);
            else
                System.out.println("The hex value is " + ((char)('A' + number - 10)));
        }
        else
            System.out.println("Invalid Input.");

    }
}
