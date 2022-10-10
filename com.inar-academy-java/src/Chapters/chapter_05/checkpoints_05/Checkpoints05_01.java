import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class Checkpoints05_01 {
    public static void main(String[] args) {
        //5.1
        System.out.println("in pointA always true" +
                "\nin pointB sometimes true sometimes false" +
                "\nin pointC always false"
        );

        //5.2
        System.out.println("\nif u initialize guess with 0 and comes 0 from the random method "+
                "code never go for while loop.");
        //5.3
        System.out.println("\nonly the loop in bracet c work and it is:");
        int i = 1;
        while (i < 10)
            if ((i++) % 2 == 0)
                System.out.println(i);

        //5.4
        System.out.println("\nthe output is: 5 ");

        //5.5
        System.out.println("\nit is an infinite loop");

        //5.6
        System.out.println("\n5.6 ) max is 5 \n number is 0");

        //5.7 converting
        System.out.println("Scanner input = new Scanner(System.in);\n" +
                "        int number;\n" +
                "        int sum = 0;\n" +
                "        do{\n" +
                "            sum += number;\n" +
                "            System.out.print(\"Enter an integer (input ends if it is 0)\");\n" +
                "            number = input.nextInt();" +
                "\n        }while(number != 0)");

        //5.8
        int sum1 = 0;
        for (int i1 = 0; i1 < 10; ++i1) {
            sum1 += i1;
        }
        int sum2 = 0 ;
        for (int i1 = 0; i1 < 10; i1++) {
            sum2 += i1;
        }
        System.out.println(sum1 + "    " + sum2);

        //5.9
        for(int i1 = 0; i1 <= 100 ; i1++){
            if(i1 % 10 == 0)
                System.out.println(i1);
            else
                System.out.print(i1 + " ");
        }

        //5.10
        System.out.println("sum is 14 \ncount is 5");

        //5.12
        System.out.println("no");

        //5.13 converting for loop into while then the do while loop

        System.out.println("" +
                "long sum = 0; \nint count = 1;\nwhile(count <= 1000){\n" +
                "   sum += count;\n count++;\n}\nlong sum = 0;\nint count = 0;\ndo{\n"
        + " sum += count;\n count++;\n}while(count <= 1000)");

        //5.14
        int count1 = 0;
        while(count1 < 100) {// lets say n is 100
            count1++;
        }
        System.out.println(count1);//it should be n and in our condition it is 100 since n is 100

        count1 = 1;
        for(count1 = 0; count1 <= 100 ; count1++){}
        System.out.println(count1);




        }
}
