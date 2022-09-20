public class Exercise05_13 {
    public static void main(String[] args) {
        int n = 2;
        while(Math.pow(n , 3) < 12000){
            n++;
        }
        System.out.println("The largest integer n such that n3 is less than 12,000 is " + (--n) + "  " + (Math.pow(n, 3)));
    }
}
