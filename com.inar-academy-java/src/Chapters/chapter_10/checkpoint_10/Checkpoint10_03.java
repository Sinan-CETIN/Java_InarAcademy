package Chapters.chapter_10.checkpoint_10;

public class Checkpoint10_03 {
    public static void main(String[] args) {
        System.out.println("10.14 -- > ");
        java.math.BigInteger x = new java.math.BigInteger("3");
        java.math.BigInteger y = new java.math.BigInteger("7");
        java.math.BigInteger z = x.add(y);
        System.out.println("x is " + x);
        System.out.println("y is " + y);
        System.out.println("z is " + z);

        String s1 = "Welcome to Java";
        String s2 = s1;
        String s3 = new String("Welcome to Java");
        String s4 = "Welcome to Java";
        System.out.println("10.15 --> \n ");
        System.out.println((s1 == s2) + "\n " +
                (s1 == s3));
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println("Welcome to Java".replace("Java", "HTML"));
        System.out.println(s1.replace('o', 'T'));
        System.out.println(s1.replaceAll("o", "T"));
        s1.replaceFirst("o", "T");
        char[] ch = s1.toCharArray();
        System.out.println(ch);

        String s5 = "Welcome to Java";
        String s6 = s1.replace("o", "abc");
        System.out.println(s5);
        System.out.println(s6);
        System.out.println("10.18 Let s1 be \"Welcome\" and s2 be \"welcome\". Write the code for the following\n" +
                "statements:\n" +
                "a. Replace all occurrences of the character e with E in s1 and assign the new\n" +
                "to s2.\n" +
                "b. Split Welcome to Java and HTML into an array tokens delimited by a\n" +
                "and assign the first two tokens into s1 and s2.");
        String s7 = "Welccome";
        String s8 = "welcome";
        s8 = s7.replaceAll("c", "E");
        System.out.println(s8);
        String[] stringArr = "Welcome to Java and HTML".split(" ");
        for (int i = 0; i < stringArr.length; i++) {
            System.out.println(stringArr[i]);
        }
        System.out.println("10.19 Does any method in the String class change the contents of the string? -- > NO");
        String s10 = new String();
        System.out.println("10.20 Suppose string s is created using new String(); what is s.length()? -- > " + s10.length());

        System.out.println("10.21 How do you convert a char, an array of characters, or a number to a string? -- > String s = String.valueOf(char or char array or number)");
        System.out.println();
    }
}
