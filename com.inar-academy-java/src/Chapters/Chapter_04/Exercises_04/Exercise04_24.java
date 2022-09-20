import java.util.Scanner;

public class Exercise04_24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city:");
        String c1 = input.nextLine();
        System.out.print("Enter the second city:");
        String c2 = input.nextLine();
        System.out.print("Enter the third city:");
        String c3 = input.nextLine();
        System.out.print("The three cities in alphabetical order are ");

        if ((c1.compareTo(c2) < 0) && (c1.compareTo(c3) < 0)) {
            System.out.print(c1 + " ");
            if (c2.compareTo(c3) < 0)
                System.out.print(c2 + " " + c3);
            else
                System.out.print(c3 + " " + c2);
        }
        else if(c2.compareTo(c1) < 0 && c2.compareTo(c3) < 0) {
            System.out.print(c2 + " ");
            if (c1.compareTo(c3) < 0)
                System.out.print(c1 + " " + c3);
            else
                System.out.print(c3 + " " + c1);
        }
        else {
            System.out.print(c3 + " ");
            if (c1.compareTo(c2) < 0)
                System.out.print(c1 + " " + c2);
            else
                System.out.print(c2 + " " + c1);
        }
    }
}
