import java.util.Scanner;

public class Exercise03_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three-digit integer: ");
		int number = input.nextInt();
		
		int digit1 = number / 100;
		int digit3 = number % 10;
		
		System.out.println(number + " is " + ((digit1 == digit3) ? "a" : "not a") + " polindrome");
	}

}
