package Chapters.chapter_10.checkpoint_10;

public class Checkpoint10_01 {
    public static void main(String[] args) {

        //10.01
        System.out.println("10.1 If you redefine the Loan class in Listing 10.2 without setter methods, is the class\n" +
                "immutable?");
        System.out.println("10.01 -- > No, you can access loanDate field which is a Date object.\n" +
                "Since Date object mutable Loan object is also mutable.");

        System.out.println("10.2 Is the BMI class defined in Listing 10.4 immutable?\n");
        System.out.println("10.02 -- > Yes, although you can access the name field,\n" +
                " String objects are immutable so the BMI object is immutable");
        System.out.println("\n10.3 What are common relationships among classes?\n\n"+
                "10.03 --> association, aggregation, composition, and inheritance");
        System.out.println("\n10.4 What is association? What is aggregation? What is composition?\n\n" +
                "10.04 --> " +
                "association = Association is a general binary relationship that describes an activity between two classes.\n" +
                "aggregation = Aggregation is a special form of association that represents an ownership relationship between\n" +
                "two objects.\n" +
                "composition = If an object is exclusively owned by an aggregating object,\n" + "the relationship between the object and its aggregating object\n" +
                "is referred to as a composition.");
        System.out.println("\n10.5 What is UML notation of aggregation and composition?");
        System.out.println("\n10.05 --> Aggregation: empty diamond on the aggregating class. Composition: Solid diamond on the aggregating class.");
        System.out.println("\n10.6 Why both aggregation and composition are together referred to as composition?");
        System.out.println("\n10.06 --> Since aggregation and composition relationships are represented using classes in the same way,\n" +
                " we will not differentiate them and call both compositions for simplicity.");


    }
}
