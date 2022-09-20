import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise04_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code:");
        int asciiCode = input.nextInt();
        if(asciiCode < 127 && asciiCode > 0 )
            System.out.println("The character for ASCII code is " + (char)asciiCode);
        else
            System.out.println("Invalid input rerun the program. :(");


    }
}
