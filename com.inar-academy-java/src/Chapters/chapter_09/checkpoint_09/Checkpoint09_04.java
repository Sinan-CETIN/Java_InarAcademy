package Chapters.chapter_09.checkpoint_09;

public class Checkpoint09_04 {
    public static void main(String[] args) {
        System.out.println("9.20 What is an accessor method? What is a mutator method? What are the naming conventions\n" +
                "for accessor methods and mutator methods?\n" +
                "9.21 What are the benefits of data field encapsulation?\n" +
                "9.22 In the following code, radius is private in the Circle class, and myCircle is an\n" +
                "object of the Circle class. Does the highlighted code cause any problems? If so,\n" +
                "explain why.");
        System.out.println("\n9.20 --> make posible for you to acces private data field also known as getter method\n" +
                "mutator is let you change the value of private data field also known as setter method\n");
        System.out.println("9.21 --> Prevent tampering and easy to maintain and less vulnarable");
        System.out.println("\n9.22 --> that is not a problem.Because main method and private radius data field are in the same class");

        System.out.println("9.27 --> Reference variable in the array not initiliazed" +
                "\n(Line 4 prints null since dates[0] is null. Line 5 causes a NullPointerException since it invokes toString() method from the null reference.)");

        System.out.println("9.28 If a class contains only private data fields and no setter methods, is the class immutable?\n" +
                "9.29 If all the data fields in a class are private and of primitive types, and the class doesn’t\n" +
                "contain any setter methods, is the class immutable?");
        System.out.println("\n9.28 --> No");
        System.out.println("\n9.29 --> Yes");
    }
}
