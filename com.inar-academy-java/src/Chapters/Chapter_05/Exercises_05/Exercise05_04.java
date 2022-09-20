public class Exercise05_04 {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s", "Miles", "Kilometers");
        System.out.println();
        for(int i = 1; i <= 10; i++){
            System.out.printf("%-15d%-15.3f", i, (i * 1.609));
            System.out.println();
        }
    }
}
