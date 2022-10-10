import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Exercise04_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the sides:");
        double sides = input.nextDouble();
        double area = 6 * Math.pow(sides , 2) / (4 * Math.tan(Math.PI / 6));
        System.out.println("The area of the hexagon is " + ((int)(area * 100) / 100.0));
    }
}
