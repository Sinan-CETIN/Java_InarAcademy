package Chapters.chapter_10.exercise_10.exercise10_27;

public class Exercise10_27 {
    public static void main(String[] args) {
        MyStringBuilder1 myStringBuilder1 = new MyStringBuilder1("Sinan");
        MyStringBuilder1 myStringBuilder2 = myStringBuilder1.toLowerCase();
        System.out.println(myStringBuilder1.toString());
        System.out.println(myStringBuilder2.toString());

        myStringBuilder1.append(myStringBuilder2);
        System.out.println(myStringBuilder1);
        System.out.println(myStringBuilder2);
        myStringBuilder1.substring(5,10);
        System.out.println(myStringBuilder1);
        myStringBuilder1.append(4240);
        System.out.println(myStringBuilder1);
        System.out.println(myStringBuilder1.length());
        System.out.println(myStringBuilder1.charAt(6));
    }
}
