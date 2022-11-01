package Chapters.chapter_10.exercise_10.exercise10_03;

public class MyInteger {
    /*
    ■ An int data field named value that stores the int value represented by this
object.
■ A constructor that creates a MyInteger object for the specified int value.
■ A getter method that returns the int value.
■ The methods isEven(), isOdd(), and isPrime() that return true if the
value in this object is even, odd, or prime, respectively.
■ The static methods isEven(int), isOdd(int), and isPrime(int) that
return true if the specified value is even, odd, or prime, respectively.
■ The static methods isEven(MyInteger), isOdd(MyInteger), and
isPrime(MyInteger) that return true if the specified value is even, odd,
or prime, respectively.
■ The methods equals(int) and equals(MyInteger) that return true if
the value in this object is equal to the specified value.
■ A static method parseInt(char[]) that converts an array of numeric
characters to an int value.
■ A static method parseInt(String) that converts a string into an int
value.
     */

    private int value;

    public MyInteger() {
        this(1);
    }
    public MyInteger(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return getValue() % 2 == 0;
    }

    public boolean isOdd() {
        return !isEven();
    }

    public boolean isPrime() {
        for (int i = 2; i < getValue() / 2; i++) {
            if (getValue() % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int parseInt(char[] arr) {
        int sum = 0;
        int pow = 0;
        for (int i = arr.length -1; i >= 0; i--) {
            if(!Character.isDigit(arr[i])) {
                System.out.println("All the characters in the array needs to be a numeric type!");
                System.exit(1);
            }
            sum += (arr[i] - '0') * Math.pow(10, pow++);
        }
        return sum;
    }
    public static int parseInt(String number) {
        return parseInt(number.toCharArray());
    }

    public boolean equals(int value) {
        return getValue() == value;
    }

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }
    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }
    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }


}
