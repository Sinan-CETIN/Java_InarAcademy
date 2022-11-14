package Chapters.chapter_12.checkpoint_12;

public class Checkpoint12_01 {
    public static void main(String[] args) {
        System.out.println("12.1 What is the advantage of using exception handling?" +
                "\n12.01 --> When an exception occur System automatically end itself.But user might want to \n" +
                "handle with the exception.In this scenario it is helpful to use try and catch block");
        System.out.println("12.2 Which of the following statements will throw an exception?\n" +
                "System.out.println(1 / 0);ArithmeticException\")\n" +
                "System.out.println(1.0 / 0); --> it is acceptable");
        System.out.println("12.3 Point out the problem in the following code. Does the code throw any exceptions?\n" +
                "long value = Long.MAX_VALUE + 1;\n" +
                "System.out.println(value);" +
                "\n12.03 --> No.After the statement variable value points Long.MIN value.");

        System.out.println("12.4 What does the JVM do when an exception occurs? How do you catch an exception?\n" +
                "\t\t12.04 --> it ends the program.\n" +
                "\t\tWith try - catch blocks.\n");

        System.out.println("12.5 What is the output of the following code?\n" +
                "public class Test {\n" +
                "public static void main(String[] args) {\n" +
                "try {\n" +
                "\tint value = 30;\n" +
                "\tif (value < 40)\n" +
                "\t\tthrow new Exception(\"value is too small\");\n" +
                "\t}\n" +
                "catch (Exception ex) {\n" +
                "\tSystem.out.println(ex.getMessage());\n" +
                "}\n" +
                "System.out.println(\"Continue after the catch block\");\n" +
                "}\n" +
                "}\n" +
                "12.05--> \n\t\tvalue is too small\n\t\tContinue after the catch block\n" );
        System.out.println("12.6 Show the output of the following code.\n" +
                "12.06A --> 0 1\n" +
                "12.06B --> 0 \n");

        System.out.println("12.7 Describe the Java Throwable class, its subclasses, and the types of exceptions.\n" +
                "12.07 --> The Throwable class is the root of exception classes. All Java exception classes inherit\n" +
                "directly or indirectly from Throwable.\n");
        System.out.println("12.8 What RuntimeException will the following programs throw, if any?\n" +
                "\t12.08 A --> ArithmeticException\n" +
                "\t12.08 B --> IndexOutOfBoundsException\n" +
                "\t12.08 C --> IndexOutOfBoundsException\n" +
                "\t12.08 D --> .ClassCastException\n" +
                "\t12.08 E --> NullPointerException\n" +
                "\t12.08 F --> will not throw an exception\n");
        System.out.println("12.9 What is the purpose of declaring exceptions?\n\tEvery method must state the types of\n" +
                "checked exceptions it might throw. This is known as declaring exceptions.\n" +
                "How do you declare an exception, and where?\n\tTo declare an exception in a method, use the throws keyword in the method header.\n" +
                "Can you declare multiple exceptions in a method header?\n\tYes\n");

        System.out.println("12.10 What is a checked exception, and what is an unchecked exception?\n" +
                "\t\t Checked Exception --> You must declare such kind of exception because JVM does not know what kind of exception program can face.\n" +
                "\t\t Unchecked Exception --> You don't have to declare this kind of exception.Java automaticly detect unchecked exception.\n\t\t\t" +
                "A checked exception must be explicitly declared in the method declaration, if a method throws it.\n\t\t\tA checked exception must be caught in a try-catch block. \n\t\t\tAn unchecked exception does not need to be declared and does not need to be caught. \n\t\t\tIn Java, the only unchecked exceptions are RuntimeException and Error and their subclasses.\n");

        System.out.println("12.11 How do you throw an exception? Can you throw multiple exceptions in one throw statement?\n" +
                "The keyword to declare an exception is throws, and the keyword to throw an exception is throw.\n" +
                "No,You cannot throw multiple exceptions in a single throw statement.\n");
        System.out.println("12.12 What is the keyword throw used for? What is the keyword throws used for?\n" +
                "\tthrow used for throw and exception\n" +
                "\tthrows used for declare an exception\n");
        System.out.println("12.13 Suppose that statement2 causes an exception in the following try-catch block:\n" +
                "\ttry {\n" +
                "\t\tstatement1;\n" +
                "\t\tstatement2;\n" +
                "\t\tstatement3;\n" +
                "\t}\n" +
                "catch (Exception1 ex1) {\n" +
                "}\n" +
                "catch (Exception2 ex2) {\n" +
                "}\n" +
                "statement4;\n" +
                "Answer the following questions:\n" +
                "■ Will statement3 be executed? --> No\n" +
                "■ If the exception is not caught, will statement4 be executed? --> NO (???)\n" +
                "■ If the exception is caught in the catch block, will statement4 be executed? --> Yes");

        System.out.println("12.14 What is displayed when the following program is run? --> RunTimeException\n");
        System.out.println("12.15 What is displayed when running the following program? --> ArithmeticException\n");
        System.out.println("12.16 What is displayed when the following program is run?" +
                "\n\t1-->RuntimeException in method()" +
                "\n\t2-->After the method call\n");
        System.out.println("12.17 What does the method getMessage() do? --> Returns the message that describes this exception object.\n");
        /*

12.20 Correct a compile error in the following code:*/
        System.out.println("12.18 What does the method printStackTrace() do? --> Returns the concatenation of three strings: (1) the full name of the exception\n" +
                "class; (2) \":\" (a colon and a space); (3) the getMessage() method.\n");
        System.out.println("12.19 Does the presence of a try-catch block impose overhead when no exception occurs? --> No\n");
        System.out.println("12.20 Correct a compile error in the following code: --> Declare exception and handle exception.\n");
        System.out.println("try {\n" +
                "statement1;\n" +
                "statement2;\n" +
                "statement3;\n" +
                "}\n" +
                "catch (Exception1 ex1) {\n" +
                "}\n" +
                "finally {\n" +
                "statement4;\n" +
                "}\n" +
                "statement5;\n" +
                "Answer the following questions:\n" +
                "■ If no exception occurs, will statement4 be executed, and will statement5 be\n" +
                "executed? --> Yes\n" +
                "■ If the exception is of type Exception1, will statement4 be executed, --> Yes \nand will" +
                "statement5 be executed? --> Yes\n" +
                "■ If the exception is not of type Exception1, will statement4 be executed,--> Yes \nand" +
                "will statement5 be executed? --> No");

    }
}
