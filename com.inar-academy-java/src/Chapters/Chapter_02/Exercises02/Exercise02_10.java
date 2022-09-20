import java.util.Scanner ;

public class Exercise02_10 {
        public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of water in kilograms: ");
		double kilo = input.nextDouble();
	        System.out.print("Enter the initial temperature:");
		double temperature = input.nextDouble();
		System.out.print("Enter the final temperature: ");
		double temperature2 =  input.nextDouble();
		double energy = kilo * (temperature2 -temperature) *4184;
		 System.out.println("The energy needed is " + energy);
	}
}
