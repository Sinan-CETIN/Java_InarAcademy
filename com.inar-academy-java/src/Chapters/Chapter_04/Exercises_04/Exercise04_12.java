import java.util.Scanner;

public class Exercise04_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit:");
        String hex = input.next();
        if(hex.length() !=1) {
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }

        char ch = hex.charAt(0);
        int decimal = 0;
        if(ch >= '0' && ch <= '9')
            decimal = (int) (ch - '0');
        else if(ch >= 'A' && ch <= 'F')
            decimal = (int)(ch - 'A' + 10);
        else {
            System.out.println("Invalid Input!");
            System.exit(2);
        }

        int b4 = decimal % 2;
        decimal /= 2;
        int b3 = decimal % 2;
        decimal /= 2;
        int b2 = decimal % 2;
        decimal /= 2;
        int b1 = decimal % 2;
        decimal /= 2;

        System.out.println("The binary value is " + b1 + "" + "" + b2 + "" + b3 + "" + b4 );

    }
}
