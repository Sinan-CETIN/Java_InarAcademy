import  java.util.Scanner;

public class Exercise05_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year:");
        int year = input.nextInt();
        System.out.print("Enter the first day of th year(1 for monday 2 for 2 tuesday):");
        int day = input.nextInt();
        int m = 0;
        int m1 = 0;

        for(int i = 1; i <= 12; i++){
            String header = "";
            switch(i){
                case 1 :m1 = 0; m = 31; header = "                January " + year;break;
                case 2 :m1 = 31; m = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) ? 29 : 28;
                header = "                February " + year;break;
                case 3 :m1 = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) ? 29 : 28; m = 31;header = "                March " +year;break;
                case 4 :m1 = 31;m = 30;header = "                April " +year;break;
                case 5 :m1 = 30; m = 31;header = "                May " +year;break;
                case 6 :m1 = 31; m = 30;header = "                June " +year;break;
                case 7 :m1 = 30; m = 31;header = "                July " +year;break;
                case 8 :m1 = 31; m = 31;header = "                August " +year;break;
                case 9 :m1 = 31; m = 30;header = "                September " +year;break;
                case 10 :m1 = 30; m = 31;header = "                October " +year;break;
                case 11 :m1 = 31; m = 30;header = "                November " +year;break;
                case 12 :m1 = 30; m = 31;header = "                December " +year;break;
            }
            if(i != 0)
                day = (day + m1) % 7;
            System.out.println(header + "\n------------------------------------------");
            System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");

            for(int j = 0; j < day; j++)
                System.out.printf("%6s","");

            for(int j = 1; j <= m; j++){
                if((day + j)  % 7 == 0)
                    System.out.println(j);
                else
                    System.out.printf("%-6d", j);
            }
            System.out.println("\n");
        }
    }

}