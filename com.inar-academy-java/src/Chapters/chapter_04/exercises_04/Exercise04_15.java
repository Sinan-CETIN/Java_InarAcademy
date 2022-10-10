import java.util.Scanner;

public class Exercise04_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter:");
        String letter = input.next();

        if(letter.length() != 1 && !Character.isLetter(letter.charAt(0))){
            System.out.println("Invalid input!");
            System.exit(1);
        }
        if(letter.toUpperCase().charAt(0) >= 'W')
            System.out.println("The corresponding number is " + 9);
        else if(letter.toUpperCase().charAt(0) >= 'T')
            System.out.println("The corresponding number is " + 8);
        else if(letter.toUpperCase().charAt(0) >= 'P')
            System.out.println("The corresponding number is " + 7);
        else if(letter.toUpperCase().charAt(0) >= 'M')
            System.out.println("The corresponding number is " + 6);
        else if(letter.toUpperCase().charAt(0) >= 'J')
            System.out.println("The corresponding number is " + 5);
        else if(letter.toUpperCase().charAt(0) >= 'G')
            System.out.println("The corresponding number is " + 4);
        else if(letter.toUpperCase().charAt(0) >= 'D')
            System.out.println("The corresponding number is " + 3);
        else
            System.out.println("The corresponding number is " + 2);


    }
}
