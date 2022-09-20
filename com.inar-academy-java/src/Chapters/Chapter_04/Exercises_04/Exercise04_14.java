import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise04_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade:");
        String gradeString = input.next();
        if(gradeString.length() != 1){
            System.out.println("You must enter only one character.");
            System.exit(1);
        }
        if(gradeString.toUpperCase().charAt(0) <= 'A' && gradeString.toUpperCase().charAt(0) >= 'F'){
            System.out.println("Invalid input");
            System.exit(2);
        }
        int grade = 4 - (gradeString.toUpperCase().charAt(0) - 'A');
        System.out.println("The numeric value for grade " + gradeString.toUpperCase().charAt(0) + " is " +
                grade);


    }
}
