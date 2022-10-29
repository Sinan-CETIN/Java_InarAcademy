package Chapters.chapter_10.checkpoint_10;

public class Test {
    private String text;
    public Test(String s) {
        //String text = s; changed to next assignmed to solve nullPointerException
        this.text = s;
    }
    public static void main(String[] args) {
        System.out.println("10.22 -- >   //String text = s; changed to next assigned to solve nullPointerException");
        Test test = new Test("ABC");
        System.out.println(test.text.toLowerCase());
        System.out.println();
        System.out.println("10.23 --> Test method has not a constructer.");
        System.out.println("Hi, ABC, good".matches("ABC "));
        System.out.println("Hi, ABC, good".matches(".*ABC.*"));
        System.out.println("A,B;C".replaceAll(",;", "#"));
        System.out.println("A,B;C".replaceAll("[,;]", "#"));
        String[] tokens = "A,B;C".split("[,;]");
        for (int i = 0; i < tokens.length; i++)
            System.out.print(tokens[i] + " ");
    }
}