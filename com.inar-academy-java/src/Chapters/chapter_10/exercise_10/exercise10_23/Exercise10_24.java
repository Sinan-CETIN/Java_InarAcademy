package Chapters.chapter_10.exercise_10.exercise10_23;

public class Exercise10_24 {
    public static void main(String[] args) {
        MyString2 s1 = new MyString2("Sinan4240");
        MyString2 s2 = new MyString2("Kemal ? dafs0");
        MyString2 s3 = new MyString2("Sinan----4240");
        MyString2 s4 = new MyString2("Sinan5240");
        s1.toUpperCase();
        System.out.println(s1.toString());
        char[] chars = s2.toChars();
        System.out.println(chars[0]);
        System.out.println(s1.compare(s4.toString()));
        System.out.println(s1.compare(s3.toString()));
        MyString2 s5 = s4.substring(5);
        System.out.println(s5.toString());
        System.out.println(MyString2.valueOf(s1.compare(s4.toString()) == -1));
        System.out.println(MyString2.valueOf(s1.compare(s4.toString()) == 0));

    }
}
