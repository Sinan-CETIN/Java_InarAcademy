package Chapters.chapter_10.exercise_10.exercise10_25;

public class Exercise10_25 {
    public static void main(String[] args) {
        String s = "Sinan/oasdgm/sadg,asdg/sdgkm  dasfa/sd gasdg/asd g/asfhbafsg ";
        String[] split = split(s, "/");
        System.out.println(s);
        display(split);
        String s2 = "Java dgkjandsg Java sad Java Java sdjg";
        String[] split2 = split(s2, "Java");
        System.out.println(s2);
        display(split2);
        System.out.println(checkEnd("Sinan", "an"));
    }

    public static String[] split(String s, String regex) {

        int numberOfRegexInString = countRegex(s, regex);


        if (numberOfRegexInString == 0) {
            return new String[]{s};
        }

        boolean hasRegexAtTheEnd = checkEnd(s, regex);
        String[] result = new String[(hasRegexAtTheEnd ? numberOfRegexInString * 2 - 1 : numberOfRegexInString * 2)];
        System.out.println(result.length);

        String s1 = "";
        int count = 0;
        int countRegex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (hasRegexIndex(s, regex, i)) {
                countRegex++;
                if (i != 0) {
                    result[count++] = s1;
                    s1 = "";
                }

                String s2 = s.substring(i, i + regex.length());
                i += regex.length() - 1;
                result[count++] = s2;

                continue;
            }
            s1 += s.charAt(i);
            if(countRegex == numberOfRegexInString && i == s.length() - 1) {
                result[count - 1] = s1;
            }

        }
        return result;
    }

    public static int countRegex(String s, String regex) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (hasRegexIndex(s, regex, i)) {
                result++;
            }
        }
        return result;
    }

    public static boolean hasRegexIndex(String s, String regex, int i) {
        if (i + regex.length() > s.length()) return false;
        return s.substring(i, i + regex.length()).equals(regex);
    }

    public static boolean checkEnd(String s, String regex) {
        return s.substring(s.length() - regex.length()).equals(regex);
    }

    public static void display(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }
}

/*
 sina|n| regex == ||
 | i = 4   regex.length() = 4 + 2 = 6   sina|n|.length() = 7
 */

