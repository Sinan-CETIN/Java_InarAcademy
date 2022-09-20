import java.util.Scanner ;

public class Exercise02_11 {
        public static void main(String[] args){
                Scanner input = new Scanner(System.in);
		int population = 12032486;
		int birth=((365 * 24 * 60 * 60 ) / 7);
		int death=((365 * 24 * 60 * 60 ) / 13);
		int immigrant=((365 * 24 * 60 * 60 / 45));
		int increaseInOneYear = birth + immigrant - death;
		System.out.print("Enter number of Years :");
		int year = input.nextInt();
		System.out.print("The population in"  + year +  " years is " + (population + (increaseInOneYear * year)));
	}
}
