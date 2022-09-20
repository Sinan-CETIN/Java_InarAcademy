public class Exercise05_26 {
    public static void main(String[] args) {
        double e = 1;
        for(int i = 1; i <= 10000; i++){
            double divisor = 1;

            for(int j = i; j > 0; j--)
                divisor *= (double)j;
            e += 1.0 / divisor;
        }
        System.out.println("e for 10000: " + e);

        double e2 = 1;
        for(int i = 1; i <= 20000; i++){
            double divisor = 1;

            for(int j = i; j > 0; j--)
                divisor *= (double)j;

            e2 += 1 / divisor;
        }
        System.out.println("e for 20000: " + e2);

        double e3 = 1;
        for(int i = 1; i <= 30000; i++){
            double divisor = 1;

            for(int j = i; j > 0; j--)
                divisor *= (double)j;

            e3 += 1 / divisor;
        }
        System.out.println("e for 30000: " + e3);
    }
}
