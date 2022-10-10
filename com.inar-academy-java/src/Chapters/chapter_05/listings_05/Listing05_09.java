import java.util.Scanner;

public class Listing05_09 {
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //Prompt user to enter two integers
        System.out.print("Enter first integer:");
        int n1 = input.nextInt();
        System.out.print("Enter second Integer:");
        int n2 = input.nextInt();

        int gcd = 1;
        int k = 2;
        while(k <= n1 && k <= n2){
            if(n1 % k == 0 && n2 % k == 0)
                gcd = k; //update gcd
            k++;
        }

        System.out.println("The greatest common diviser for " + n1 + " and " + n2
        + " is " + gcd);
    }
}
