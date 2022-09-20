
public class Exercise05_07 {
    public static void main(String[] args) {
        double tuition = 10_000;
        int year = 1;
        double costAfter10Year = 0;
        do{
            if(year <= 10)
            System.out.printf("year" + year + " tuition is :%.3f \n",tuition);
            tuition = tuition + (tuition * 0.05);
            if(year >=10 && year < 14)
                costAfter10Year += tuition;
            year++;
        }while (year < 14);
        System.out.printf("The total cost of four years’ worth of tuition after the tenth year %.3f",costAfter10Year);
    }
}
