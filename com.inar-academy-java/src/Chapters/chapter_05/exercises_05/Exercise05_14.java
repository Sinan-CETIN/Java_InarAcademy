import java.util.Scanner;

public class Exercise05_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n1:");
        int n1 = input.nextInt();
        System.out.print("Enter n2:");
        int n2 = input.nextInt();

        if(n2 > n1){
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        int gcd = 1;
        int k = n2;

        boolean findGcd = true;

        while(n2 > 1 && findGcd){
            if(n1 % k == 0 && n2 % k == 0){
                gcd = k;
                findGcd = false;
            }
            k--;
        }
        System.out.println("Greatest common divisor " + n1 + " and " + n2 + " is " + gcd);
    }
}

