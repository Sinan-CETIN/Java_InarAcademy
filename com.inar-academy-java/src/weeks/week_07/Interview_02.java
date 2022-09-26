package weeks.week_07;

import java.util.Scanner;

public class Interview_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string s1 : ");
        String s1 = input.nextLine();
        System.out.print("Enter string s2 : ");
        String s2 = input.nextLine();

        System.out.println(same(s1, s2));
        System.out.println(remove(s1, s2));


    }

    public static String remove(String s1, String s2) {
        String same = same(s1, s2);
        System.out.println(same);

        String result = "";
        for (int i = 0; i < s1.length(); i++) {
            boolean isSame = true;
            for (int j = 0; j < same.length(); j++) {
                if (s1.charAt(i) == same.charAt(j)) {
                    isSame = false;
                    break;
                }
            }
            if (isSame)
                result += s1.charAt(i);
        }
        return result;
    }

    public static String same(String s1, String s2) {
        String result = "";
        for (int i = 0; i < s1.length() ; i++) {
            boolean isHave = false;
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    isHave = true;
                    break;
                }
            }
            if (isHave) {
                result += s1.charAt(i);
            }
        }
        return result;
    }
}

