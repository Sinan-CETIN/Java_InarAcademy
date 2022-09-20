public class Exercise05_23 {
    public static void main(String[] args) {
        double n1 = 0;
        double n2 = 0;

        for(int i = 1; i <=5000 ; i++)
            n1 += 1.0/ i;
         //right to left
        System.out.println("Result of right to left calculation:" + n1);

        for(int i = 5000; i >= 1 ; i--)
            n2 += 1.0 / i;
        //left to right
        System.out.println("Result of left to right calculation:" + n2);
    }
}
