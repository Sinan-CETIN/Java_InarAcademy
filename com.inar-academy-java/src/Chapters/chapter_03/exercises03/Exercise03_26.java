import java.util.Scanner;

public class Exercise03_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer:");
		int number = input.nextInt();
		boolean isDivisible10 = (number % 10 == 0);
		boolean isDivisible5 = (number % 5 == 0);
		boolean isDivisible6 = (number % 6 == 0);
		if(isDivisible10)
			System.out.println("Is 10 divisible by 5 and 6? true");
		else
			System.out.println("Is 10 divisible by 5 and 6? true");
		
		if(isDivisible5 && isDivisible6)
			System.out.println("Is 10 divisible by 5 and 6? true");
		else 
			System.out.println("Is 10 divisible by 5 and 6? false");
		
		if(isDivisible5 || isDivisible6)
			System.out.println("Is 10 divisible by 5 or 6? true");
		else
			System.out.println("Is 10 divisible by 5 or 6? false");
		
		if(isDivisible5 ^ isDivisible6)
			System.out.println("Is 10 divisible by 5 or 6, but not both? true");
		else
			System.out.println("Is 10 divisible by 5 or 6, but not both? false");
			

	}

}
