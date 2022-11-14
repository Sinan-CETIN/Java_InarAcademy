package Chapters.chapter_12.listing_12;

public class Listing12_06 {
    public static void main(String[] args) {
        try {
            System.out.println(sum(new int[]{10, 2, 3, 4, 5}));
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("\n" + ex.getMessage());
            System.out.println("\n" + ex.toString());

            System.out.println("\nTrace Info Obtained from getStackTrace");
            StackTraceElement[] traceElements = ex.getStackTrace();
            for (int i = 0; i < traceElements.length; i++) {
                System.out.print("method " + traceElements[i].getMethodName() + ":" +
                        "(" + traceElements[i].getClassName() + ":" +
                        traceElements[i].getLineNumber() + ")\n");

            }
        }
    }

    public static int sum(int[] array) {
        int result = 0;
        for (int i = 0; i <= array.length; i++) {
            result += array[i];
        }
        return result;
    }
}
