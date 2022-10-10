public class Checkpoit04_01 {
    public static void main(String[] args) {

        //4.1
        System.out.println("Math.sqrt(4) " + Math.sqrt(4) + "\n" +
                "Math.sin(2 * Math.PI) " + Math.sin(2 * Math.PI) +
                "\nMath.cos(2 * Math.PI) " + Math.cos(2 * Math.PI) +
                "\nMath.pow(2, 2) " + Math.pow(2, 2) +
                "\nMath.log(Math.E) " + Math.log(Math.E) +
                "\nMath.exp(1) " + Math.exp(1) +
                "\nMath.max(2, Math.min(3, 4))" + Math.max(2, Math.min(3, 4)) +
                "\nMath.ceil(-2.5) " + Math.ceil(-2.5) +
                "\nMath.floor(-2.5) " + Math.floor(-2.5) +
                "\nMath.round(-2.5f) " + Math.round(-2.5f) +
                "\nMath.round(-2.5) " + Math.round(-2.5) +
                "\nMath.rint(2.5) " + Math.rint(2.5) +
                "\nMath.ceil(2.5) " + Math.ceil(2.5) +
                "\nMath.floor(2.5) " + Math.floor(2.5) +
                "\nMath.round(2.5f) " + Math.round(2.5f) +
                "\nMath.round(2.5) " + Math.round(2.5) +
                "\nMath.round(Math.abs(-2.5)) " + Math.round(Math.abs(-2.5)));

        //4.3
        System.out.println(" Math.toRadians(47) "+ Math.toRadians(47));

        //4.4
        double degree = Math.toDegrees(Math.PI / 7);
        System.out.println(degree);

        //4.5
        System.out.println("(int)(34 + Math.random() * (55 - 34))" + (int)(34 + Math.random() * (55 - 34)));
        System.out.println("(int)(Math.random() * 999) " +(int)(Math.random() * 999));
        System.out.println("5.5 + Math.random() * 50 " +5.5 + Math.random() * 50);

        //4.7
        System.out.println("Math.log(Math.exp(5.5)) " + Math.log(Math.exp(5.5)));
        System.out.println("Math.exp(Math.log(5.5)) " + Math.exp(Math.log(5.5)));
        System.out.println("Math.asin(Math.sin(Math.PI / 6)) " + Math.asin(Math.sin(Math.PI / 6)));
        System.out.println("Math.sin(Math.asin(Math.PI / 6))" + Math.sin(Math.asin(Math.PI / 6)));
    }
}
