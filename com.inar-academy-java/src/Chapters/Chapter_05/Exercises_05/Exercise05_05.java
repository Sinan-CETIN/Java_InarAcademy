public class Exercise05_05 {
    public static void main(String[] args) {
        System.out.printf("%-15s%-6s    |    %-15s%8s", "Kilograms", "Pounds", "Pounds","Kilograms");
        System.out.println();
        for(int kilo = 1, pound = 20; kilo < 200 || pound <516; kilo += 2, pound += 5){
            System.out.printf("%-15d%6.1f    |    %-15d%8.2f", kilo, (kilo * 2.2), pound, (pound / 2.2));
            System.out.println();
        }
    }
}
