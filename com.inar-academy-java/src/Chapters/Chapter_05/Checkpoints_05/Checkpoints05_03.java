
public class Checkpoints05_03 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            int j = 0;
            while (j < i) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
        }
        int i = 0;
        while (i < 5) {
            for (int j = i; j > 1; j--)
                System.out.print(j + " ");
            System.out.println("****");
            i++;
        }
        System.out.println();
        int i1 = 5;
        while (i1 >= 1) {
            int num = 1;
            for (int j = 1; j <= i1; j++) {
                System.out.print(num + "xxx");
                num *= 2;
            }
            System.out.println();
            i1--;
        }

        System.out.println();

        int i2 = 1;
        do {
            int num = 1;
            for (int j = 1; j <= i2; j++) {
                System.out.print(num + "G");
                num += 2;
            }
            System.out.println();
            i2++;
        } while (i2 <= 5);
    }
}
