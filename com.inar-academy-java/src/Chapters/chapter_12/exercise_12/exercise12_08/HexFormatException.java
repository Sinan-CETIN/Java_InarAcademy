package Chapters.chapter_12.exercise_12.exercise12_08;

public class HexFormatException extends NumberFormatException{
    private String hexString;

    public HexFormatException() {
        this(null);
    }
    public HexFormatException(String hexString) {
        super(hexString  + " is not a hex value!");
        this.hexString = hexString;
    }

    public String getHexString() {
        return this.hexString;
    }

}
