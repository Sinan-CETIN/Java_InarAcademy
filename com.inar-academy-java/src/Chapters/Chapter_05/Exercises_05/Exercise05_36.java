import  java.util.Scanner;

public class Exercise05_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer:");
        String digit = input.next();
        while(digit.length() != 9){
            System.out.print("Invalid input.Re-enter ISBN");
            digit = input.next();
        }
        int sum = 0;
        for(int i = 0; i <= digit.length() - 1; i++){
            int number = digit.charAt(i) - '0';
            sum += number * (i + 1);
            System.out.print(number + "");

        }
        sum %= 11;
        if(sum == 10)
            System.out.println("X");
        else
            System.out.println(sum);

    }
}
