public class Checkpoint05_02 {
    public static void main(String[] args) {
        //5.16
        int sum = 0;
        for(int i = 0; sum < 10000 ; i++){
            sum += i;
        }
        System.out.println(sum + "\n");

        System.out.println("Static word is missing \nsemicolon after for loop should erased \n" +
            "\nsemicolon mising in the first println method \nvariable sum should be declared \nj should be declared \n semicolon after if statement should be erased\n" +
                "semicolon after while loop should be erased \n missing semicolon after do while");
        //5.18
        System.out.println("in a situation after while statement missing semicolon and in situation b semicolon after for loop should be erased");

        //5.19
        int count = 0;
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < i; j++)
                System.out.println(++count + " )" + (i * j));

    }
}
