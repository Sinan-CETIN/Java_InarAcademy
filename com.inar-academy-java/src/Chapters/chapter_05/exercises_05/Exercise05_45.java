 import java.util.Scanner;
public class Exercise05_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        double mean = 0;
        double deviation = 0;
        System.out.print("Enter 10 integers :");
        while(count < 10){
            double n = input.nextDouble();
            mean += n;
            deviation += Math.pow(n ,2);
            count++;
        }
        deviation = Math.sqrt((deviation - (Math.pow(mean, 2) / 10)) / 9);
        mean /= 10;
        System.out.println("The mean is " + mean);
        System.out.println("The standart deviation is " + deviation);
    }
}
