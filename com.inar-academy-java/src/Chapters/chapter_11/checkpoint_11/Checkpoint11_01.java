package Chapters.chapter_11.checkpoint_11;

public class Checkpoint11_01 {
    public static void main(String[] args) {
        System.out.println("True or false ? A subclass is a subset of a superclass. --> False\n" +
                "What keyword do you use to define a subclass. --> extends\n" +
                "What is a single inheritance. --> A java class may inherit directly from only one superclass\n" +
                "What is multiple inheritance --> Deriving a subclass from several classes but java does not allow multiple inheritance.\n");
        System.out.println("11.5 how does a subclass invoke its superclass's constructer --> with super() keywords\n" +
                "True or false? When invoking a constructer from a subclass, its superclass's no-arg constructer is always invoked --> true\n" +
                "11.7 True or false? You can override a private method defined in a superclass. --> False\n" +
                "11.8 True or false? You can override a static method defined in a superclass. True\n" +
                "11.9 How do you explicitly invoke a superclass’s constructor from a subclass? --> super()\n" +
                "11.10 How do you invoke an overridden superclass method from a subclass?\n" +
                "if it is static with SuperClassName.methodName() if not with super.methodName()");
        System.out.println("11.11 --> Report the following errors --> \n" +
                "line this.radius = radius\n" +
                "Line 21 Circle(radius);--> super(radius);\n" +
                "Line 22 length = length --> this.lenght = lenght;" +
                "line 27 should be super.getArea() * lenght otherwise it is a infinite method calling.");
        System.out.println("11.12 Overloading means to define multiple methods with the same name but different signatures.\n" +
                "Overriding means to provide a new implementation for a method in the subclass.");
        System.out.println("11.13 If a method in a subclass has the same signature as a method in its superclass with the\n" +
                "same return type, is the method overridden or overloaded? --> overridden");
        System.out.println("11.14 If a method in a subclass has the same signature as a method in its superclass with a\n" +
                "different return type, will this be a problem? Yes");
        System.out.println("11.15 If a method in a subclass has the same name as a method in its superclass with different\n" +
                "parameter types, is the method overridden or overloaded? --> overloaded ");
        System.out.println("11.16 What is the benefit of using the @Override annotation? --> prevent errors.");
        System.out.println("11.17 What is polymorphism? What is dynamic binding?\n\t\t" +
                "Polymorphism means that a variable of a supertype can refer to a subtype object.\n" +
                "\t\tBinding --> A method can be implemented in several classes along the inheritance chain. The JVM\n" +
                "\t\tdecides which method is invoked at runtime.");
        System.out.println("11.18 Describe the difference between method matching and method binding.\n\t\t" +
                "Matching a method signature and binding a method implementation are two separate\n" +
                "\t\tissues. The declared type of the reference variable decides which method to match at compile\n" +
                "\t\ttime. The compiler finds a matching method according to the parameter type, number of\n" +
                "\t\tparameters, and order of the parameters at compile time.");
        System.out.println("11.19 Can you assign new int[50], new Integer[50], new String[50], or new\n" +
                "Object[50], into a variable of Object[] type?\n\t\t" +
                "new int[50] cannot be assigned to into a variable of Object[] type since it is primitive type, but new Integer[50],\n\t\t new String[50], or new Object[50] are fine.]");
        System.out.println("On line 8 there is a primitive type array.Primitive type is not a subtype of object class.");
        System.out.println("11.24 Indicate true or false for the following statements:\n" +
                "■ You can always successfully cast an instance of a subclass to a superclass. --> True\n" +
                "■ You can always successfully cast an instance of a superclass to a subclass. --> False");
        System.out.println("a. Assume are circle and object created as follows:\n" +
                "Circle circle = new Circle(1);\n" +
                "GeometricObject object = new GeometricObject();\n" +
                "Are the following Boolean expressions true or false?\n" +
                "(circle instanceof GeometricObject) --> True\n" +
                "(object instanceof GeometricObject) --> True\n" +
                "(circle instanceof Circle) --> True\n" +
                "(object instanceof Circle) --> False\n" +
                "b. Can the following statements be compiled?\n" +
                "Circle circle = new Circle(5);\n" +
                "GeometricObject object = circle; <<YES>>\n" +
                "c. Can the following statements be compiled?\n" +
                "GeometricObject object = new GeometricObject();\n" +
                "Circle circle = (Circle)object;<<NO>> Cause (ClassCastExcpetion)");


        System.out.println("11.26 Suppose that Fruit, Apple, Orange, GoldenDelicious, and McIntosh are\n" +
                "defined in the following inheritance hierarchy:\n" +

                "Assume that the following code is given:\n" +
                "Fruit fruit = new GoldenDelicious();\n" +
                "Orange orange = new Orange();\n" +
                "Answer the following questions:\n" +
                "a. Is fruit instanceof Fruit? <<YES>>\n" +
                "b. Is fruit instanceof Orange? <<NO>>\n" +
                "c. Is fruit instanceof Apple? <<YES>>\n" +
                "d. Is fruit instanceof GoldenDelicious? <<YES>>\n" +
                "e. Is fruit instanceof McIntosh? <<NO>>\n" +
                "f. Is orange instanceof Orange? <<YES>>" +
                "g. Is orange instanceof Fruit? <<YES>>\n" +
                "h. Is orange instanceof Apple? <<NO>>");

        System.out.println("i. Suppose the method makeAppleCider is defined in the Apple class. Can fruit\n" +
                "invoke this method? Can orange invoke this method? --> \nNo. It will give a compile error. However, you can invoke it using ((Apple)fruit).makeAppleCider().");
        System.out.println("j. Suppose the method makeOrangeJuice is defined in the Orange class. Can\n" +
                "orange invoke this method?<<YES>> Can fruit invoke this method?<<NO>>");
    }
}
