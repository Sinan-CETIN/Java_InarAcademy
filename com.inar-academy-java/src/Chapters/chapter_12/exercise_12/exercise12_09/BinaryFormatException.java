package Chapters.chapter_12.exercise_12.exercise12_09;

public class BinaryFormatException extends NumberFormatException {
    private String binaryString;

    public BinaryFormatException() {
        this(null);
    }

    public BinaryFormatException(String binaryString) {
        super(binaryString + " is not a binary value!!");
        this.binaryString = binaryString;
    }

    public String getBinaryString() {
        return this.binaryString;
    }
}
