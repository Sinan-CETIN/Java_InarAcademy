import java.util.Scanner;

public class Exercise04_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters:");
        String status = input.next();

        if(status.length() != 2){
            System.out.println("Invalid status!!");
            System.exit(1);
        }
        switch(status.toUpperCase().charAt(0)) {
            case 'M':
                System.out.print("Mathematics ");
                break;
            case 'C':
                System.out.print("Computer Science ");
                break;
            case 'I':
                System.out.print("Information Technology ");
                break;
            default:
                System.out.print("Invalid major input!!");
                System.exit(2);
        }
        switch(status.charAt(1)){
            case '1':
                System.out.println("Freshman");break;
            case '2':
                System.out.println("Sophomore");break;
            case '3':
                System.out.println("junior");break;
            case '4':
                System.out.println("Senior");break;
            default :
                System.out.println("!!Invalid grade input!!");
                System.exit(3);
        }
    }
}

