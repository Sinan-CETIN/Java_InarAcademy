import java.util.Scanner;

public class Exercise05_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n = input.nextInt();
        int divisor = 2;
        String div =n + " factor is ";
        while(n > 1){
            if(n % divisor == 0){
                div +=divisor + " ";
                n /= divisor;
                continue;
            }
            divisor++;
        }
        System.out.println(div);
    }
}
