import java.util.Scanner;

public class Exercise04_26 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount:");
        String amount = input.next();
        int n = amount.indexOf('.');
        String s1 = amount.substring(0 , n);
        String s2 = amount.substring(n + 1);

        if(s2.length() != 2){
            System.out.println("Invalid input.After dot,it has to be 2 numbers");
            System.exit(1);
        }

        System.out.print("Your amount " + amount + " consist of" +
                "\n    " + s1 + ((s1.length() == 1) ? " dollar" : " dollars"));

        int cent = ((int)(s2.charAt(0) - '0') * 10) +(int)(s2.charAt(1) - '0');
        int numberOfQuarters = cent / 25;
        cent %= 25;
        int numberOfDimes = cent / 10;
        cent %= 10;
        int numberOfNickels = cent / 5;
        cent %= 5;

        System.out.println("\n    "+ numberOfQuarters + (numberOfQuarters > 1  ? " quarters" : " quarter") +
                "\n    " + numberOfDimes + (numberOfDimes > 1  ? " dimes" : " dime") +
                "\n    " + numberOfNickels + (numberOfNickels > 1 ? " nickels" : " nickel") +
                "\n    " + cent + (cent > 1 ? " pennies" : " penny"));
    }
}

