import java.sql.SQLOutput;
import java.util.Scanner;
public class Exercise05_46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string:");
        String s = input.nextLine();
        String reverse = "";
        for(int i = s.length() -1; i >= 0; i--)
            reverse += s.charAt(i);

        System.out.println("Reverse String is " + reverse);

    }
}
