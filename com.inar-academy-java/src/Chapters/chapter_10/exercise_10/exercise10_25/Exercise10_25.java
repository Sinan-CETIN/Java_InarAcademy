package Chapters.chapter_10.exercise_10.exercise10_25;

public class Exercise10_25 {
    public static void main(String[] args) {
        String s = "ab?b?gf#e";
        String regex = "[?#]";
        String[] splittedString = split(s, regex);
        display(splittedString);
        System.out.println();
        String[] splittedString1 = split("ab#12#453", "#");
        display(splittedString1);
        System.out.println();
        String[] splittedString2 = split("?>ab#12#??>>453?", "[#?>]");
        display(splittedString2);



    }

    public static String[] split(String s, String regex) {

        if (regex.charAt(0) != '[' && regex.charAt(regex.length() - 1) != ']') {
            regex = '[' + regex + ']';
        }

        int numberOfLength = findNumberOfLength(s, regex);
        String[] result = new String[numberOfLength];
        fillResult(result, s, regex);
        return result;
    }

    public static int findNumberOfLength(String s, String regex) {
        int firstIndex = -1;
        int lastIndex = -1;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isRegex(s.charAt(i), regex)) {
                if (i == 0) {
                    lastIndex = i;
                    count++;
                    continue;
                } else {
                    firstIndex = lastIndex;
                    lastIndex = i;
                }
                if (lastIndex - firstIndex == 1) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }

    public static boolean isRegex(char ch, String regex) {
        for (int i = 1; i < regex.length() - 1; i++) {
            if (ch == regex.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static void fillResult(String[] result, String s, String regex) {
        int firstIndex = -1;
        int lastIndex = -1;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isRegex(s.charAt(i), regex)) {
                if (i == 0) {
                    result[count++] = s.charAt(i) + "";
                    lastIndex = i;
                    continue;
                } else {
                    firstIndex = lastIndex;
                    lastIndex = i;
                }
                if (lastIndex - firstIndex == 1) {
                    result[count++] = s.charAt(i) + "";
                } else {
                    String s1 = s.substring(firstIndex + 1, lastIndex);
                    result[count++] = s1;
                    result[count++] = s.charAt(i) + "";
                }
            }
        }
    }

    public static void display(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
