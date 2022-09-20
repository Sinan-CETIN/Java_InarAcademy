public class Exercise05_39 {
    public static void main(String[] args) {
        double earn = 0;
        double number = 30000;
        double salary = 5000;

        while(earn + salary <= 30000){
            earn = 5000 * 0.08 + 5 * 0.10 + (number - 10000) * 0.12;
            number += 0.01;
        }
        System.out.printf("\n\nYou'll need to make $%1.2f in sales.", number);
    }
}
