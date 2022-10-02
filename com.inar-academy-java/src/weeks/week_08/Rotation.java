package weeks.week_08;

import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string 1 : ");
        String s1 = input.nextLine();
        System.out.print("Enter string 2 : ");
        String s2 = input.nextLine();

        if (isRotation(s1, s2)) {
            System.out.println(s2 + " is rotation of " + s1);
        } else {
            System.out.println(s2 + " is not rotation of " + s2);
        }

    }

    public static boolean isRotation(String s1, String s2)  {
        if (s1.length() != s2.length())
            return false;

        for (int i = 1; i < s1.length(); i++) {
            String s3 = rotate(s1,i);
            if (s3.compareTo(s2) == 0)
                return true;
        }
        return false;
    }

    public static String rotate(String s1, int index) {
        String result = "";
        for (int i = index; i < s1.length(); i++) {
            result += s1.charAt(i);
        }

        for(int i = 0 ; i < index; i++) {
            result += s1.charAt(i);
        }
        return result;
    }
}

