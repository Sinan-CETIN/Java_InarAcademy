import java.util.Scanner;

public class Exercise05_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year:");
        int year = input.nextInt();
        System.out.print("Enter the first day of th year(1 for monday 2 for 2 tuesday):");
        int day = input.nextInt();
        int m = 0;

        for(int i = 1; i <= 12; i++){
            switch(i){
                case 1: System.out.print("1 january ," + year +" is");break;
                case 2: m = 31;
                    System.out.print("1 February ," + year + " is");break;
                case 3: m = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) ? 29 : 28;;
                    System.out.print("1 March ," + year + " is");break;
                case 4 : m = 31;
                    System.out.print("1 April ," + year + " is");break;
                case 5 : m = 30;
                    System.out.print("1 May ," + year + " is");break;
                case 6 : m = 31;
                    System.out.print("1 June ," + year + " is");break;
                case 7 : m = 30;
                    System.out.print("1 July ," + year + " is");break;
                case 8 : m = 31;
                    System.out.print("1 August ," + year + " is");break;
                case 9 : m = 31;
                    System.out.print("1 September ," + year + " is");break;
                case 10 : m = 30;
                    System.out.print("1 October ," + year + " is");break;
                case 11 : m = 31;
                    System.out.print("1 November ," + year + " is");break;
                case 12 : m = 30;
                    System.out.print("1 December ," + year + " is");break;
            }
            day = (day + m) % 7;
            if(day == 7)day = 0;

            switch(day){
                case 1 :
                    System.out.println(" Monday");break;
                case 2 :
                    System.out.println(" Tuesday");break;
                case 3 :
                    System.out.println(" Wednesday");break;
                case 4 :
                    System.out.println(" Thursday");break;
                case 5 :
                    System.out.println(" Friday");break;
                case 6 :
                    System.out.println(" Saturday");break;
                case 0 :
                    System.out.println(" Sunday");break;
            }
        }
    }

}

