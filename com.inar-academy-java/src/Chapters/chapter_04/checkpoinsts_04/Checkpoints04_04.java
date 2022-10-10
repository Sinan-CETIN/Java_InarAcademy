public class Checkpoints04_04 {
    public static void main(String[] args) {

        //4.23
        System.out.printf("%5d %d", 1, 2);
        System.out.printf("%5d", 1);
        System.out.printf("%5d %f", 1, 2.5);

        //4.24
        System.out.printf("\namount is %f %e\n", 32.32, 32.32);
        System.out.printf("amount is %5.2f%% %5.4e\n", 32.327, 32.32);
        System.out.printf("%6b\n", (1 > 2));
        System.out.printf("%6s\n", "Java");
        System.out.printf("%-6b%s\n", (1 > 2), "Java");
        System.out.printf("%6b%-8s\n", (1 > 2), "Java");
    }
}
