import java.util.Scanner ;
 
public class Exercise02_13 {
        public static void main(String[] args){
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the monthly saving amount: ");
		double saveAmount = input.nextDouble();
		double sum = saveAmount * (1 + 0.05 / 12);
		sum = (sum + saveAmount) * (1 + 0.05 / 12);
		sum = (sum + saveAmount) * (1 + 0.05 / 12);
		sum = (sum + saveAmount) * (1 + 0.05 / 12);
		sum = (sum + saveAmount) * (1 + 0.05 / 12);
		sum = (sum +  saveAmount) * (1 + 0.05 / 12);
		System.out.println("After the sixth month, the account value is $" + sum);
	}
}
