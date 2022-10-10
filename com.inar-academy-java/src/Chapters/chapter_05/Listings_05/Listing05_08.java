public class Listing05_08 {
    public static void main(String[] args) {
        //initialize sum
        float sum = 0;

        //add 0.01 , 0.02 .. and so on  .. 0.99 , 1.0

        for(float i = 0.01f ; i <= 1.0; i += 0.01f)
            sum += i;

        System.out.println("The sum is " + sum);
    }
}
