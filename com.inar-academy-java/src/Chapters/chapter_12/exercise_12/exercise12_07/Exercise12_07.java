package Chapters.chapter_12.exercise_12.exercise12_07;

import java.util.Scanner;

public class Exercise12_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter an binary value -> ");
            String binaryValue = input.nextLine();
            System.out.println("Binary value " + binaryValue + " | " + "Decimal Value " + binToDec(binaryValue));
        } catch(NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int binToDec(String binaryValue) {
        int result = 0;
        int pow = binaryValue.length() - 1;
        for (int i = 0; i < binaryValue.length(); i++) {
            if (!isLegalBinaryValue(binaryValue.charAt(i))) {
                throw new NumberFormatException(binaryValue + " is not a binary value!!");
            }
            result += Math.pow(2, pow--) * Integer.parseInt(binaryValue.charAt(i) + "");
        }
        return result;
    }

    public static boolean isLegalBinaryValue(char ch) {
        if(ch == '0' || ch =='1'){
            return true;
        }
        return false;
    }
}
