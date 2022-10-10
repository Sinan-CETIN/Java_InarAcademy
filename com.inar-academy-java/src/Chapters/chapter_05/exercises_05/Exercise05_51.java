import java.util.Scanner;

public class Exercise05_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string1:");
        String s1 = input.nextLine();
        System.out.print("Enter string2:");
        String s2 = input.nextLine();
        String prefix = "";
        boolean hasPrefix = true;

        for(int i = 0; i < s1.length() && i < s2.length() && hasPrefix; i++) {

            if (s1.charAt(i) == s2.charAt(i))
                prefix += s1.charAt(i);
            else
                hasPrefix = false;
        }

        if(prefix.length() != 0)
            System.out.println("The common prefix is " + prefix);
        else
            System.out.println(s1 + " and " + s2 + " have no common prefix");


    }
}
