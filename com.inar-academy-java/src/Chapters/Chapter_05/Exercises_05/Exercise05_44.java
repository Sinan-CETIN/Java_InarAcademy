import  java.util.Scanner;

public class Exercise05_44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer:");
        short x = input.nextShort();
        String s = "";
        while(s.length() < 16){
            int number = x % 2;
            s = number + s;
            x /= 2;
        }
        System.out.println("The bits are " + s);

    }
}
