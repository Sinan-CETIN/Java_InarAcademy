import java.sql.SQLOutput;
import java.util.Scanner;
public class Exercise04_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer:");
        String isbn = input.next();
        if(isbn.length() != 9){
            System.out.println("Inlalid input.ISBN number has to be 9 digit");
            System.exit(1);
        }
        int d9 = (int)(isbn.charAt(8) - '0');
        int d8 = (int)(isbn.charAt(7) - '0');
        int d7 = (int)(isbn.charAt(6) - '0');
        int d6 = (int)(isbn.charAt(5) - '0');
        int d5 = (int)(isbn.charAt(4) - '0');
        int d4 = (int)(isbn.charAt(3) - '0');
        int d3 = (int)(isbn.charAt(2) - '0');
        int d2 = (int)(isbn.charAt(1) - '0');
        int d1 = (int)(isbn.charAt(0) - '0');

        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);
        if (d10 == 10) {
            System.out.println("X");
        } else {
            System.out.println(d10);
        }

    }
}
