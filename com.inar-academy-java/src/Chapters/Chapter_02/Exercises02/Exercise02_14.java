import java.util.Scanner ;

public class Exercise02_14 {
        public static void main(String[] args){
                Scanner input = new Scanner(System.in);
                System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		System.out.print("Enter height in inches:");
		double height = input.nextDouble();
		double weightInKilograms = weight * 0.45359237;
		double heightInMeter = height * 0.0254;
		double IBM = weightInKilograms / Math.pow(heightInMeter , 2);
		 System.out.println("BMI is " + IBM);
	}
}

