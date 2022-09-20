import  java.util.Scanner;

public class Listing06_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();
        System.out.println(" The Greatest common diviser for " + n1 + " and " + n2 + " is " + getGcd(n1, n2));
    }

    public static int getGcd(int n1, int n2){
        int gcd = 1;
        for(int i = 2; i <= n1  && i < n2; i++)
            if(n1 % i == 0 && n2 % i == 0)
                gcd = i;
        return gcd;


        /**        book solution
         *         int k = 2;
         *
         *         while(k < n1 && k < n2){
         *             if(n1 % k == 0 && n2 % k == 0){
         *                 gcd = k;
         *             }
         *             k++;
         */
    }
}
