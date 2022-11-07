package Chapters.chapter_10.exercise_10.exercise10_25;

import static Chapters.chapter_10.exercise_10.exercise10_25.Exercise10_25.checkEnd;
import static Chapters.chapter_10.exercise_10.exercise10_25.Exercise10_25.countRegex;

public class Exercise10_25_2 {
    public static void main(String[] args) {
        String s = "anananana";
        String s1 = "nannnnanna";
        String s2 = "aannn";
        String s3 = "nnnnn";
        String[] split = split(s, "n");
        String[] split1 = split(s1, "n");
        String[] split2 = split(s2, "n");
        String[] split3 = split(s3, "n");


        System.out.println(s);
        display(split);
        System.out.println(s1);
        display(split1);
        System.out.println(s2);
        display(split2);
        System.out.println(s3);
        display(split3);

    }

    public static String[] split(String s, String regex) {
        String[] temp = s.split(regex);
        int numberOfRegex = countRegex(s, regex);
        String[] result;
        String empty = "";

        if (temp[0].equals(empty)) {
            result = new String[temp.length + numberOfRegex - 1];
        } else {
            result = new String[temp.length + numberOfRegex];
        }

        boolean start = false;
        int count = 0;
        if (temp[0].equals(empty)) {
            result[0] = regex;
            start = true;
            count++;
        }


        for (int i = (start ? 1 : 0); i < result.length && count < temp.length; i++) {
            if (count > temp.length) break;
            result[i++] = temp[count++];
            if (i == result.length) break;
            result[i] = regex;
        }
        return result;

    }

    public static void display(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
