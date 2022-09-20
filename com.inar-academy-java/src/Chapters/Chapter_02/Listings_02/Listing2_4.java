import java.util.Scanner;

public class Listing2_4 {
        public static void main(String[] args) {
                final double PI=3.14159;

                // Create a Scanner Object
                Scanner input=new Scanner(System.in);

                // Prompt User to enter a radius
                System.out.println("Enter a radius:");
                double radius=input.nextDouble();

                // Compute area
                double area=radius * radius * PI;

                // Display area
                System.out.println("The area for the circle of radius "
                + radius + " is " + area);
        }
}
