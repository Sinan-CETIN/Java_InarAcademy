import java.util.Scanner;

public class Exercise06_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = input.nextInt();
        System.out.print("Enter n2: ");
        int n2 = input.nextInt();
        System.out.print("Enter n3: ");
        int n3 = input.nextInt();
        System.out.print("Sorted " + n1 + "," + n2 + " and " + n3 + " is " );
        sort(n1, n2, n3);
    }
    public static void sort(int n1, int n2, int n3){
       if (n1 < n2 && n1 < n3){
           int temp = n1;
           n1 = n3;
           n3 = temp;
           if (n1 < n2){
               temp = n1;
               n1 = n2;
               n2 = temp;
           }
       }
       else if (n1 < n2 || n1 < n3){
           if(n2 < n3){
               int temp = n2;
               n2 = n3;
               n3 = temp;
           }
           int temp = n1;
           n1 = n2;
           n2 = temp;
       }
       else{
           if (n2 < n3){
               int temp = n2;
               n2 = n3;
               n3 = temp;
           }
       }
        System.out.println(n1 + " , " + n2 + " , " + n3);
    }
}
