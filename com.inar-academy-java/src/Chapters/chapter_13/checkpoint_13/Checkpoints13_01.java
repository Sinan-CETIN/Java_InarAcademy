package Chapters.chapter_13.checkpoint_13;

public class Checkpoints13_01 {
    public static void main(String[] args) {
        System.out.println("13.1 Which of the following classes defines a legal abstract class?" +
                "\td - e - f");
        System.out.println("13.2 The getArea() and getPerimeter() methods may be removed from the\n" +
                "GeometricObject class. What are the benefits of defining getArea() and\n" +
                "getPerimeter() as abstract methods in the GeometricObject class?" +
                "\n\tNote that you could not define the equalArea method for comparing whether two geometric\n" +
                "\tobjects have the same area if the getArea method were not defined in GeometricObject.");
        System.out.println("13.3 True or false?\n" +
                "a. An abstract class can be used just like a nonabstract class except that you cannot\n" +
                "use the new operator to create an instance from the abstract class.TRUE\n" +
                "b. An abstract class can be extended.TRUE\n" +
                "c. A subclass of a nonabstract superclass cannot be abstract.FALSE\n" +
                "d. A subclass cannot override a concrete method in a superclass to define it as abstract.FALSE\n" +
                "e. An abstract method must be nonstatic.TRUE");

        // jump

        System.out.println("13.9 Can you create a Calendar object using the Calendar class? FALSE\n" +
                "13.10 Which method in the Calendar class is abstract? -->  add method\n" +
                "13.11 How do you create a Calendar object for the current time? with a subclass's no arg constructer\n" +
                "13.12 For a Calendar object c, how do you get its year, month, date, hour, minute, and" +
                "second?" + "\nc.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE), c.get(Calendar.HOUR), c.get(Calendar.MINUTE) , c.get(Calendar.SECOND)");
        System.out.println("13.13 Suppose A is an interface. Can you create an instance using new A()? NO\n" +
                "13.14 Suppose A is an interface. Can you declare a reference variable x with type A like this?\n" +
                "A x; YES");
        System.out.println("13.15 Which of the following is a correct interface? --> b");
        System.out.println("13.16 Show the error in the following code -->  void method in interface A must be abstract");
        System.out.println("13.17 True or false? If a class implements Comparable, the object of the class can invoke\n" +
                "the compareTo method. --> YES");
        System.out.println("13.18 Which of the following is the correct method header for the compareTo method in\n" +
                "the String class? --> public compareTo(String o)");
        System.out.println("13.19 Can the following code be compiled? Why?\n" +
                "Integer n1 = new Integer(3);\n" +
                "Object n2 = new Integer(4);\n" +
                "System.out.println(n1.compareTo(n2)); -->No to use compareTo method argument must be Integer type!");
        System.out.println("13.20 You can define the compareTo method in a class without implementing the\n" +
                "Comparable interface. What are the benefits of implementing the Comparable\n" +
                "interface? YES Benefits --> It enable user to understand which method to use.");
        System.out.println("13.22 Can you invoke the clone() method to clone an object if the class for the object\n" +
                "does not implement the java.lang.Cloneable? Does the Date class implement\n" +
                "Cloneable? --> If you change its visibility modifier you can use clone() method. Date class implements Cloneable interface");
        System.out.println("13.23 What would happen if the House class (defined in Listing 13.11) did not override the\n" +
                "clone() method or if House did not implement java.lang.Cloneable? --> Java would receive a syntax error!");
        System.out.println("13.27 Give an example to show why interfaces are preferred over abstract classes. --> More flexible! ");
        System.out.println("13.28 Define the terms abstract classes and interfaces. What are the similarities and differences\n" +
                "between abstract classes and interfaces? ");//TODO
        System.out.println("True or false?\n" +
                "a. An interface is compiled into a separate bytecode file.TRUE\n" +
                "b. An interface can have static methods.\n" +
                "c. An interface can extend one or more interfaces.TRUE\n" +
                "d. An interface can extend an abstract class.FALSE\n" +
                "e. An interface can have default methods.");
        System.out.println("13.31 Why is the following code wrong? --> Compile error because compareTo method expect from the user a Rational reference type");
        System.out.println("13.32 Why is the following code wrong? --> The compareTo(Rational) method requires a Rational type object in the parameter in the Rational class.");
        System.out.println("13.33 How do you simplify the code in lines 82–85 in Listing 13.13 Rational.java using one\n" +
                "line of code without using the if statement?return (this.subtract((Rational)(other))).getNumerator() == 0 ? true : false;");
    }

}
