import java.util.Scanner;

public class Exercise06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = input.nextInt();
        if(isPalindrome(number)){
            System.out.println(number + " is a palindrome number.");
        }else{
            System.out.println(number + " is not a palindrome number.");
        }
    }

    public static boolean isPalindrome(int num){
        return reverse(num) == num;
    }

    public static int reverse(int num){
       int result = 0;
       while (num > 10){
           result += num % 10;
           num /= 10;
           if (num > 10) {
               result *= 10;
           }
           else{
               result *= 10;
               result += num;
           }
       }
       return result;
    }
}
