import java.util.Scanner;

public class Listing05_09_SecondEdition {
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //Prompt user to enter two integers
        System.out.print("Enter first integer:");
        int n1 = input.nextInt();
        System.out.print("Enter second Integer:");
        int n2 = input.nextInt();

        int gcd = 1;

        for (int k = 2; k <= n1 && k <= n2; k++)
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;

        System.out.println("The greatest common diviser for " + n1 + " and " + n2
                + " is " + gcd);
    }
}
