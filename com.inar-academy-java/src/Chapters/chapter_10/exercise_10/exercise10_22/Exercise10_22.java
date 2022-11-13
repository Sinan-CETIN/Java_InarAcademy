package Chapters.chapter_10.exercise_10.exercise10_22;

public class Exercise10_22 {
    public static void main(String[] args) {
        char[] chars = {'O', ' ', '?', '1', 'i', 's', 'Z', 'x', 'T', 'B', 'a'};
        MyString1 s1 = new MyString1(chars);
        System.out.println(s1);
        chars[0] = 'X';
        System.out.println(s1);
        s1.toLowerCase();
        System.out.println(s1.toString());
        s1 = s1.toLowerCase();
        System.out.println(s1.toString());
        MyString1 s2 = s1.substring(3, 7);
        System.out.println(s2.toString());
        MyString1 s3 = s1.substring(1, s1.length());
        System.out.println(s3.toString());
        chars[2] = 'P';
        System.out.println(s1);
    }
}
