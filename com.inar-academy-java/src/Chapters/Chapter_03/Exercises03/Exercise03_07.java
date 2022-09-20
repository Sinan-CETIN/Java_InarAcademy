
import java.util.*;

public class Exercise03_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an amount in int, for example for 11.56 enter 1156: ");
		int amount = input.nextInt();
		int dollar = amount / 100;
		int amountRemaining = amount % 100;
		int quarters =  amountRemaining/ 25;
		amountRemaining  %= 25;
		int dimes =  amountRemaining / 10;
		amountRemaining  %= 10;
		int nickel =  amountRemaining / 5 ;
		amountRemaining %= 5;
		
		if(dollar < 2)
			System.out.println(dollar + " dollar");
		else
			System.out.println(dollar + " dollars");
		if(quarters < 2)
			System.out.println(quarters + " quarter");
		else
			System.out.println(quarters + " quarters");
		if(dimes < 2)
			System.out.println(dimes + " dime");
		else
			System.out.println(dimes + " dimes");
		if(nickel < 2)
			System.out.println(nickel + " nickel");
		else
			System.out.println(nickel + " nickels");
		if(amountRemaining < 2)
			System.out.println(amountRemaining + " penny");
		else
			System.out.println(amountRemaining + " pennies");
	}
}
