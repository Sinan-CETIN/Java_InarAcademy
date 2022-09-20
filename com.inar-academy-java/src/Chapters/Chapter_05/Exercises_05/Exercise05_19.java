public class Exercise05_19 {
    public static void main(String[] args) {
        for(int i = 1; i <=8; i++){
            //blank spaces
            for(int j = 1; j <= 8 - i; j++){
                System.out.printf("%4s"," ");
            }
            for(int j = 0; j < i; j++) {
                int x = (int) Math.pow(2, j);
                System.out.printf("%4d", x);
            }

            for(int j = i - 2; j >= 0 ; j--)
                System.out.printf("%4d",(int)Math.pow(2, j));

            System.out.println();

        }
    }
}
