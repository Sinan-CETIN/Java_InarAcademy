package Chapters.chapter_10.checkpoint_10;

public class Checkpoint10_04 {
    public static void main(String[] args) {
        System.out.println("10.26 --> The StringBuilder class, introduced in JDK 1.5," +
                " \nis similar to StringBuffer except that the update methods in StringBuffer are synchronized.");

        System.out.println("10.27 How do you create a string builder from a string? How do you return a string from a\n" +
                "string builder?");
        System.out.println("String s1 = \"sianfasd\";");
        System.out.println("StringBuilder stringBuilder = new StringBuilder(\"Sinan\");\n" +
                "        String sinan = stringBuilder.toString();");
        String s1 = "dsamgkladsmklsdmgas";
        String s2 = "dsaSADGmgkladADGDAsmklsdmgas";
        String s3 = "dsamgkGSDladsmklsdmgas";
        String s4 = "dsam51635613165gkladsmklsdmgas";
        StringBuilder stringBuilder1 = new StringBuilder(s1);
        System.out.println(s1);
        s1 = stringBuilder1.delete(4, 10).toString();
        System.out.println(s1);

        StringBuilder stringBuilder2 = new StringBuilder(s2);
        System.out.println(s2);
        s2 = stringBuilder2.delete(4, 10).toString();
        System.out.println(s2);

        StringBuilder stringBuilder3 = new StringBuilder(s3);
        System.out.println(s3);
        s3 = stringBuilder3.delete(4, 10).toString();
        System.out.println(s3);

        StringBuilder stringBuilder4 = new StringBuilder(s4);
        System.out.println(s4);
        s4 = stringBuilder4.delete(4, 10).toString();
        System.out.println(s4 + "\n");
        System.out.println("10.30 --> String internal storage for character is char[], StringBuilder internal storage for character is String object.\n");
        StringBuilder s5 = new StringBuilder("Java");
        StringBuilder s6 = new StringBuilder("HTML");
        s5.append("is Fun!");
        System.out.println(s5);
        s5.append(s6);
        System.out.println(s5);
        s5.insert(2, "is Fun!");
        System.out.println(s5);
        s5.insert(2, s6);
        System.out.println(s5);
        System.out.println(s5.charAt(5));
        System.out.println(s5.length());
        s5.deleteCharAt(5);
        System.out.println(s5);
        s5.delete(1, 3);
        s5.reverse();
        System.out.println(s5);
        s5.replace(1, 3, "Computer");
        System.out.println(s5);
        String s = s5.substring(1, 3);
        System.out.println(s);
        s = s5.substring(1, 5);
        System.out.println(s);




    }
}
