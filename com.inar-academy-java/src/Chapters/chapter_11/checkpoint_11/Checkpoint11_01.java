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
        System.out.println("11.27 What is wrong in the following code? \n\t\t--> on line 8 Causes a runtime ClassCastingException. ");
        System.out.println("11.28 Does every object have a toString method and an equals method?<<YES>> Where do they\n" +
                "come from? <<From Object Class>> How are they used? refVar.equals(Object o) Is it appropriate to override these methods?<<YES>>");
        System.out.println("11.29 When overriding the equals method, a common mistake is mistyping its signature\n" +
                "in the subclass. For example, the equals method is incorrectly written as\n" +
                "equals(Circle circle), as shown in (a) in following the code; instead, it should\n" +
                "be equals(Object circle), as shown in (b). Show the output of running class\n" +
                "Test with the Circle class in (a) and in (b), respectively.\n\t\t" +
                "a)");

        System.out.println("11.30 How do you do the following?\n" +
                "a. Create an ArrayList for storing double values? --> ArrayList<Double> list = new ArrayList<>();\n" +
                "b. Append an object to a list? list.add(elementType element)\n" +
                "c. Insert an object at the beginning of a list?list.set(0,element)" +
                "d. Find the number of objects in a list? list.size()\n" +
                "e. Remove a given object from a list? list.remove(element)\n" +
                "f. Remove the last object from the list? list.remove(list.size() - 1)\n" +
                "g. Check whether a given object is in a list? list.contains(element)\n" +
                "h. Retrieve an object at a specified index from a list? list.get(index)");

        System.out.println("11.31 Identify the errors in the following code.\n" +
                "ArrayList<String> list = new ArrayList<>();\n" +
                "list.add(\"Denver\");\n" +
                "list.add(\"Austin\");\n" +
                "list.add(new java.util.Date());--> list's element's type is String so that you cannot add Date type object to this list\n" +
                "String city = list.get(0);\n" +
                "list.set(3, \"Dallas\"); --> There is no element in index 3.So this statement wrong.\n" +
                "System.out.println(list.get(3)); list size 2 so index is out of bound");

        System.out.println("11.32 Suppose the ArrayList list contains {\"Dallas\", \"Dallas\", \"Houston\",\n" +
                "\"Dallas\"}. What is the list after invoking list.remove(\"Dallas\") one time? --> {\"Dallas\",\"Houston\", \"Dallas\"}\n" +
                "Does the following code correctly remove all elements with value \"Dallas\" from\n" +
                "the list? If not, correct the code.\n" +
                "for (int i = 0; i < list.size(); i++)\n" +
                "list.remove(\"Dallas\");" +
                "No since every dallas removed from the list effect the list size.Correct code should be" +
                "\nfor(int i = 0; i < list.size(): i++) { " +
                "\n\tif(list.remove(\"Dallas\")) { " +
                        "\n\t\ti--;" +
                        "\n\t}" +
                        "\n}");

        System.out.println("11.33 Explain why the following code displays [1, 3] rather than [2, 3].\n" +
                "ArrayList<Integer> list = new ArrayList<>();\n" +
                "list.add(1);\n" +
                "list.add(2);\n" +
                "list.add(3);\n" +
                "list.remove(1);\n" +
                "System.out.println(list);--> The method used here remove the element in index 1\n");

        System.out.println("11.34 Explain why the following code is wrong.\n" +
                "ArrayList<Double> list = new ArrayList<>();\n" +
                "list.add(1); --> We need to add a double value.");

        System.out.println("11.35 Correct errors in the following statements:\n" +
                "int[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};\n" +
                "ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array)); --> To use as list array must be reference type");
        System.out.println("11.36 Correct errors in the following statements:\n" +
                "int[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};\n" +
                "System.out.println(java.util.Collections.max(array));To use max method in collection array must be ArrayList!");
        System.out.println("11.37 What modifier should you use on a class so that a class in the same package can\n" +
                "access it, but a class in a different package cannot access it? <<default visibility modifier>>");
        System.out.println("11.38 What modifier should you use so that a class in a different package cannot access the\n" +
                "class, but its subclasses in any package can access it?<<protected visibility modifier>>");
        System.out.println("11.39 In the following code, the classes A and B are in the same package. If the question\n" +
                "marks in (a) are replaced by blanks, can class B be compiled?<<YES>>If the question marks\n" +
                "are replaced by private, can class B be compiled?<<NO>> If the question marks are replaced\n" +
                "by protected, can class B be compiled?<<YES>>\n");
        System.out.println("11.40 In the following code, the classes A and B are in different packages. If the question\n" +
                "marks in (a) are replaced by blanks, can class B be compiled?<<NO>> If the question marks\n" +
                "are replaced by private, can class B be compiled?<<NO>> If the question marks are replaced\n" +
                "by protected, can class B be compiled?<<YES>>\n");
        System.out.println("11.41 How do you prevent a class from being extended? How do you prevent a method from\n" +
                "being overridden? --> With final keyword\n");

        System.out.println("11.42 Indicate true or false for the following statements:\n" +
                "a. A protected datum or method can be accessed by any class in the same package.<<TRUE>>\n" +
                "b. A protected datum or method can be accessed by any class in different packages.<<FALSE>>\n" +
                "c. A protected datum or method can be accessed by its subclasses in any package.<<TRUE>>\n" +
                "d. A final class can have instances.<<TRUE>>\n" +
                "e. A final class can be extended.<<FALSE>>\n" +
                "f. A final method can be overridden.<<FALSE>>");
    }
}
