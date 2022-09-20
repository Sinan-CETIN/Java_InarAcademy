
public class Listing05_08_SecondEdition {
    public static void main(String[] args) {
        //initialize sum
        double sum = 0;

        //add 0.01 , 0.02 .. and so on  .. 0.99 , 1.0

        for(double i = 0.01 ; i <= 1.0; i += 0.01)
            sum += i;

        System.out.println("The sum is " + sum);


    }
}
