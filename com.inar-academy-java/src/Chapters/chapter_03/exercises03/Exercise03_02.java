import java.util.Scanner;

public class Exercise03_02 {

        public static void main(String[] args) {
        	
        	int number1 = (int)(Math.random() * 9) + 1;
        	int number2 = (int)(Math.random() * 9) + 1;
        	int number3 = (int)(Math.random() * 9) + 1;

        	Scanner input = new Scanner(System.in);

        	System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? " );
        	int result = input.nextInt();
    	
        	if(result == (number1 + number2 + number3))
                System.out.println("Correct answer.");
        	else
            System.out.println(number1 + " + " + number2 + " + " + number3 + " is " + (number1 + number2 + number3));
    
       }
        
        	
}
       
       
