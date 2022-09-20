import java.util.Scanner;

public class Exercise04_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter:");
        String s = input.next();

        if(s.length()!=1) {
            System.out.println("Invalid input");
            System.exit(1);
        }

        String s1 = s.toLowerCase();

        if(!(s1.charAt(0) >= 'a' &&  s1.charAt(0) <= 'z')) {
            System.out.println("Invalid Input");
            System.exit(2);
        }
        else {
            if (s1.charAt(0) == 'a' || s1.charAt(0) == 'e' || s1.charAt(0) == 'o'
                    || s1.charAt(0) == 'i' || s1.charAt(0) == 'u')
                System.out.println(s + " is a vowel");
            else
                System.out.println(s + " is a consonant");
        }
    }
}
