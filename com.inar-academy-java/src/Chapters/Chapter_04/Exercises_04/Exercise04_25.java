public class Exercise04_25 {
    public static void main(String[] args) {
        char ch1 = (char)('A' + Math.random() * ('Z' - 'A'));
        char ch2 = (char)('A' + Math.random() * ('Z' - 'A'));
        char ch3 = (char)('A' + Math.random() * ('Z' - 'A'));
        int number1 = (int)(Math.random() * 9);
        int number2 = (int)(Math.random() * 9);
        int number3 = (int)(Math.random() * 9);
        int number4 = (int)(Math.random() * 9);

        String vehiclePlateNumber = ""+ ch1 + ch2 + ch3 + " " + number1 + number2 + number3 + number4;
        System.out.println("Vehicle Plate Number is " + vehiclePlateNumber);
    }
}
