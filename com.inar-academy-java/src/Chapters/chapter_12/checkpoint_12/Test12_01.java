package Chapters.chapter_12.checkpoint_12;

public class Test12_01 {
    public static void main(String[] args) {

        // Object o = null;
        // System.out.println(o.toString());
        try {
            method();
            System.out.println("After the method call");
        } catch (RuntimeException ex) {
            System.out.println("RuntimeException in main");
        } catch (Exception ex) {
            System.out.println("Exception in main");
        }
    }

    static void method() throws Exception {
        try {
            String s = "abc";
            System.out.println(s.charAt(3));
        } catch (RuntimeException ex) {
            System.out.println("RuntimeException in method()");
        } catch (Exception ex) {
            System.out.println("Exception in method()");
        }
    }

    public void m(int value) throws Exception  {
        if (value < 40)
            try {
                throw new Exception("value is too small");
            }
        catch (Exception ex) {}
    }
}
