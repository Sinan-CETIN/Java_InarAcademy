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
                "12.05--> \n\t\tvalue is too small\n\t\tContinue after the catch block\n");
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

        System.out.println("12.22 The following method checks whether a string is a numeric string: --> TRUE.\n" +
                "check(token) ? return true : false;\n");
        System.out.println("12.23 Suppose that statement2 causes an exception in the following statement:\n" +
                "try {\n" +
                "statement1;\n" +
                "statement2;\n" +
                "statement3;\n" +
                "}\n" +
                "catch (Exception1 ex1) {\n" +
                "}\n" +
                "catch (Exception2 ex2) {\n" +
                "throw ex2;\n" +
                "}\n" +
                "finally {\n" +
                "statement4;\n" +
                "}\n" +
                "statement5;\n" +
                "Answer the following questions:\n" +
                "■ If no exception occurs, will statement4 be executed --> Yes, \nand will statement5 be executed? --> Yes\n" +
                "■ If the exception is of type Exception1, will statement4 be executed --> YEs, \nand will statement5 be executed? --> YES\n" +
                "■ If the exception is of type Exception2, will statement4 be executed--> YES, \nand will statement5 be executed? --> NO\n" +
                "■ If the exception is not Exception1 nor Exception2, will statement4 be executed,--> YES and will statement5 be executed? --> NO\n");
        System.out.println("12.24 What would be the output if line 16 is replaced by the following line?" +
                "\njava.lang.Exception: New info from method1\n" +
                "\tat Chapters.chapter_12.listing_12.Listing12_09.method1(Listing12_09.java:16)\n" +
                "\tat Chapters.chapter_12.listing_12.Listing12_09.main(Listing12_09.java:6)");
        System.out.println("12.25 How do you define a custom exception class? --> CustomExceptionClassName  extends Exception or a subclass of Exception.\n");
        System.out.println("\tException in method()\n" +
                "\tException in main\n");
        System.out.println("12.27 What is wrong about creating a File object using the following statement?\n" +
                "new File(\"c:\\book\\test.dat\"); --> need to use \\\\ character ");
        System.out.println("12.28 How do you check whether a file already exists?\n\t -> file.exists()\n\tHow do you delete a file? How do" +
                "you rename a file? \n\t --> renameTo(dest: File): boolean  \nCan you find the file size (the number of bytes) using the File" +
                "class?\n\t --> YES \nHow do you create a directory?\n\t --> new File(pathname: String)");
        System.out.println("12.29 Can you use the File class for I/O? --> No \nDoes creating a File object create a file on the disk? --> No\n");
        System.out.println("12.30 How do you create a PrintWriter to write data to a file?\n\t --> PrintWriter output = new PrintWriter(new File(filename)\n" +
                "What is the reason to declare throws Exception in the main method in Listing 12.13, WriteData.java?\n\t--> Invoking the constructor of PrintWriter may throw an I/O exception. Java forces you to write\n" +
                "the code to deal with this type of exception.\n" +
                "What would happen if the close() method were not invoked in Listing 12.13?\n\t--> If this method is not invoked," +
                "the data may not be saved properly in the file.\n");
        System.out.println("12.31 Show the contents of the file temp.txt after the following program is executed.\n" +
                "\namount is 32.320000 3.232000e+01\n" +
                "amount is 32.3200 3.2320e+01\n" +
                " false\n" +
                "  Java\n");
        System.out.println("12.33 How do you create a Scanner to read data from a file? " +
                "\n\t--> new Scanner(filename);" +
                "\nWhat is the reason to define throws Exception in the main method in Listing 12.15, ReadData.java? " +
                "\n\tInvoking the constructor new Scanner(File) may throw an I/O exception, so the main\n" +
                "method declares throws Exception in line 4.\n" +
                " What would happen if the close() method were not invoked in Listing 12.15?\n\t" +
                "It is not necessary to close the input file (line 22), but it is a good practice to do so to release\n" +
                "the resources occupied by the file.\n");
        System.out.println("12.35 Is the line separator the same on all platforms? What is the line separator on Windows?\n\t" +
                "--> No. Line separator is \\r and \\n on Windows\n");
        System.out.println("12.36 Suppose you enter 45 57.8 789, then press the Enter key. Show the contents of the\n" +
                "variables after the following code is executed.\n" +
                "Scanner input = new Scanner(System.in);\n" +
                "int intValue = input.nextInt(); --> 45\n" +
                "double doubleValue = input.nextDouble(); --> 57.8\n" +
                "String line = input.nextLine(); --> \"\" + 7 + 8 + 9\n");

        System.out.println("12.37 Suppose you enter 45, press the Enter key, 57.8, press the Enter key, 789, and press\n" +
                "the Enter key. Show the contents of the variables after the following code is executed.\n" +
                "Scanner input = new Scanner(System.in);\n" +
                "int intValue = input.nextInt(); --> 45\n" +
                "double doubleValue = input.nextDouble(); --> 57.8\n" +
                "String line = input.nextLine(); --> line is empty\n");

        System.out.println("12.38 How do you create a Scanner object for reading text from a URL?\n\t--> Scanner input = new Scanner(new java.net.URL(URLString).openStream();\n");
        System.out.println("12.39 Before a URL is added to listOfPendingURLs, line 25 checks whether it has been traversed.\n" +
                " Is it possible that listOfPendingURLs contains duplicate URLs?\n\t--> Yes " +
                "\nIf so, give an example.\n\t-->Possible. Suppose link1 is not in listOfTraversedURLs,\n\t but it appears more than one time in a page. Duplicate link1 \n\twill be added into listOfPendingURLs.");

    }
}
