import java.util.Scanner;

public class Exercise05_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value:");
        int decimal = input.nextInt();
        String octal = "";
        System.out.print(decimal + " as a binary is ");
        while(decimal != 0){
            octal = (decimal % 8 + "" + octal);
            decimal /= 8;
        }
        System.out.println(octal);
    }
}
