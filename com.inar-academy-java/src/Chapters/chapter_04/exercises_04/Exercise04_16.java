public class Exercise04_16 {
    public static void main(String[] args) {
       //random uppercase letter
        char ch = (char)('A' + Math.random() * ('Z' - 'A'));
        System.out.println(ch);
    }
}
