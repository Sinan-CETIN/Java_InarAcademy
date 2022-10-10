public class Exercise05_03 {
    public static void main(String[] args) {
        //print header
        System.out.printf("%-15s%-15s", "Kilograms", "Pounds");
        System.out.println();

        for (int i = 1; i < 200; i += 2) {
            System.out.printf("%-15d%-15.1f", i, (i * 2.2));
            System.out.println();
        }
    }
}

