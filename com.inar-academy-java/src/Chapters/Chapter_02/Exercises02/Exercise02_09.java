import java.util.Scanner ;

public class Exercise02_09 {
	public static void main(String[] args){
		 Scanner input = new Scanner(System.in);
	 	 System.out.print("Enter v0, v1, and t: ");
		 double v1 = input.nextDouble();
		 double v2 = input.nextDouble();
		 double time = input.nextDouble();
		 double acceleration = (v2 - v1) / time ;
		 System.out.println("The average acceleration is " + acceleration);
	}
}




