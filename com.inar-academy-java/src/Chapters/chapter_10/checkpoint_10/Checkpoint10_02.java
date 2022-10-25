package Chapters.chapter_10.checkpoint_10;

import java.math.BigDecimal;

public class Checkpoint10_02 {
    public static void main(String[] args) {
        System.out.println("10.7 Describe primitive-type wrapper classes.\n" +
                "10.07 --> You can use primitive type as a reference type with the help of wrapper class.\n" +
                "Every primitive type has a special wrapper class.you can process primitive data type values as objects/n" +
                "Most wrapper class names for a primitive type are the same as the primitive data type\n" +
                "name with the first letter capitalized. The exceptions are Integer and Character.");
        System.out.println("Integer i = new Integer(\"23\");\n" + new Integer("23") +
                "\nInteger i = new Integer(23);\n" + new Integer(23) +
                "\nInteger i = Integer.valueOf(\"23\");\n" + Integer.valueOf("23") +
                "\nInteger i = Integer.parseInt(\"23\", 8);\n" + Integer.parseInt("23") +
                "\nDouble d = new Double(); --> can not be compiled by javac\n" +
                "\nDouble d = Double.valueOf(\"23.45\");\n" + Double.valueOf("23.45") +
                "\nint i = (Integer.valueOf(\"23\")).intValue();\n" + Integer.valueOf("23").intValue() +
                "\ndouble d = (Double.valueOf(\"23.4\")).doubleValue();\n" + Double.valueOf("23.4").doubleValue() +
                "\nint i = (Double.valueOf(\"23.4\")).intValue();\n" + Double.valueOf("23.4").intValue() +
                "\nString s = (Double.valueOf(\"23.4\")).toString();" + Double.valueOf("23.4").toString());

        System.out.println("\n\n10.9 How do you convert an integer into a string? How do you convert a numeric string\n" +
                "into an integer? How do you convert a double number into a string? How do you\n" +
                "convert a numeric string into a double value?");
        System.out.println("10.09 --> Strint number = 1 + \"\"; \n" +
        "int number = Integer.parseInt(numericString);\n" +
                "double number = Double.parseDouble(numericString) ;");

        Integer x = new Integer(3);
        System.out.println("10.14 -- > ");
        System.out.println(x.intValue());
        System.out.println(x.compareTo(new Integer(4)));
        System.out.println("\n10.15");
        System.out.println(Integer.parseInt("10"));
        System.out.println(Integer.parseInt("10", 10));
        System.out.println(Integer.parseInt("10", 16));
        System.out.println(Integer.parseInt("11"));
        System.out.println(Integer.parseInt("11", 10));
        System.out.println(Integer.parseInt("11", 16));


        System.out.println("\n\n10.12 \nWhat are autoboxing and autounboxing? Are the following statements correct?\n" +
                "a. Integer x = 3 + new Integer(5); True\n" +
                "b. Integer x = 3;  True\n" +
                "c. Double x = 3; False -->  this is like double x = 3;\n" +
                "d. Double x = 3.0; True\n" +
                "e. int x = new Integer(3); True\n" +
                "f. int x = new Integer(3) + new Integer(4); True");

        System.out.println("Double x = 3.5;\n" +
                "System.out.println(x.intValue());\n" +
                "System.out.println(x.compareTo(4.5));");
        Double k = 3.5;
        System.out.println(k.intValue());
        System.out.println(k.compareTo(4.5));

        BigDecimal a = new BigDecimal(1.0);
        BigDecimal b = new BigDecimal(3);
        BigDecimal c = a.divide(b, 20, BigDecimal.ROUND_UP);
        System.out.println("\n" + c);

    }
}
