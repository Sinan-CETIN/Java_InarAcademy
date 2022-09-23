package Chapters.chapter_06.Exercise_06;


import java.util.Scanner;

public class Exercise06_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = input.nextLine();

        for (int i = 0; i < s1.length(); i++){
            int x = getNumber(s1.charAt(i));
            if (x == 1)
                System.out.print(s1.charAt(i));
            else
                System.out.print(x);
        }
    }

    public static int getNumber(char ch)  {
        char ch1 = Character.toUpperCase(ch);

        if(ch1 >= 'W')
            return 9;
        else if (ch1 >= 'T')
            return 8;
        else if (ch1 >= 'P')
            return 7;
        else if (ch1 >= 'M')
            return 6;
        else if (ch1 >= 'J')
            return 5;
        //gd
        else if (ch1 >= 'G')
            return 4;
        else if (ch1 >= 'D')
            return 3;
        else if(ch1 >= 'A')
            return 2;
        else
            return 1;

    }
}
