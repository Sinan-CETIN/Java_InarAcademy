import java.util.Scanner;

public class Exercise05_47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string:");
        String isbn = input.next();
        while(isbn.length() != 12){
            System.out.print("Invalid input.Re-enter isbn:");
            isbn = input.next();
        }
        int sum = 0;
        for(int i = 0; i < isbn.length(); i++){
            if(i % 2 != 0)
                sum += 3 * (isbn.charAt(i) - '0');
            else
                sum += (isbn.charAt(i) - '0');
        }

        int digit13 =10 - (sum % 10);

        if(digit13 == 10)
            digit13 = 0;

        System.out.println("The ISBN-13 number is " + isbn + digit13);

    }
}
