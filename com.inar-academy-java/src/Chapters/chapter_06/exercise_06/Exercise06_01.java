public class Exercise06_01 {
    public static void main(String[] args) {
        final int NUMBER_OF_PENTAGONAL = 100;
        final int NUMBER_PER_LINE = 10;
        for (int i = 1; i <= NUMBER_OF_PENTAGONAL; i++) {
            if (i % NUMBER_PER_LINE == 0) {
                System.out.println(getPentagonal(i));
            } else {
                System.out.print(getPentagonal(i) + " ");
            }
        }
    }

    public static int getPentagonal(int i) {
        return i * (3 * i - 1) / 2;
    }
}
