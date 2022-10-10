public class Checkpoints04_03 {
    public static void main(String[] args) {

        String s1 = "Welcome to Java";
        String s2 = "Programming is fun";
        String s3 = "Welcome to Java";

        System.out.println("s1:" + s1 +  "\ns2:" + s2 + "\ns3:" + s3);

        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s2 == s3 " + (s2 == s3));
        System.out.println("s1.equals(s2) " + (s1.equals(s2)));
        System.out.println("s1.equals(s3) " + (s1.equals(s3)));
        System.out.println("s1.compareTo(s2) " + (s1.compareTo(s2)));
        System.out.println("s2.compareTo(s3) " + (s2.compareTo(s3)));
        System.out.println("s2.compareTo(s2) " + (s2.compareTo(s2)));
        System.out.println("s1.charAt(0) " + (s1.charAt(0)));
        System.out.println("s1.indexOf('j') " + (s1.indexOf('j')));
        System.out.println("s1.indexOf(\"to\") " + (s1.indexOf("to")));
        System.out.println("s1.lastIndexOf('a') " +(s1.lastIndexOf('a')));
        System.out.println("s1.lastIndexOf(\"o\", 15) " + (s1.lastIndexOf("o", 15)));
        System.out.println("s1.length() " + (s1.length()));
        System.out.println("s1.substring(5) " + (s1.substring(5)));
        System.out.println("s1.substring(5, 11) " + (s1.substring(5, 11)));
        System.out.println("s1.startsWith(\"Wel\") " + (s1.startsWith("Wel")));
        System.out.println("s1.endsWith(\"Java\") " + (s1.endsWith("Java")));
        System.out.println("s1.toLowerCase() " + (s1.toLowerCase()));
        System.out.println("s1.toUpperCase() " + (s1.toUpperCase()));
        System.out.println("s1.concat(s2) " + (s1.concat(s2)));
        System.out.println("s1.contains(s2) " + (s1.contains(s2)));
        System.out.println("\"\\t Wel \\t\".trim() " + ("\t Wel \t".trim()));

        //4.17
        System.out.println("\n\nIncorrect expressions for string is \n String s3 = s1 - s2;"
        + " \n2)s1 >= s2;\n3)char c = s1(0);");

        //4.18
        System.out.println("\n\n" + 1 + "Welcome " + 1 + 1);
        System.out.println(1 + "Welcome " + (1 + 1));
        System.out.println(1 + "Welcome " + ('\u0001' + 1));
        System.out.println(1 + "Welcome " + 'a' + 1);

        //4.19
        String ss1 = "Welcome";
        String ss2 = "welcome";
        boolean isEqual = ss1.equals(ss2);
        boolean isEqualWithIgnoringCase = (ss1.equalsIgnoreCase(ss2));
        int compare = ss1.compareTo(ss2);
        boolean prefix = ss1.startsWith("AAA");
        boolean suffix = ss1.endsWith("AAA");
        System.out.println(isEqual + "\n" + isEqualWithIgnoringCase + "\n" + compare +
                "\n"+ prefix + "\n" + suffix);

        int len = ss1.length();
        System.out.println("\n" + len);
        char ch1 = ss1.charAt(0);
        System.out.println("\n" + ch1);

        String ss3 = ss1 + ss2 ; // or ss3 = ss1.concat(ss2);

        System.out.println(ss1.substring(1));
        System.out.println(ss1.substring(1, 4));
        System.out.println(ss1.toLowerCase());
        System.out.println(ss1.toUpperCase());
        System.out.println(ss1.trim());

    }
}
