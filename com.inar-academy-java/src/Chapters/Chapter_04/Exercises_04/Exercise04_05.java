import java.util.Scanner;

public class Exercise04_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides:");
        double numberOfSides = input.nextDouble();
        System.out.print("Enter the side:");
        double side = input.nextDouble();
        //compute area
        double area = numberOfSides * Math.pow(side , 2) / (4 * Math.tan(Math.PI / numberOfSides));
        System.out.println("The area of the polygon is " + area);

    }
}
