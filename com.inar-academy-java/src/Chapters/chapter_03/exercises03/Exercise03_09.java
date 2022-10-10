
import java.util.Scanner;

public class Exercise03_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer:");
		int digit = input.nextInt();
		
		int d9 = digit % 10;
		digit /= 10;
		int d8 = digit % 10;
		digit /= 10;
		int d7 = digit % 10;
		digit /= 10;
		int d6 = digit % 10;
		digit /= 10;
		int d5 = digit % 10;
		digit /= 10;
		int d4 = digit % 10;
		digit /= 10;
		int d3 = digit % 10;
		digit /= 10;
		int d2 = digit % 10;
		digit /= 10;
		int d1 = digit % 10;
		digit /= 10;
		
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		
		System.out.print("The ISBN-10 number is " + d1 + "" + d2 + ""+  d3 + "" +  d4 + "" + d5 + "" + d6 + "" + d7 + "" +d8 + "" + d9);
		if(d10 == 10)
			System.out.println("X");
		else
			System.out.println(d10);
		
	
	
	
	}
	

}
