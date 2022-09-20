public class Exercise05_25 {
    public static void main(String[] args) {
        double pi = 0;
        int count = 1;
        for(int i = 1; i <= 10000; i += 2, count++){
            if(count % 2 == 0)
                pi -= 1.0 / i;
            else
                pi += 1.0 / i;
        }
        pi *= 4;
        System.out.println("Pi number for 10000: " + pi);

        pi = 0;
        count = 1;
        for(int i = 1; i <= 20000; i += 2, count++){
            if(count % 2 == 0)
                pi -= 1.0 / i;
            else
                pi += 1.0 / i;
        }
        pi *= 4;
        System.out.println("Pi number for 20000: " + pi);

        pi = 0;
        count = 1;
        for(int i = 1; i <= 30000; i += 2, count++){
            if(count % 2 == 0)
                pi -= 1.0 / i;
            else
                pi += 1.0 / i;
        }
        pi *= 4;
        System.out.println("Pi number for 30000: " + pi);
    }
}
