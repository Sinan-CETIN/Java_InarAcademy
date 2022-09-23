package Chapters.chapter_06.Exercise_06;

public class Exercise06_12 {
    public static void main(String[] args) {
        printChars('1', 'Z');
        System.out.println("\n-------------\n-------------");
        printChars('Z', '1');
    }

    public static void printChars(char ch1, char ch2) {
        if (ch1 > ch2) {
            char temp = ch1;
            ch1 = ch2;
            ch2 = temp;
        }
        int count = 0;

        for (char i = ch1; i <= ch2; i++) {
            count++;
            if (count % 10 == 0) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
