public class Exercise05_18 {
    public static void main(String[] args) {
        //Pattern A
        System.out.println("Pattern A");
        for(int i = 1; i <= 6; i++){
            for(int a = 1; a <= i; a++)
                System.out.print(a + " ");
            System.out.println();
        }
        System.out.println();

        //Pattern B
        System.out.println("Pattern B");
        for(int i = 6; i >= 1; i--){
            for(int j = 1; j <= i; j ++)
                System.out.print(j + " ");
            System.out.println();
        }
        System.out.println();
        //Pattern C
        System.out.println("Pattern C");
        for(int i = 1; i <= 6; i++){
            //Blank space

            for(int j = 1; j <= (6 - i); j++)
                System.out.print("  ");

            //numbers

            for(int j = i; j >= 1 ; j--)
                System.out.print(j + " ");
            System.out.println();
        }
        System.out.println();

        //Pattern D

        System.out.println("Pattern D");
        for(int i = 1; i <= 6; i++){
            //blank spaces
            for (int j = 1; j < i; j++)
                System.out.print("  ");

            //numbers
            for(int j = 1; j <= 7 - i; j++)
                System.out.print(j + " ");


            System.out.println();
        }
    }
}
