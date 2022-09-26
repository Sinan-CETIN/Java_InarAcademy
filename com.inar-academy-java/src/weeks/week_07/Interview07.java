package weeks.week_07;

import java.util.Scanner;

public class Interview07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = input.nextLine();
        if (isUnique(s)) {
            System.out.println(s + " is a unique string");
        } else {
            System.out.println(s + " is not a unique string");
        }
    }

    public static boolean isUnique(String s) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length() - 1; i++) {// tarik
            for (int j = i + 1; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j))
                    return false;
            }
        }
        return true;
    }
}
