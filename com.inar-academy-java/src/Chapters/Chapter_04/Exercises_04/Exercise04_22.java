import java.util.Scanner;

public class Exercise04_22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a  string s1:");
        String s1 = input.nextLine();
        System.out.print("Enter a string s2:");
        String s2 = input.nextLine();
        System.out.println(s2 + " is"+(s1.contains(s2) ? " " : " not ") + "substring of " + s1);


    }
}
