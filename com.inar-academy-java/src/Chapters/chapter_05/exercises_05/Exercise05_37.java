import java.util.Scanner;

public class Exercise05_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value:");
        int decimal = input.nextInt();
        String binary = "";
        System.out.print(decimal + " as a binary is ");
        while(decimal != 0){
            binary = (decimal % 2 + "" + binary);
            decimal /= 2;
        }
        System.out.println(binary);

    }
}
