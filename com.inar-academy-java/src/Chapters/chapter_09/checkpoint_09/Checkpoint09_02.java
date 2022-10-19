package Chapters.chapter_09.checkpoint_09;

public class Checkpoint09_02 {
    public static void main(String[] args) {
        System.out.println("9.5 --> 9.5 What are the differences between constructors and methods? \n" +
        "Constructor is a special method." +
                "\n■A constructor must have the same name as the class itself.\n" +
                "■ Constructors do not have a return type—not even void.\n" +
                "■ Constructors are invoked using the new operator when an object is created.\n" +
                "Constructors play the role of initializing objects.");
        System.out.println();
        System.out.println("When will a class have a default constructor?\n" +
                "A class may be defined without constructors. In this case, a public no-arg constructor with\n" +
                "an empty body is implicitly defined in the class. This constructor, called a default constructor,\n" +
                "is provided automatically only if no constructors are explicitly defined in the class.");
        System.out.println();
        System.out.println("9.7 --> Which operator is used to access a data field or invoke a method from an object?\n" +
                "9.8 --> What is an anonymous object?\n" +
                "9.9 --> What is NullPointerException?\n" +
                "9.10 --> Is an array an object or a primitive type value? Can an array contain elements of an\n" +
                "object type? Describe the default value for the elements of an array.\n" +
                "9.11 --> What is wrong with each of the following programs?");

        System.out.println("9.7 -->  (.) dot operator.\n" +
                "9.8 --> an object without reference variables.\n" +
                "9.9 --> A NullPointerException occurs when a null reference variable is used to access the members of an object.\n " +
                "9.10 --> No. An array can be any type primitive or reference.default value for data types --> false for boolean \n" +
                "0 for numeric primitives /u000 for char null for reference type.\n." +
                "9.11a --> there is no constructur with parameter.we need to use ShowErrors t = new ShowErrors();\n" +
                "9.11b --> t.x(); --> there is no x() method\n" +
                "9.11c -->The program compiles fine, but it has a runtime error because variable c is null when the println statement is executed.\n" +
                "9.11d --> new C(5.0) does not match any constructors in class C. The program has a compilation error because class C does not have a constructor with a double argument.");
        System.out.println();
        System.out.println("9.12 --> The program does not compile because new A() is used in class Test, but class A does not have a default constructor.\n" +
                " See the second NOTE in the Section, \"Constructors.\"");
        System.out.println();
        System.out.println("public class A {\n" +
                "boolean x;\n" +
                "public static void main(String[] args) {\n" +
                "A a = new A();\n" +
                "System.out.println(a.x);\n" +
                "}\n" +
                "}\n" +
                "it shows false.");

    }
}
