import java.util.Scanner;

public class Exercise04_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String:");
        String s1 = input.nextLine();
        System.out.println("String length is " + s1.length() + " and first character is " + s1.charAt(0));
    }
}
