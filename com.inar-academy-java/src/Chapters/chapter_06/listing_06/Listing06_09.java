public class Listing06_09 {
    public static void main(String[] args) {
        System.out.println("The maximum of 3 and  4 is " + max(3,4));

        //Invoke the max method with double parameters
        System.out.println("The maximum of 3.0 and 4.0 is " + max(3.0, 4.0));

        //Invoking the max method with three double parameters
        System.out.println("The maximum of 3.0 5.4 and 10.14 is " + max(3.0, 5.4, 10.14));
    }
    public static int max(int n1, int n2){
        return (n1 > n2) ? n1 : n2;
    }

    public static double max(double n1, double n2){
        return (n1 > n2) ? n1 : n2;
    }

    public static double max(double n1, double n2, double n3){
        return max(max(n1, n2), n3);
    }
}
