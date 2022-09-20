public class Exercise05_06 {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s    |    %-15s%-8s", "Miles", "Kilometers", "Kilometers","Miles");
        System.out.println();
        for(int miles = 1, kilometer = 20; miles <=10 || kilometer <=65; miles++, kilometer += 5){
            System.out.printf("%-15d%-15.3f    |    %-15d%-8.3f", miles , (miles * 1.609), kilometer, (kilometer / 1.609)   );
            System.out.println();
         }
    }
}
