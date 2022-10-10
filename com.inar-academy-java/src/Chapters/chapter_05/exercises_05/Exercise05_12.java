public class Exercise05_12 {
    public static void main(String[] args){
        int n = 2;
        while(Math.pow(n, 2) < 12000){
            n++;
        }
        System.out.println("The smallest integer n such that n2 is greater than 12,000 is " +
                n + " and " + Math.pow(n, 2));
    }
}
