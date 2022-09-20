public class Checkpoint06_01 {
    public static void main(String[] args) {
        //6.1

        System.out.println("6.1 Reusable - simple coding - easy to understand.");

        //6.2
        System.out.println("modifiers + return type  + methodName(parameters)");

        //6.3 solved in the Listing06_01
        //6.4
        System.out.println("6.4.1 =  True  && 6.4.2 False");
        //6.5
        System.out.println("Main");
        //6.6
        System.out.println("Gives run-time-error! You can use return in void method but cannot use return x + y such a statement!");
        //6.7
        System.out.println("Parameter : The variables defined in the method header\n"
                + "argument : The value passed to parameter know as actual parameter.\n" +
                "The method name and the parameter list together constitute the METHOD SIGNATURE.");
        //6.8
        System.out.println("public static double commisionRate(double salesAmount, double commisionRate)\n" +
                "public static void printCalender(int year, int month)\n" +
                "public static double sqrt(doublle number)\n" +
                "public static boolean isEven(int number)\n" +
                "public static void printMessage(int time)\n" +
                "public static double monthlyPayment(double loanAmount, int numberOfYear, double annualInterestRate)\n" +
                "public static char toUpperCase(char ch)");
        //6.9
        System.out.println("1 public class Test {\n" +
                "2 public static (int) method1(int n,(int) m) {\n" +
                "3 n += m;\n" +
                "4 (return) method2(3.4);\n" +
                "5 }\n" +
                "6\n" +
                "7 public static int method2((double) n) {\n" +
                "8 if (n > 0) return 1;\n" +
                "9 else if (n == 0) return 0;\n" +
                "10 else() return –1;\n" +
                "11 }\n" +
                "12 }");

        //6.10
        System.out.println("You need to invoke method with local variables.And actual parameter can have the same name with the parameters.");

        //6.11
        System.out.println("\nActual parameter used vice versa.In the method body argument has same name with parameter which is also false.");

        //6.12
        System.out.println("Copied argument's value to method.");

        //6.13
        System.out.println("Pass-by-values in 6.13a are 1, 2 and 0 and result is 0 \n" +
                "\n\nPass-by-values in 6.13b are i and 2 and result are ");
        int i = 1;
        while (i <= 6) {
            method1(i, 2);
            i++;
        }


        System.out.println("Pass-by-values are Welcome to Java! and times");
        int times = 3;
        System.out.println("Before the call,"
                + " variable times is " + times);
        // Invoke nPrintln and display times
        nPrintln("Welcome to Java!", times);
        System.out.println("After the call,"
                + " variable times is " + times);

        System.out.println("\nPass-by-value is i");

        i = 0;
        while (i <= 4) {
            method1(i);
            i++;
        }
        System.out.println("i is " + i);

        System.out.println("Overloading methods have same method name but different parameters," + "\nthat is, have different signature.That is okey having same method name but different signature" +
                "\nIt is not permissible to define two methods in a\n" +
                "class that have identical method names and parameter lists but different return value\n" +
                "types or different modifiers");

        //6.18
        System.out.println("6.18 A local variable is a variable declared inside a method.");

        //6.19
        System.out.println("The scope of a local variable starts from its declaration and continues to the end of the block that contains the variable.");

    }

    public static void method1(int i, int num) {
        for (int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num *= 2;
        }
        System.out.println();
    }

    public static void nPrintln(
            String message, int n) {
        while (n > 0) {
            System.out.println("n = " + n);
            System.out.println(message);
            n--;
        }
    }

    public static void method1(int i) {
        do {
            if (i % 3 != 0)
                System.out.print(i + " ");
            i--;
        }
        while (i >= 1);
        System.out.println();
    }
}


