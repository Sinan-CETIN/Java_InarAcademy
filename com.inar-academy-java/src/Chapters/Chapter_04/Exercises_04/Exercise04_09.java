import java.util.Scanner;

public class Exercise04_09{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character:");
        String answer = input.next();
        char ch = answer.charAt(0);

        int asciiCode = (int)ch;
        System.out.println("The Unicode for the character " + ch + " is " +
        asciiCode);



    }
}